package com.services.uninunezrni.governance.application.service;

import com.services.uninunezrni.governance.application.ports.input.AgreementServicePort;
import com.services.uninunezrni.governance.application.ports.output.AgreementPersistencePort;
import com.services.uninunezrni.governance.domain.exception.AgreementNotFoundException;
import com.services.uninunezrni.governance.domain.model.Agreement;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AgreementService implements AgreementServicePort {

    private final AgreementPersistencePort persistencePort;

    @Override
    public Agreement save(Agreement agreement) {
        return persistencePort.save(agreement);
    }

    @Override
    public Agreement findById(Long id) {
        return persistencePort.findById(id)
                .orElseThrow(AgreementNotFoundException::new);
    }

    @Override
    public List<Agreement> findAll() {
        return persistencePort.findAll();
    }

    @Override
    public Agreement update(Long id, Agreement agreement) {
        return persistencePort.findById(id)
                .map(savedAgreement -> {
                    savedAgreement.setName(agreement.getName());
                    savedAgreement.setType(agreement.getType());
                    savedAgreement.setDateStart(agreement.getDateStart());
                    savedAgreement.setDateEnd(agreement.getDateEnd());
                    return persistencePort.save(savedAgreement);
                })
                .orElseThrow(AgreementNotFoundException::new);
    }

    @Override
    public void deleteById(Long id) {
        if (persistencePort.findById(id).isEmpty()) {
            throw new AgreementNotFoundException();
        }
        persistencePort.deleteById(id);
    }
}
