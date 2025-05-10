package com.services.uninunezrni.governance.infrastructure.adapters;

import com.services.uninunezrni.governance.application.ports.output.AgreementsExcelPersistencePort;
import com.services.uninunezrni.governance.domain.model.AgreementsExcel;
import com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.mapper.AgreementsExcelPersistenceMapper;
import com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.repository.AgreementsExcelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class AgreementsExcelPersistenceAdapter implements AgreementsExcelPersistencePort {

    private final AgreementsExcelRepository repository;
    private final AgreementsExcelPersistenceMapper mapper;

    @Override
    public AgreementsExcel save(AgreementsExcel agreementsExcel) {
        return mapper.toAgreementsExcel(repository.save(mapper.toAgreementsExcelEntity(agreementsExcel)));
    }

    @Override
    public Optional<AgreementsExcel> findById(Long id) {
        return repository.findById(id)
                .map(mapper::toAgreementsExcel);
    }

    @Override
    public List<AgreementsExcel> findAll() {
        return mapper.toAgreementsExcelList(repository.findAll());
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
