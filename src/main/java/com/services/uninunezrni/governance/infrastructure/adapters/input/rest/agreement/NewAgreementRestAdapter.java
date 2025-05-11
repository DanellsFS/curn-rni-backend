package com.services.uninunezrni.governance.infrastructure.adapters.input.rest.agreement;

import com.services.uninunezrni.governance.application.ports.input.agreement.NewAgreementServicePort;
import com.services.uninunezrni.governance.infrastructure.adapters.input.rest.mapper.agreement.NewAgreementRestMapper;
import com.services.uninunezrni.governance.infrastructure.adapters.input.rest.model.request.agreement.NewAgreementRequest;
import com.services.uninunezrni.governance.infrastructure.adapters.input.rest.model.response.agreement.NewAgreementResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/new-agreement")
public class NewAgreementRestAdapter {

    private final NewAgreementServicePort servicePort;
    private final NewAgreementRestMapper restMapper;

    @PostMapping("/v1/api")
    public ResponseEntity<NewAgreementResponse> save(@Valid @RequestBody NewAgreementRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(restMapper.toNewAgreementResponse(servicePort.save(restMapper.toNewAgreement(request))));
    }

    @GetMapping("/v1/api")
    public List<NewAgreementResponse> findAll() {
        return restMapper.toNewAgreementResponseList(servicePort.findAll());
    }

    @GetMapping("/v1/api/{id}")
    public NewAgreementResponse findById(@PathVariable Long id) {
        return restMapper.toNewAgreementResponse(servicePort.findById(id));
    }

    @PutMapping("/v1/api/{id}")
    public NewAgreementResponse update(@PathVariable Long id, @Valid @RequestBody NewAgreementRequest request) {
        return restMapper.toNewAgreementResponse(
                servicePort.update(id, restMapper.toNewAgreement(request)));
    }

    @DeleteMapping("/v1/api/{id}")
    public void delete(@PathVariable Long id) {
        servicePort.deleteById(id);
    }
}
