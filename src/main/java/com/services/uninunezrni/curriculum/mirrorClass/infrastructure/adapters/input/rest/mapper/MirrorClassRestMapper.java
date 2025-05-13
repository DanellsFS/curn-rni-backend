package com.services.uninunezrni.curriculum.mirrorClass.infrastructure.adapters.input.rest.mapper;

import com.services.uninunezrni.curriculum.mirrorClass.domain.model.MirrorClass;
import com.services.uninunezrni.curriculum.mirrorClass.infrastructure.adapters.input.rest.model.request.MirrorClassRequest;
import com.services.uninunezrni.curriculum.mirrorClass.infrastructure.adapters.input.rest.model.response.MirrorClassResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MirrorClassRestMapper {
    MirrorClass toMirrorClass(MirrorClassRequest request);
    MirrorClassResponse toMirrorClassResponse(MirrorClass mirrorClass);
    List<MirrorClassResponse> toMirrorClassResponseList(List<MirrorClass> mirrorClassList);
}
