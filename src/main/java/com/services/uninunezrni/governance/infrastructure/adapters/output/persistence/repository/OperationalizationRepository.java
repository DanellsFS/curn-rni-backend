package com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.repository;

import com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.entity.OperationalizationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationalizationRepository extends JpaRepository<OperationalizationEntity, Long> {
}
