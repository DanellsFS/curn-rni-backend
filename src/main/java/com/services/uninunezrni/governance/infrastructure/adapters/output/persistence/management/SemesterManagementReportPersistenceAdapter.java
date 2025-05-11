package com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.management;

import com.services.uninunezrni.governance.application.ports.output.management.SemesterManagementReportPersistencePort;
import com.services.uninunezrni.governance.domain.model.management.SemesterManagementReport;
import com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.mapper.management.SemesterManagementReportPersistenceMapper;
import com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.repository.management.SemesterManagementReportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class SemesterManagementReportPersistenceAdapter implements SemesterManagementReportPersistencePort {

    private final SemesterManagementReportRepository repository;
    private final SemesterManagementReportPersistenceMapper mapper;

    @Override
    public SemesterManagementReport save(SemesterManagementReport semesterManagementReport) {
        return mapper.toSemesterManagementReport(repository.save(mapper.toSemesterManagementReportEntity(semesterManagementReport)));
    }

    @Override
    public Optional<SemesterManagementReport> findById(Long id) {
        return repository.findById(id)
                .map(mapper::toSemesterManagementReport);
    }

    @Override
    public List<SemesterManagementReport> findAll() {
        return mapper.toSemesterManagementReportList(repository.findAll());
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
