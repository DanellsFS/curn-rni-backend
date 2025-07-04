package com.services.uninunezrni.curriculum.eicRegistration.application.ports.input;

import com.services.uninunezrni.curriculum.eicRegistration.domain.model.EicRegistration;

import java.util.List;

public interface EicRegistrationServicePort {

    EicRegistration findById(Long id);
    List<EicRegistration> findAll();
    EicRegistration save(EicRegistration eicRegistration);
    EicRegistration update(Long id, EicRegistration eicRegistration);
    void deleteById(Long id);

}
