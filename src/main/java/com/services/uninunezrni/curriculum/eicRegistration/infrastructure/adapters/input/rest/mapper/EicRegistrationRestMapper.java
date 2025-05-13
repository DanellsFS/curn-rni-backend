package com.services.uninunezrni.curriculum.eicRegistration.infrastructure.adapters.input.rest.mapper;

import com.services.uninunezrni.curriculum.eicRegistration.infrastructure.adapters.input.rest.model.request.EicRegistrationRequest;
import com.services.uninunezrni.curriculum.eicRegistration.infrastructure.adapters.input.rest.model.response.EicRegistrationResponse;
import com.services.uninunezrni.curriculum.eicRegistration.domain.model.EicRegistration;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EicRegistrationRestMapper {
    EicRegistration toEicRegistration(EicRegistrationRequest request);
    EicRegistrationResponse toEicRegistrationResponse(EicRegistration eicRegistration);
    List<EicRegistrationResponse> toEicRegistrationResponseList(List<EicRegistration> eicRegistrationList);
}
