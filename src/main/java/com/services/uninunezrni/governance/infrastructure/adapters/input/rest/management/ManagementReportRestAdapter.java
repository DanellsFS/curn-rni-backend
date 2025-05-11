package com.services.uninunezrni.governance.infrastructure.adapters.input.rest.management;

import com.services.uninunezrni.governance.application.ports.input.management.ManagementReportServicePort;
import com.services.uninunezrni.governance.infrastructure.adapters.input.rest.mapper.management.ManagementReportRestMapper;
import com.services.uninunezrni.governance.infrastructure.adapters.input.rest.model.request.management.ManagementReportRequest;
import com.services.uninunezrni.governance.infrastructure.adapters.input.rest.model.response.management.ManagementReportResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/management-report")
public class ManagementReportRestAdapter {

    private final ManagementReportServicePort servicePort;
    private final ManagementReportRestMapper restMapper;

    @PostMapping("/v1/api")
    public ResponseEntity<ManagementReportResponse> save(@Valid @RequestBody ManagementReportRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(restMapper.toManagementReportResponse(servicePort.save(restMapper.toManagementReport(request))));
    }

    @GetMapping("/v1/api")
    public List<ManagementReportResponse> findAll() {
        return restMapper.toManagementReportResponseList(servicePort.findAll());
    }

    @GetMapping("/v1/api/{id}")
    public ManagementReportResponse findById(@PathVariable Long id) {
        return restMapper.toManagementReportResponse(servicePort.findById(id));
    }

    @PutMapping("/v1/api/{id}")
    public ManagementReportResponse update(@PathVariable Long id, @Valid @RequestBody ManagementReportRequest request) {
        return restMapper.toManagementReportResponse(
                servicePort.update(id, restMapper.toManagementReport(request)));
    }

    @DeleteMapping("/v1/api/{id}")
    public void delete(@PathVariable Long id) {
        servicePort.deleteById(id);
    }
}
