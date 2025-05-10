package com.services.uninunezrni.governance.infrastructure.adapters;

import com.services.uninunezrni.governance.application.ports.output.NewAgreementPersistencePort;
import com.services.uninunezrni.governance.domain.model.NewAgreement;
import com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.mapper.NewAgreementPersistenceMapper;
import com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.repository.NewAgreementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class NewAgreementPersistenceAdapter implements NewAgreementPersistencePort {
    private final NewAgreementRepository repository;
    private final NewAgreementPersistenceMapper mapper;

    @Override
    public NewAgreement save(NewAgreement newAgreement) {
        return mapper.toNewAgreement(repository.save(mapper.toNewAgreementEntity(newAgreement)));
    }

    @Override
    public Optional<NewAgreement> findById(Long id) {
        return repository.findById(id)
                .map(mapper::toNewAgreement);
    }

    @Override
    public List<NewAgreement> findAll() {
        return mapper.toNewAgreementList(repository.findAll());
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
