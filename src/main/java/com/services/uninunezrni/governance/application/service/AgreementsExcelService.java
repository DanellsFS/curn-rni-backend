package com.services.uninunezrni.governance.application.service;

import com.services.uninunezrni.governance.application.ports.input.AgreementsExcelServicePort;
import com.services.uninunezrni.governance.application.ports.output.AgreementsExcelPersistencePort;
import com.services.uninunezrni.governance.domain.exception.AgreementsExcelNotFoundException;
import com.services.uninunezrni.governance.domain.model.AgreementsExcel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AgreementsExcelService implements AgreementsExcelServicePort {

    private final AgreementsExcelPersistencePort persistencePort;

    @Override
    public AgreementsExcel save(AgreementsExcel agreementsExcel) {
        return persistencePort.save(agreementsExcel);
    }

    @Override
    public AgreementsExcel findById(Long id) {
        return persistencePort.findById(id)
                .orElseThrow(AgreementsExcelNotFoundException::new);
    }

    @Override
    public List<AgreementsExcel> findAll() {
        return persistencePort.findAll();
    }

    @Override
    public AgreementsExcel update(Long id, AgreementsExcel agreementsExcel) {
        return persistencePort.findById(id)
                .map(savedAgreementsExcel -> {
                    savedAgreementsExcel.setExcelLink(agreementsExcel.getExcelLink());
                    return persistencePort.save(savedAgreementsExcel);
                })
                .orElseThrow(AgreementsExcelNotFoundException::new);
    }

    @Override
    public void deleteById(Long id) {
        if (persistencePort.findById(id).isEmpty()) {
            throw new AgreementsExcelNotFoundException();
        }
        persistencePort.deleteById(id);
    }
}
