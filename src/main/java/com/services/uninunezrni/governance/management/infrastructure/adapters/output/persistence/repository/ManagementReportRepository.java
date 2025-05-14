package com.services.uninunezrni.governance.management.infrastructure.adapters.output.persistence.repository;

import com.services.uninunezrni.governance.management.infrastructure.adapters.output.persistence.entity.ManagementReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagementReportRepository extends JpaRepository<ManagementReportEntity, Long> {
}
