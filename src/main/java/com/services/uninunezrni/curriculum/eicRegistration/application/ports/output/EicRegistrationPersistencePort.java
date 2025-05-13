package com.services.uninunezrni.curriculum.eicRegistration.application.ports.output;

import com.services.uninunezrni.curriculum.eicRegistration.domain.model.EicRegistration;

import java.util.List;
import java.util.Optional;

public interface EicRegistrationPersistencePort {

    Optional<EicRegistration> findById(Long id);
    List<EicRegistration> findAll();
    EicRegistration save(EicRegistration eicRegistration);
    void deleteById(Long id);
}
