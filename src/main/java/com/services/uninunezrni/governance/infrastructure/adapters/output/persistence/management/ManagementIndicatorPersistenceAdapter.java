package com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.management;

import com.services.uninunezrni.governance.application.ports.output.management.ManagementIndicatorPersistencePort;
import com.services.uninunezrni.governance.domain.model.management.ManagementIndicator;
import com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.mapper.management.ManagementIndicatorPersistenceMapper;
import com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.repository.management.ManagementIndicatorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ManagementIndicatorPersistenceAdapter implements ManagementIndicatorPersistencePort {

    private final ManagementIndicatorRepository repository;
    private final ManagementIndicatorPersistenceMapper mapper;

    @Override
    public ManagementIndicator save(ManagementIndicator managementIndicator) {
        return mapper.toManagementIndicator(repository.save(mapper.toManagementIndicatorEntity(managementIndicator)));
    }

    @Override
    public Optional<ManagementIndicator> findById(Long id) {
        return repository.findById(id)
                .map(mapper::toManagementIndicator);
    }

    @Override
    public List<ManagementIndicator> findAll() {
        return mapper.toManagementIndicatorList(repository.findAll());
    }


    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
