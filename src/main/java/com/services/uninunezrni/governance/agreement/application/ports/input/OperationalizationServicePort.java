package com.services.uninunezrni.governance.agreement.application.ports.input;

import com.services.uninunezrni.governance.agreement.domain.model.Operationalization;

import java.util.List;

public interface OperationalizationServicePort {
    Operationalization save(Operationalization operationalization);
    Operationalization findById(Long id);
    List<Operationalization> findAll();
    Operationalization update(Long id, Operationalization operationalization);
    void deleteById(Long id);
}
