package com.services.uninunezrni.curriculum.mirrorClass.infrastructure.adapters.input.rest.model.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.services.uninunezrni.curriculum.mirrorClass.domain.model.enums.Facultad;
import com.services.uninunezrni.curriculum.mirrorClass.domain.model.enums.NumeroSecciones;
import com.services.uninunezrni.curriculum.mirrorClass.domain.model.enums.ProgramaAcademico;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MirrorClassRequest {

    @NotBlank(message = "El correo es obligatorio")
    @Email(message = "Formato de correo inválido")
    private String correo;

    @NotBlank(message = "Debe ingresar el nombre de la persona que realiza el registro")
    private String nombrePersonaRegistro;

    @NotNull(message = "Debe seleccionar una facultad")
    private Facultad facultad;

    @NotNull(message = "Debe seleccionar un programa académico")
    private ProgramaAcademico programaAcademico;

    @NotBlank(message = "Debe ingresar el nombre de la institución aliada")
    private String institucionAliada;

    @NotBlank(message = "Debe ingresar el país de la IES aliada")
    private String paisInstitucion;

    @NotBlank(message = "Debe ingresar la ciudad de la IES aliada")
    private String ciudadInstitucion;

    @NotBlank(message = "Debe ingresar el nombre del docente de UNINÚÑEZ")
    private String docenteUninunez;

    @NotBlank(message = "Debe ingresar el nombre del docente o funcionario externo")
    private String docenteExterno;

    @NotBlank(message = "Debe ingresar la identificación del docente externo")
    private String identificacionDocenteExterno;

    @NotBlank(message = "Debe ingresar el nombre de la asignatura")
    private String asignatura;

    @NotBlank(message = "Debe ingresar el tema o unidad temática")
    private String unidadTematica;

    @NotNull(message = "Debe indicar el número de secciones (1, 2, 3 u Otro)")
    private NumeroSecciones numeroSecciones;

    @Min(value = 4, message = "Si selecciona 'Otro', debe especificar un número mayor a 3")
    private Integer numeroSeccionesOtro; // solo si se selecciona OTRO

    @NotNull(message = "Debe ingresar la fecha de inicio")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaInicio;

    @NotNull(message = "Debe ingresar la fecha de finalización")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaFin;

    private String herramientasWeb;

    @Min(value = 1, message = "Debe haber al menos un estudiante involucrado")
    private int numeroEstudiantes;

    @NotBlank(message = "Debe ingresar el enlace a la carpeta de evidencias")
    private String linkEvidencias;

}
