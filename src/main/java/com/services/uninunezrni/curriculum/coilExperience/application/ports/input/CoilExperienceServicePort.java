package com.services.uninunezrni.curriculum.coilExperience.application.ports.input;

import com.services.uninunezrni.curriculum.coilExperience.domain.model.CoilExperience;

import java.util.List;

public interface CoilExperienceServicePort {

    CoilExperience findById(Long id);
    List<CoilExperience> findAll();
    CoilExperience save(CoilExperience coilExperience);
    CoilExperience update(Long id, CoilExperience coilExperience);
    void deleteById(Long id);

}
