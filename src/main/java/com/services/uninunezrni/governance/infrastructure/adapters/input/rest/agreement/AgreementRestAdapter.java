package com.services.uninunezrni.governance.infrastructure.adapters.input.rest.agreement;

import com.services.uninunezrni.governance.application.ports.input.agreement.AgreementServicePort;
import com.services.uninunezrni.governance.infrastructure.adapters.input.rest.mapper.agreement.AgreementRestMapper;
import com.services.uninunezrni.governance.infrastructure.adapters.input.rest.model.request.agreement.AgreementRequest;
import com.services.uninunezrni.governance.infrastructure.adapters.input.rest.model.response.agreement.AgreementResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/agreements")
public class AgreementRestAdapter {

    private final AgreementServicePort servicePort;
    private final AgreementRestMapper restMapper;

    @PostMapping("/v1/api")
    public ResponseEntity<AgreementResponse> save(@Valid @RequestBody AgreementRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(restMapper.toAgreementResponse(servicePort.save(restMapper.toAgreement(request))));
    }
    
    @PutMapping("/v1/api/{id}")
    public AgreementResponse update(@PathVariable Long id, @Valid @RequestBody AgreementRequest request) {
        return restMapper.toAgreementResponse(
                servicePort.update(id, restMapper.toAgreement(request)));
    }

    @DeleteMapping("/v1/api/{id}")
    public void delete(@PathVariable Long id) {
        servicePort.deleteById(id);
    }

    @GetMapping("/v1/api")
    public List<AgreementResponse> findAll() {
        return restMapper.toAgreementResponseList(servicePort.findAll());
    }

    @GetMapping("/v1/api/{id}")
    public AgreementResponse findById(@PathVariable Long id) {
        return restMapper.toAgreementResponse(servicePort.findById(id));
    }

}
