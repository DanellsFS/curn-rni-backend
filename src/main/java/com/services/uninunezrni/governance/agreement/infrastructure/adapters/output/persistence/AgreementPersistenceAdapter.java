package com.services.uninunezrni.governance.agreement.infrastructure.adapters.output.persistence;

import com.services.uninunezrni.governance.agreement.application.ports.output.AgreementPersistencePort;
import com.services.uninunezrni.governance.agreement.domain.model.Agreement;
import com.services.uninunezrni.governance.agreement.infrastructure.adapters.output.persistence.mapper.AgreementPersistenceMapper;
import com.services.uninunezrni.governance.agreement.infrastructure.adapters.output.persistence.repository.AgreementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class AgreementPersistenceAdapter implements AgreementPersistencePort {

    private final AgreementRepository repository;
    private final AgreementPersistenceMapper mapper;

    @Override
    public Agreement save(Agreement agreement) {
        return mapper.toAgreement(repository.save(mapper.toAgreementEntity(agreement)));
    }

    @Override
    public Optional<Agreement> findById(Long id) {
        return repository.findById(id)
                .map(mapper::toAgreement);
    }

    @Override
    public List<Agreement> findAll() {
        return mapper.toAgreementList(repository.findAll());
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
