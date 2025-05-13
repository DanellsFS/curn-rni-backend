package com.services.uninunezrni.curriculum.eicRegistration.infrastructure.adapters.output.persistence.repository;

import com.services.uninunezrni.curriculum.eicRegistration.infrastructure.adapters.output.persistence.entity.EicRegistrationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EicRegistrationRepository extends JpaRepository<EicRegistrationEntity, Long> {
}
