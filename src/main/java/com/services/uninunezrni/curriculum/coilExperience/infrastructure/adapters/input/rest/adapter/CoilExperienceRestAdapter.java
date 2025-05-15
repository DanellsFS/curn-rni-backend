package com.services.uninunezrni.curriculum.coilExperience.infrastructure.adapters.input.rest.adapter;

import com.services.uninunezrni.curriculum.coilExperience.application.ports.input.CoilExperienceServicePort;
import com.services.uninunezrni.curriculum.coilExperience.infrastructure.adapters.input.rest.mapper.CoilExperienceRestMapper;
import com.services.uninunezrni.curriculum.coilExperience.infrastructure.adapters.input.rest.model.request.CoilExperienceRequest;
import com.services.uninunezrni.curriculum.coilExperience.infrastructure.adapters.input.rest.model.response.CoilExperienceResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Registro de coil", description = "Controladores para registros de coil")
@RestController
@RequiredArgsConstructor
@RequestMapping("/coil-experience")
public class CoilExperienceRestAdapter {

    private final CoilExperienceServicePort servicePort;
    private final CoilExperienceRestMapper restMapper;

    @Operation(summary = "Listar formularios", description = "Lista todos los formularios de coil")
    @GetMapping("/v1/api")
    public List<CoilExperienceResponse> findAll() {
        return restMapper.toCoilExperienceResponseList(servicePort.findAll());
    }

    @Operation(summary = "Buscar formulario", description = "Busca el formulario de coil por su id.")
    @GetMapping("/v1/api/{id}")
    public CoilExperienceResponse findById(@PathVariable Long id) {
        return restMapper.toCoilExperienceResponse(servicePort.findById(id));
    }

    @Operation(summary = "Registrar forumulario", description = "Registra un nuevo formulario perteniente a los coil trabajados.")
    @PostMapping("/v1/api")
    public ResponseEntity<CoilExperienceResponse> save(@Valid @RequestBody CoilExperienceRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(restMapper.toCoilExperienceResponse(servicePort.save(restMapper.toCoilExperience(request))));
    }

}
