package com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.repository.management;

import com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.entity.management.ManagementIndicatorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagementIndicatorRepository extends JpaRepository<ManagementIndicatorEntity, Long> {
}
