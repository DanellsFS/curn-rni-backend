package com.services.uninunezrni.governance.agreement.infrastructure.adapters.input.rest.mapper;

import com.services.uninunezrni.governance.agreement.domain.model.NewAgreement;
import com.services.uninunezrni.governance.agreement.infrastructure.adapters.input.rest.model.request.NewAgreementRequest;
import com.services.uninunezrni.governance.agreement.infrastructure.adapters.input.rest.model.response.NewAgreementResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface NewAgreementRestMapper {
    NewAgreement toNewAgreement(NewAgreementRequest request);
    NewAgreementResponse toNewAgreementResponse(NewAgreement newAgreement);
    List<NewAgreementResponse> toNewAgreementResponseList(List<NewAgreement> newAgreementsList);
}
