package com.services.uninunezrni.governance.application.service;

import com.services.uninunezrni.governance.application.ports.input.OperationalizationServicePort;
import com.services.uninunezrni.governance.application.ports.output.OperationalizationPersistencePort;
import com.services.uninunezrni.governance.domain.exception.OperationalizationNotFoundException;
import com.services.uninunezrni.governance.domain.model.Operationalization;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OperationalizationService implements OperationalizationServicePort {

    private final OperationalizationPersistencePort persistencePort;

    @Override
    public Operationalization findById(Long id) {
        return persistencePort.findById(id)
                .orElseThrow(OperationalizationNotFoundException::new);
    }

    @Override
    public List<Operationalization> findAll() {
        return persistencePort.findAll();
    }

    @Override
    public Operationalization save(Operationalization operationalization) {
        return persistencePort.save(operationalization);
    }

    @Override
    public Operationalization update(Long id, Operationalization operationalization) {
        return persistencePort.findById(id)
                .map(savedoperationalization -> {
                    savedoperationalization.setOperationalization(operationalization.getOperationalization());
                    return persistencePort.save(savedoperationalization);
                })
                .orElseThrow(OperationalizationNotFoundException::new);
    }

    @Override
    public void deleteById(Long id) {
        if (persistencePort.findById(id).isEmpty()  ) {
            throw new OperationalizationNotFoundException();
        }
        persistencePort.deleteById(id);
    }
}
