package com.services.uninunezrni.governance.application.ports.input;

import com.services.uninunezrni.governance.domain.model.Operationalization;

import java.util.List;

public interface OperationalizationServicePort {

    Operationalization findById(Long id);
    List<Operationalization> findAll();
    Operationalization save(Operationalization operationalization);
    Operationalization update(Long id, Operationalization operationalization);
    void deleteById(Long id);

}
