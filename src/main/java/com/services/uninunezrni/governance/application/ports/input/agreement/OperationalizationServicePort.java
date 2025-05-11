package com.services.uninunezrni.governance.application.ports.input.agreement;

import com.services.uninunezrni.governance.domain.model.agreement.Operationalization;

import java.util.List;

public interface OperationalizationServicePort {
    Operationalization save(Operationalization operationalization);
    Operationalization findById(Long id);
    List<Operationalization> findAll();
    Operationalization update(Long id, Operationalization operationalization);
    void deleteById(Long id);
}
