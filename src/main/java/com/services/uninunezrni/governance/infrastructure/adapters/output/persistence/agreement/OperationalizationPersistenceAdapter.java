package com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.agreement;

import com.services.uninunezrni.governance.application.ports.output.agreement.OperationalizationPersistencePort;
import com.services.uninunezrni.governance.domain.model.agreement.Operationalization;
import com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.mapper.agreement.OperationalizationPersistenceMapper;
import com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.repository.agreement.OperationalizationRepository;
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
    public Optional<Operationalization> findById(Long id) {
        return repository.findById(id)
                .map(mapper::toOperationalization);
    }

    @Override
    public List<Operationalization> findAll() {
        return mapper.toOperationalizationList(repository.findAll());
    }

    @Override
    public Operationalization save(Operationalization operationalization) {
        return mapper.toOperationalization(repository.save(mapper.toOperationalizationEntity(operationalization)));
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
