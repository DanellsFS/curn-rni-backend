package com.services.uninunezrni.curriculum.coilExperience.infrastructure.adapters.input.rest.model.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.services.uninunezrni.curriculum.mirrorClass.domain.model.enums.Facultad;
import com.services.uninunezrni.curriculum.mirrorClass.domain.model.enums.ProgramaAcademico;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CoilExperienceRequest {

    @NotBlank(message = "El correo es obligatorio")
    @Email(message = "Formato de correo inválido")
    private String correo;
    @NotBlank(message = "El nombre completo es obligatorio")
    private String nombrePersonaRegistro;

    @NotNull(message = "Debe seleccionar una facultad")
    private Facultad facultad;
    @NotNull(message = "Debe seleccionar un programa académico")
    private ProgramaAcademico programaAcademico;

    @NotBlank(message = "Debe ingresar la institucion aliada")
    private String institucionAliada;
    @NotBlank(message = "Debe ingresar el pais de institucion")
    private String paisInstitucion;

    @NotNull(message = "Debe ingresar la fecha de inicio")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaInicio;
    @NotNull(message = "Debe ingresar la fecha de finalización")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaFin;

    @NotBlank(message = "Debe ingresar una asignatura")
    private String asignatura;
    @Min(value = 1, message = "Debe haber al menos una seccion")
    private int numeroSecciones;

    @NotBlank(message = "Debe ingresar un docente de Uninuñez")
    private String docenteUninunez;
    @NotBlank(message = "Debe ingresar un docente externo")
    private String docenteExterno;
    @NotBlank(message = "Debe ingresar la identificación del docente externo")
    @Pattern(regexp = "\\d+", message = "La identificación solo debe contener números")
    private String identificacionDocenteExterno;

    @Min(value = 1, message = "Debe haber al menos un estudiante involucrado")
    private int numeroEstudiantes;

    @NotBlank(message = "Debe colocar el enlace a la carpeta con las evidencias")
    private String linkEvidencias;

}
