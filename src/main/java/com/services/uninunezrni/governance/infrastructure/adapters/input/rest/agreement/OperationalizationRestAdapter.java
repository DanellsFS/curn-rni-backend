package com.services.uninunezrni.governance.infrastructure.adapters.input.rest.agreement;

import com.services.uninunezrni.governance.application.ports.input.agreement.OperationalizationServicePort;
import com.services.uninunezrni.governance.infrastructure.adapters.input.rest.mapper.agreement.OperationalizationRestMapper;
import com.services.uninunezrni.governance.infrastructure.adapters.input.rest.model.request.agreement.OperationalizationRequest;
import com.services.uninunezrni.governance.infrastructure.adapters.input.rest.model.response.agreement.OperationalizationResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/operationalization")
public class OperationalizationRestAdapter {

    private final OperationalizationServicePort servicePort;
    private final OperationalizationRestMapper restMapper;

    @PostMapping("/v1/api")
    public ResponseEntity<OperationalizationResponse> save(@Valid @RequestBody OperationalizationRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(restMapper.toOperationalizationResponse(servicePort.save(restMapper.toOperationalization(request))));
    }

    @GetMapping("/v1/api")
    public List<OperationalizationResponse> findAll() {
        return restMapper.toOperationalizationResponseList(servicePort.findAll());
    }

    @GetMapping("/v1/api/{id}")
    public OperationalizationResponse findById(@PathVariable Long id) {
        return restMapper.toOperationalizationResponse(servicePort.findById(id));
    }

    @PutMapping("/v1/api/{id}")
    public OperationalizationResponse update(@PathVariable Long id, @Valid @RequestBody OperationalizationRequest request) {
        return restMapper.toOperationalizationResponse(
                servicePort.update(id, restMapper.toOperationalization(request)));
    }

    @DeleteMapping("/v1/api/{id}")
    public void delete(@PathVariable Long id) {
        servicePort.deleteById(id);
    }
}
