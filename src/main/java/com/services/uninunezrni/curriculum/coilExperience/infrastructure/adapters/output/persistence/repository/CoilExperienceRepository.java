package com.services.uninunezrni.curriculum.coilExperience.infrastructure.adapters.output.persistence.repository;

import com.services.uninunezrni.curriculum.coilExperience.infrastructure.adapters.output.persistence.entity.CoilExperienceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoilExperienceRepository extends JpaRepository<CoilExperienceEntity, Long> {
}
