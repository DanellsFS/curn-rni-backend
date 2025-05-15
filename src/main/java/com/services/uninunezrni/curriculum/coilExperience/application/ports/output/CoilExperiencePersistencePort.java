package com.services.uninunezrni.curriculum.coilExperience.application.ports.output;

import com.services.uninunezrni.curriculum.coilExperience.domain.model.CoilExperience;

import java.util.List;
import java.util.Optional;

public interface CoilExperiencePersistencePort {

    Optional<CoilExperience> findById(Long id);
    List<CoilExperience> findAll();
    CoilExperience save(CoilExperience coilExperience);
    void deleteById(Long id);

}
