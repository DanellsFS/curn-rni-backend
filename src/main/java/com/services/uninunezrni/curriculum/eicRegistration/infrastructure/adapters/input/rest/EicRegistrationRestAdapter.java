package com.services.uninunezrni.curriculum.eicRegistration.infrastructure.adapters.input.rest;

import com.services.uninunezrni.curriculum.eicRegistration.infrastructure.adapters.input.rest.model.request.EicRegistrationRequest;
import com.services.uninunezrni.curriculum.eicRegistration.infrastructure.adapters.input.rest.model.response.EicRegistrationResponse;
import com.services.uninunezrni.curriculum.eicRegistration.application.ports.input.EicRegistrationServicePort;
import com.services.uninunezrni.curriculum.eicRegistration.infrastructure.adapters.input.rest.mapper.EicRegistrationRestMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Registro de eic", description = "Controladores para registros de eic")
@RestController
@RequiredArgsConstructor
@RequestMapping("/eic-registration")
public class EicRegistrationRestAdapter {

    private final EicRegistrationServicePort servicePort;
    private final EicRegistrationRestMapper restMapper;

    @Operation(summary = "Listar formularios", description = "Lista todos los formularios de eic")
    @GetMapping("/v1/api")
    public List<EicRegistrationResponse> findAll() {
        return restMapper.toEicRegistrationResponseList(servicePort.findAll());
    }

    @Operation(summary = "Buscar formulario", description = "Busca el formulario de eic por su id.")
    @GetMapping("/v1/api/{id}")
    public EicRegistrationResponse findById(@PathVariable Long id) {
        return restMapper.toEicRegistrationResponse(servicePort.findById(id));
    }

    @Operation(summary = "Registrar forumulario", description = "Registra un nuevo formulario perteniente a los eic trabajados.")
    @PostMapping("/v1/api")
    public ResponseEntity<EicRegistrationResponse> save(@Valid @RequestBody EicRegistrationRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(restMapper.toEicRegistrationResponse(servicePort.save(restMapper.toEicRegistration(request))));
    }

    @Operation(summary = "Actualizar formulario", description = "Actualiza los campos de un formulario de eic por su id.")
    @PutMapping("/v1/api/{id}")
    public EicRegistrationResponse update(@PathVariable Long id, @Valid @RequestBody EicRegistrationRequest request) {
        return restMapper.toEicRegistrationResponse(
                servicePort.update(id, restMapper.toEicRegistration(request)));
    }

    @Operation(summary = "Eliminar formulario", description = "Eliminar un formulario de eic por su id.")
    @DeleteMapping("/v1/api/{id}")
    public void delete(@PathVariable Long id) {
        servicePort.deleteById(id);
    }
}

