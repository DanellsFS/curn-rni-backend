package com.services.uninunezrni.curriculum.eicRegistration.infrastructure.adapters.output.persistence;

import com.services.uninunezrni.curriculum.eicRegistration.application.ports.output.EicRegistrationPersistencePort;
import com.services.uninunezrni.curriculum.eicRegistration.domain.model.EicRegistration;
import com.services.uninunezrni.curriculum.eicRegistration.infrastructure.adapters.output.persistence.mapper.EicRegistrationPersistenceMapper;
import com.services.uninunezrni.curriculum.eicRegistration.infrastructure.adapters.output.persistence.repository.EicRegistrationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class EicRegistrationPersistenceAdapter implements EicRegistrationPersistencePort {

    private final EicRegistrationRepository repository;
    private final EicRegistrationPersistenceMapper mapper;

    @Override
    public Optional<EicRegistration> findById(Long id) {
        return repository.findById(id)
                .map(mapper::toEicRegistration);
    }

    @Override
    public List<EicRegistration> findAll() {
        return mapper.toEicRegistrationList(repository.findAll());
    }

    @Override
    public EicRegistration save(EicRegistration eicRegistration) {
        return mapper.toEicRegistration(repository.save(mapper. toEicRegistrationEntity(eicRegistration)));
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
