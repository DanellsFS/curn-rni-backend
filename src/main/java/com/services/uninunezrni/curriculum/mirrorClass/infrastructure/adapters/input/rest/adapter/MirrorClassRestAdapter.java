package com.services.uninunezrni.curriculum.mirrorClass.infrastructure.adapters.input.rest.adapter;

import com.services.uninunezrni.curriculum.mirrorClass.application.ports.input.MirrorClassServicePort;
import com.services.uninunezrni.curriculum.mirrorClass.infrastructure.adapters.input.rest.mapper.MirrorClassRestMapper;
import com.services.uninunezrni.curriculum.mirrorClass.infrastructure.adapters.input.rest.model.request.MirrorClassRequest;
import com.services.uninunezrni.curriculum.mirrorClass.infrastructure.adapters.input.rest.model.response.MirrorClassResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Clases espejo", description = "Controladores para clases espejo")
@RestController
@RequiredArgsConstructor
@RequestMapping("/mirror-class")
public class MirrorClassRestAdapter {

    private final MirrorClassServicePort servicePort;
    private final MirrorClassRestMapper restMapper;

    @Operation(summary = "Listar formularios", description = "Lista todos los formularios de las clases espejo")
    @GetMapping("/v1/api")
    public List<MirrorClassResponse> findAll() {
        return restMapper.toMirrorClassResponseList(servicePort.findAll());
    }

    @Operation(summary = "Buscar formulario", description = "Busca el formulario de una clase espejo por su id.")
    @GetMapping("/v1/api/{id}")
    public MirrorClassResponse findById(@PathVariable Long id) {
        return restMapper.toMirrorClassResponse(servicePort.findById(id));
    }

    @Operation(summary = "Registrar forumulario", description = "Registra una nueva clase espejo realizada con una institución externa.")
    @PostMapping("/v1/api")
    public ResponseEntity<MirrorClassResponse> save(@Valid @RequestBody MirrorClassRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(restMapper.toMirrorClassResponse(servicePort.save(restMapper.toMirrorClass(request))));
    }

    @Operation(summary = "Actualizar formulario", description = "Actualiza los campos de un formulario de clase espejo por su id.")
    @PutMapping("/v1/api/{id}")
    public MirrorClassResponse update(@PathVariable Long id, @Valid @RequestBody MirrorClassRequest request) {
        return restMapper.toMirrorClassResponse(
                servicePort.update(id, restMapper.toMirrorClass(request)));
    }

    @Operation(summary = "Eliminar formulario", description = "Eliminar un formulario de clase espejo por su id.")
    @DeleteMapping("/v1/api/{id}")
    public void delete(@PathVariable Long id) {
        servicePort.deleteById(id);
    }
}
