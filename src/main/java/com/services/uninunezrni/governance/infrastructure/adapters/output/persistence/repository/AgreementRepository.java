package com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.repository;

import com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.entity.AgreementEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgreementRepository extends JpaRepository<AgreementEntity, Long> {
}
