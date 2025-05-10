package com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.agreement;

import com.services.uninunezrni.governance.application.ports.output.agreement.AgreementPersistencePort;
import com.services.uninunezrni.governance.domain.model.agreement.Agreement;
import com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.mapper.agreement.AgreementPersistenceMapper;
import com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.repository.agreement.AgreementRepository;
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
