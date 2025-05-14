package com.services.uninunezrni.governance.agreement.infrastructure.adapters.output.persistence.repository;

import com.services.uninunezrni.governance.agreement.infrastructure.adapters.output.persistence.entity.AgreementsExcelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgreementsExcelRepository extends JpaRepository<AgreementsExcelEntity, Long> {
}
