package com.services.uninunezrni.curriculum.mirrorClass.infrastructure.adapters.input.rest;

import com.services.uninunezrni.curriculum.mirrorClass.application.ports.input.MirrorClassServicePort;
import com.services.uninunezrni.curriculum.mirrorClass.infrastructure.adapters.input.rest.mapper.MirrorClassRestMapper;
import com.services.uninunezrni.curriculum.mirrorClass.infrastructure.adapters.input.rest.model.request.MirrorClassRequest;
import com.services.uninunezrni.curriculum.mirrorClass.infrastructure.adapters.input.rest.model.response.MirrorClassResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mirror-class")
public class MirrorClassRestAdapter {

    private final MirrorClassServicePort servicePort;
    private final MirrorClassRestMapper restMapper;

    @GetMapping("/v1/api")
    public List<MirrorClassResponse> findAll() {
        return restMapper.toMirrorClassResponseList(servicePort.findAll());
    }

    @GetMapping("/v1/api/{id}")
    public MirrorClassResponse findById(@PathVariable Long id) {
        return restMapper.toMirrorClassResponse(servicePort.findById(id));
    }

    @PostMapping("/v1/api")
    public ResponseEntity<MirrorClassResponse> save(@Valid @RequestBody MirrorClassRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(restMapper.toMirrorClassResponse(servicePort.save(restMapper.toMirrorClass(request))));
    }

    @PutMapping("/v1/api/{id}")
    public MirrorClassResponse update(@PathVariable Long id, @Valid @RequestBody MirrorClassRequest request) {
        return restMapper.toMirrorClassResponse(
                servicePort.update(id, restMapper.toMirrorClass(request)));
    }

    @DeleteMapping("/v1/api/{id}")
    public void delete(@PathVariable Long id) {
        servicePort.deleteById(id);
    }
}
