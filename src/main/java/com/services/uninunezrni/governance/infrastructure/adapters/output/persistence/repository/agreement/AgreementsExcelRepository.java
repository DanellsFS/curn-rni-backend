package com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.repository.agreement;

import com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.entity.agreement.AgreementsExcelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgreementsExcelRepository extends JpaRepository<AgreementsExcelEntity, Long> {
}
