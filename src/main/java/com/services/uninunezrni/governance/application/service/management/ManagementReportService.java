package com.services.uninunezrni.governance.application.service.management;

import com.services.uninunezrni.governance.application.ports.input.management.ManagementReportServicePort;
import com.services.uninunezrni.governance.application.ports.output.management.ManagementReportPersistencePort;
import com.services.uninunezrni.governance.domain.exception.management.ManagementReportNotFoundException;
import com.services.uninunezrni.governance.domain.model.management.ManagementReport;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ManagementReportService implements ManagementReportServicePort {

    private final ManagementReportPersistencePort persistencePort;

    @Override
    public ManagementReport save(ManagementReport managementReport) {
        return persistencePort.save(managementReport);
    }

    @Override
    public ManagementReport findById(Long id) {
        return persistencePort.findById(id)
                .orElseThrow(ManagementReportNotFoundException::new);
    }

    @Override
    public List<ManagementReport> findAll() {
        return persistencePort.findAll();
    }

    @Override
    public ManagementReport update(Long id, ManagementReport managementReport) {
        return persistencePort.findById(id)
                .map(savedManagementReport -> {
                    savedManagementReport.setAnnualReport(managementReport.getAnnualReport());
                    return persistencePort.save(savedManagementReport);
                })
                .orElseThrow(ManagementReportNotFoundException::new);
    }

    @Override
    public void deleteById(Long id) {
        if (persistencePort.findById(id).isEmpty()) {
            throw new ManagementReportNotFoundException();
        }
        persistencePort.deleteById(id);
    }
}
