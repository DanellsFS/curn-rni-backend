package com.services.uninunezrni.curriculum.infrastructure.adapters.input.rest;

import com.services.uninunezrni.curriculum.application.ports.input.EicRegistrationServicePort;
import com.services.uninunezrni.curriculum.infrastructure.adapters.input.rest.mapper.EicRegistrationRestMapper;
import com.services.uninunezrni.curriculum.infrastructure.adapters.input.rest.model.request.EicRegistrationRequest;
import com.services.uninunezrni.curriculum.infrastructure.adapters.input.rest.model.response.EicRegistrationResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/eic-registration")
public class EicRegistrationRestAdapter {

    private final EicRegistrationServicePort servicePort;
    private final EicRegistrationRestMapper restMapper;

    @GetMapping("/v1/api")
    public List<EicRegistrationResponse> findAll() {
        return restMapper.toEicRegistrationResponseList(servicePort.findAll());
    }

    @GetMapping("/v1/api/{id}")
    public EicRegistrationResponse findById(@PathVariable Long id) {
        return restMapper.toEicRegistrationResponse(servicePort.findById(id));
    }

    @PostMapping("/v1/api")
    public ResponseEntity<EicRegistrationResponse> save(@Valid @RequestBody EicRegistrationRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(restMapper.toEicRegistrationResponse(servicePort.save(restMapper.toEicRegistration(request))));
    }

    @PutMapping("/v1/api/{id}")
    public EicRegistrationResponse update(@PathVariable Long id, @Valid @RequestBody EicRegistrationRequest request) {
        return restMapper.toEicRegistrationResponse(
                servicePort.update(id, restMapper.toEicRegistration(request)));
    }

    @DeleteMapping("/v1/api/{id}")
    public void delete(@PathVariable Long id) {
        servicePort.deleteById(id);
    }
}

