package com.services.uninunezrni.governance.infrastructure.adapters.input.rest.agreement;

import com.services.uninunezrni.governance.application.ports.input.agreement.AgreementsExcelServicePort;
import com.services.uninunezrni.governance.infrastructure.adapters.input.rest.mapper.agreement.AgreementsExcelRestMapper;
import com.services.uninunezrni.governance.infrastructure.adapters.input.rest.model.request.agreement.AgreementsExcelRequest;
import com.services.uninunezrni.governance.infrastructure.adapters.input.rest.model.response.agreement.AgreementsExcelResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/agreements-excel")
public class AgreementsExcelRestAdapter {

    private final AgreementsExcelServicePort servicePort;
    private final AgreementsExcelRestMapper restMapper;

    @PostMapping("/v1/api")
    public ResponseEntity<AgreementsExcelResponse> save(@Valid @RequestBody AgreementsExcelRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(restMapper.toAgreementsExcelResponse(servicePort.save(restMapper.toAgreementsExcel(request))));
    }

    @GetMapping("/v1/api")
    public List<AgreementsExcelResponse> findAll() {
        return restMapper.toAgreementsExcelResponseList(servicePort.findAll());
    }

    @GetMapping("/v1/api/{id}")
    public AgreementsExcelResponse findById(@PathVariable Long id) {
        return restMapper.toAgreementsExcelResponse(servicePort.findById(id));
    }

    @PutMapping("/v1/api/{id}")
    public AgreementsExcelResponse update(@PathVariable Long id, @Valid @RequestBody AgreementsExcelRequest request) {
        return restMapper.toAgreementsExcelResponse(
                servicePort.update(id, restMapper.toAgreementsExcel(request)));
    }

    @DeleteMapping("/v1/api/{id}")
    public void delete(@PathVariable Long id) {
        servicePort.deleteById(id);
    }
}
