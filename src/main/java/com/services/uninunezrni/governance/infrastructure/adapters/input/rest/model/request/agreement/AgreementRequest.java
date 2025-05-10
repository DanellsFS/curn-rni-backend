package com.services.uninunezrni.governance.infrastructure.adapters.input.rest.model.request.agreement;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.services.uninunezrni.governance.domain.model.agreement.AgreementType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AgreementRequest {

    @NotBlank(message = "Field name cannot be empty or null.")
    private String name;

    @NotNull(message = "Field Agreement type cannot be empty or null.")
    private AgreementType type;

    @NotNull(message = "Field date start cannot be empty or null.")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateStart;

    @NotNull(message = "Field date end cannot be empty or null.")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateEnd;

}
