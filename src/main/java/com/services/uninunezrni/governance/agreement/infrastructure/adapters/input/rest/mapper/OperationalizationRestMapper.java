package com.services.uninunezrni.governance.agreement.infrastructure.adapters.input.rest.mapper;

import com.services.uninunezrni.governance.agreement.domain.model.Operationalization;
import com.services.uninunezrni.governance.agreement.infrastructure.adapters.input.rest.model.request.OperationalizationRequest;
import com.services.uninunezrni.governance.agreement.infrastructure.adapters.input.rest.model.response.OperationalizationResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OperationalizationRestMapper {
    Operationalization toOperationalization(OperationalizationRequest request);
    OperationalizationResponse toOperationalizationResponse(Operationalization operationalization);
    List<OperationalizationResponse> toOperationalizationResponseList(List<Operationalization> OperationalizationList);
}
