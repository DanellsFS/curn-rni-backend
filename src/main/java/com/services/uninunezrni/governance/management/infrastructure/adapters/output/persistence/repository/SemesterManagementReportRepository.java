package com.services.uninunezrni.governance.management.infrastructure.adapters.output.persistence.repository;

import com.services.uninunezrni.governance.management.infrastructure.adapters.output.persistence.entity.SemesterManagementReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SemesterManagementReportRepository extends JpaRepository<SemesterManagementReportEntity, Long> {
}
