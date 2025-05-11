package com.services.uninunezrni.governance.infrastructure.adapters.input.rest.management;

import com.services.uninunezrni.governance.application.ports.input.management.SemesterManagementReportServicePort;
import com.services.uninunezrni.governance.infrastructure.adapters.input.rest.mapper.management.SemesterManagementReportRestMapper;
import com.services.uninunezrni.governance.infrastructure.adapters.input.rest.model.request.management.SemesterManagementReportRequest;
import com.services.uninunezrni.governance.infrastructure.adapters.input.rest.model.response.management.SemesterManagementReportResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/semester-management-report")
public class SemesterManagementReportRestAdapter {

    private final SemesterManagementReportServicePort servicePort;
    private final SemesterManagementReportRestMapper restMapper;

    @PostMapping("/v1/api")
    public ResponseEntity<SemesterManagementReportResponse> save(@Valid @RequestBody SemesterManagementReportRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(restMapper.toSemesterManagementReportResponse(servicePort.save(restMapper.toSemesterManagementReport(request))));
    }

    @GetMapping("/v1/api")
    public List<SemesterManagementReportResponse> findAll() {
        return restMapper.toSemesterManagementReportResponseList(servicePort.findAll());
    }

    @GetMapping("/v1/api/{id}")
    public SemesterManagementReportResponse findById(@PathVariable Long id) {
        return restMapper.toSemesterManagementReportResponse(servicePort.findById(id));
    }

    @PutMapping("/v1/api/{id}")
    public SemesterManagementReportResponse update(@PathVariable Long id, @Valid @RequestBody SemesterManagementReportRequest request) {
        return restMapper.toSemesterManagementReportResponse(
                servicePort.update(id, restMapper.toSemesterManagementReport(request)));
    }

    @DeleteMapping("/v1/api/{id}")
    public void delete(@PathVariable Long id) {
        servicePort.deleteById(id);
    }
}
