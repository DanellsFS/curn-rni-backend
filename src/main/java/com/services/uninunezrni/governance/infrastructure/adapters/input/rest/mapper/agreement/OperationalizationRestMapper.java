package com.services.uninunezrni.governance.infrastructure.adapters.input.rest.mapper.agreement;

import com.services.uninunezrni.governance.domain.model.agreement.Operationalization;
import com.services.uninunezrni.governance.infrastructure.adapters.input.rest.model.request.agreement.OperationalizationRequest;
import com.services.uninunezrni.governance.infrastructure.adapters.input.rest.model.response.agreement.OperationalizationResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OperationalizationRestMapper {
    Operationalization toOperationalization(OperationalizationRequest request);
    OperationalizationResponse toOperationalizationResponse(Operationalization operationalization);
    List<OperationalizationResponse> toOperationalizationResponseList(List<Operationalization> OperationalizationList);
}
