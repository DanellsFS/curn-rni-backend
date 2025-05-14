package com.services.uninunezrni.governance.agreement.infrastructure.adapters.output.persistence;

import com.services.uninunezrni.governance.agreement.application.ports.output.OperationalizationPersistencePort;
import com.services.uninunezrni.governance.agreement.domain.model.Operationalization;
import com.services.uninunezrni.governance.agreement.infrastructure.adapters.output.persistence.mapper.OperationalizationPersistenceMapper;
import com.services.uninunezrni.governance.agreement.infrastructure.adapters.output.persistence.repository.OperationalizationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class OperationalizationPersistenceAdapter implements OperationalizationPersistencePort {

    private final OperationalizationRepository repository;
    private final OperationalizationPersistenceMapper mapper;

    @Override
    public Operationalization save(Operationalization operationalization) {
        return mapper.toOperationalization(repository.save(mapper.toOperationalizationEntity(operationalization)));
    }

    @Override
    public Optional<Operationalization> findById(Long id) {
        return repository.findById(id)
                .map(mapper::toOperationalization);
    }

    @Override
    public List<Operationalization> findAll() {
        return mapper.toOperationalizationList(repository.findAll());
    }


    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
