package com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.repository.management;

import com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.entity.management.SemesterManagementReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SemesterManagementReportRepository extends JpaRepository<SemesterManagementReportEntity, Long> {
}
