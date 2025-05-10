package com.services.uninunezrni.governance.application.ports.output.agreement;

import com.services.uninunezrni.governance.domain.model.agreement.Operationalization;

import java.util.Optional;
import java.util.List;

public interface OperationalizationPersistencePort {

    Optional<Operationalization> findById(Long id);
    List<Operationalization> findAll();
    Operationalization save(Operationalization operationalization);
    void deleteById(Long id);
}
