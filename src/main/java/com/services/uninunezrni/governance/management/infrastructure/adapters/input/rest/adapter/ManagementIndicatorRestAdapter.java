package com.services.uninunezrni.governance.management.infrastructure.adapters.input.rest.adapter;

import com.services.uninunezrni.governance.management.application.ports.input.ManagementIndicatorServicePort;
import com.services.uninunezrni.governance.management.infrastructure.adapters.input.rest.mapper.ManagementIndicatorRestMapper;
import com.services.uninunezrni.governance.management.infrastructure.adapters.input.rest.model.request.ManagementIndicatorRequest;
import com.services.uninunezrni.governance.management.infrastructure.adapters.input.rest.model.response.ManagementIndicatorResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/management-indicator")
public class ManagementIndicatorRestAdapter {

    private final ManagementIndicatorServicePort servicePort;
    private final ManagementIndicatorRestMapper restMapper;

    @PostMapping("/v1/api")
    public ResponseEntity<ManagementIndicatorResponse> save(@Valid @RequestBody ManagementIndicatorRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(restMapper.toManagementIndicatorResponse(servicePort.save(restMapper.toManagementIndicator(request))));
    }

    @GetMapping("/v1/api")
    public List<ManagementIndicatorResponse> findAll() {
        return restMapper.toManagementIndicatorResponseList(servicePort.findAll());
    }

    @GetMapping("/v1/api/{id}")
    public ManagementIndicatorResponse findById(@PathVariable Long id) {
        return restMapper.toManagementIndicatorResponse(servicePort.findById(id));
    }

    @PutMapping("/v1/api/{id}")
    public ManagementIndicatorResponse update(@PathVariable Long id, @Valid @RequestBody ManagementIndicatorRequest request) {
        return restMapper.toManagementIndicatorResponse(
                servicePort.update(id, restMapper.toManagementIndicator(request)));
    }

    @DeleteMapping("/v1/api/{id}")
    public void delete(@PathVariable Long id) {
        servicePort.deleteById(id);
    }
}
