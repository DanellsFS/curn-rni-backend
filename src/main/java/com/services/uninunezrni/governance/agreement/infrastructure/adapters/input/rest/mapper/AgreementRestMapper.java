package com.services.uninunezrni.governance.agreement.infrastructure.adapters.input.rest.mapper;

import com.services.uninunezrni.governance.agreement.domain.model.Agreement;
import com.services.uninunezrni.governance.agreement.infrastructure.adapters.input.rest.model.request.AgreementRequest;
import com.services.uninunezrni.governance.agreement.infrastructure.adapters.input.rest.model.response.AgreementResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AgreementRestMapper {
    Agreement toAgreement(AgreementRequest request);
    AgreementResponse toAgreementResponse(Agreement agreement);
    List<AgreementResponse> toAgreementResponseList(List<Agreement> agreementList);
}
