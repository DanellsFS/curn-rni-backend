package com.services.uninunezrni.curriculum.coilExperience.infrastructure.adapters.input.rest.mapper;

import com.services.uninunezrni.curriculum.coilExperience.domain.model.CoilExperience;
import com.services.uninunezrni.curriculum.coilExperience.infrastructure.adapters.input.rest.model.request.CoilExperienceRequest;
import com.services.uninunezrni.curriculum.coilExperience.infrastructure.adapters.input.rest.model.response.CoilExperienceResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CoilExperienceRestMapper {
    CoilExperience toCoilExperience(CoilExperienceRequest request);
    CoilExperienceResponse toCoilExperienceResponse(CoilExperience coilExperience);
    List<CoilExperienceResponse> toCoilExperienceResponseList(List<CoilExperience> coilExperienceList);
}
