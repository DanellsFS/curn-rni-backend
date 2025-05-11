package com.services.uninunezrni.governance.application.ports.output.agreement;

import com.services.uninunezrni.governance.domain.model.agreement.Operationalization;

import java.util.Optional;
import java.util.List;

public interface OperationalizationPersistencePort {
    Operationalization save(Operationalization operationalization);
    Optional<Operationalization> findById(Long id);
    List<Operationalization> findAll();
    void deleteById(Long id);
}
