package com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.repository.agreement;

import com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.entity.agreement.NewAgreementEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewAgreementRepository extends JpaRepository<NewAgreementEntity, Long> {
}
