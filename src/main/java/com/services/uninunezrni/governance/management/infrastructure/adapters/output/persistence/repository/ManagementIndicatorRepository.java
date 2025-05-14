package com.services.uninunezrni.governance.management.infrastructure.adapters.output.persistence.repository;

import com.services.uninunezrni.governance.management.infrastructure.adapters.output.persistence.entity.ManagementIndicatorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagementIndicatorRepository extends JpaRepository<ManagementIndicatorEntity, Long> {
}
