package com.services.uninunezrni.governance.application.ports.output.agreement;

import com.services.uninunezrni.governance.domain.model.agreement.Agreement;

import java.util.List;
import java.util.Optional;

public interface AgreementPersistencePort {
    Agreement save(Agreement agreement);
    Optional<Agreement> findById(Long id);
    List<Agreement> findAll();
    void deleteById(Long id);
}
