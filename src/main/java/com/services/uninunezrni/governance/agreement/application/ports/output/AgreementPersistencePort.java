package com.services.uninunezrni.governance.agreement.application.ports.output;

import com.services.uninunezrni.governance.agreement.domain.model.Agreement;

import java.util.List;
import java.util.Optional;

public interface AgreementPersistencePort {
    Agreement save(Agreement agreement);
    Optional<Agreement> findById(Long id);
    List<Agreement> findAll();
    void deleteById(Long id);
}
