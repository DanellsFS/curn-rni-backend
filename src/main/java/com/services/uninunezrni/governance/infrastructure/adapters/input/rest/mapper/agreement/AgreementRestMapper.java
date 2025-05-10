package com.services.uninunezrni.governance.infrastructure.adapters.input.rest.mapper.agreement;

import com.services.uninunezrni.governance.domain.model.agreement.Agreement;
import com.services.uninunezrni.governance.infrastructure.adapters.input.rest.model.request.agreement.AgreementRequest;
import com.services.uninunezrni.governance.infrastructure.adapters.input.rest.model.response.agreement.AgreementResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AgreementRestMapper {
    Agreement toAgreement(AgreementRequest request);
    AgreementResponse toAgreementResponse(Agreement agreement);
    List<AgreementResponse> toAgreementResponseList(List<Agreement> agreementList);
}
