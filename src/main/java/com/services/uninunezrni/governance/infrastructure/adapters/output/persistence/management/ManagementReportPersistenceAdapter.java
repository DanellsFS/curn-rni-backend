package com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.management;

import com.services.uninunezrni.governance.application.ports.output.management.ManagementReportPersistencePort;
import com.services.uninunezrni.governance.domain.model.management.ManagementReport;
import com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.mapper.management.ManagementReportPersistenceMapper;
import com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.repository.management.ManagementReportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ManagementReportPersistenceAdapter implements ManagementReportPersistencePort {

    private final ManagementReportRepository repository;
    private final ManagementReportPersistenceMapper mapper;

    @Override
    public ManagementReport save(ManagementReport managementReport) {
        return mapper.toManagementReport(repository.save(mapper.toManagementReportEntity(managementReport)));
    }

    @Override
    public Optional<ManagementReport> findById(Long id) {
        return repository.findById(id)
                .map(mapper::toManagementReport);
    }

    @Override
    public List<ManagementReport> findAll() {
        return mapper.toManagementReportList(repository.findAll());
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
