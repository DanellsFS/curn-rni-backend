package com.services.uninunezrni.governance.application.service.management;

import com.services.uninunezrni.governance.application.ports.input.management.SemesterManagementReportServicePort;
import com.services.uninunezrni.governance.application.ports.output.management.SemesterManagementReportPersistencePort;
import com.services.uninunezrni.governance.domain.exception.management.SemesterManagementReportNotFoundException;
import com.services.uninunezrni.governance.domain.model.management.SemesterManagementReport;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SemesterManagementReportService implements SemesterManagementReportServicePort {

    private final SemesterManagementReportPersistencePort persistencePort;

    @Override
    public SemesterManagementReport save(SemesterManagementReport semesterManagementReport) {
        return persistencePort.save(semesterManagementReport);
    }

    @Override
    public SemesterManagementReport findById(Long id) {
        return persistencePort.findById(id)
                .orElseThrow(SemesterManagementReportNotFoundException::new);
    }

    @Override
    public List<SemesterManagementReport> findAll() {
        return persistencePort.findAll();
    }

    @Override
    public SemesterManagementReport update(Long id, SemesterManagementReport semesterManagementReport) {
        return persistencePort.findById(id)
                .map(savedSemesterManagementReport -> {
                    savedSemesterManagementReport.setFormat(semesterManagementReport.getFormat());
                    return persistencePort.save(savedSemesterManagementReport);
                })
                .orElseThrow(SemesterManagementReportNotFoundException::new);
    }

    @Override
    public void deleteById(Long id) {
        if (persistencePort.findById(id).isEmpty()) {
            throw new SemesterManagementReportNotFoundException();
        }
        persistencePort.deleteById(id);
    }
}
