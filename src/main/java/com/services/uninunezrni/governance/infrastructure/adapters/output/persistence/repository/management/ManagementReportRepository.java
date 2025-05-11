package com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.repository.management;

import com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.entity.management.ManagementReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagementReportRepository extends JpaRepository<ManagementReportEntity, Long> {
}
