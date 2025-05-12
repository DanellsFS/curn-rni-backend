package com.services.uninunezrni.curriculum.infrastructure.adapters.input.rest.model.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.services.uninunezrni.curriculum.domain.model.enums.Decanatura;
import com.services.uninunezrni.curriculum.domain.model.enums.ElementoEIC;
import com.services.uninunezrni.curriculum.domain.model.enums.ProgramaAcademico;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EicRegistrationRequest {

    @NotBlank(message = "El correo es obligatorio")
    @Email(message = "Formato de correo inválido")
    private String correo;

    @NotBlank(message = "El nombre completo es obligatorio")
    private String nombreCompleto;

    @NotNull(message = "Debe seleccionar una decanatura")
    private Decanatura decanatura;

    @NotNull(message = "Debe seleccionar un programa académico")
    private ProgramaAcademico programaAcademico;

    @NotBlank(message = "Debe ingresar el nombre de la asignatura")
    private String nombreAsignatura;

    @NotBlank(message = "El semestre es obligatorio")
    private String semestre;

    @NotBlank(message = "Debe especificar la unidad temática")
    private String unidadTematica;

    @NotNull(message = "Debe seleccionar un elemento de internacionalización curricular")
    private ElementoEIC elementoEIC;

    @NotBlank(message = "Debe indicar el idioma de la clase")
    private String idiomaClase;

    @NotBlank(message = "Debe describir la actividad realizada")
    private String descripcionActividad;

    private String herramientasTecnologicas;

    private String entidadAliada;

    private String personaAliada;

    private String bibliografia;

    @Min(value = 1, message = "Debe registrar al menos una clase")
    private int numeroClases;

    @NotNull(message = "Debe ingresar la fecha de inicio")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaInicio;

    @NotNull(message = "Debe ingresar la fecha de finalización")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaFin;

    @Min(value = 1, message = "Debe haber al menos un estudiante involucrado")
    private int numeroEstudiantes;

    @NotBlank(message = "Debe indicar el lugar donde se realizó la actividad")
    private String lugarActividad;

    private String herramientasEvaluativas;

    private String otroElemento;

    @NotBlank(message = "Debe colocar el enlace a la carpeta con las evidencias")
    private String linkCarpetaEvidencias;

}
