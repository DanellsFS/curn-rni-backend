package com.services.uninunezrni.governance.agreement.application.ports.output;

import com.services.uninunezrni.governance.agreement.domain.model.Operationalization;

import java.util.Optional;
import java.util.List;

public interface OperationalizationPersistencePort {
    Operationalization save(Operationalization operationalization);
    Optional<Operationalization> findById(Long id);
    List<Operationalization> findAll();
    void deleteById(Long id);
}
