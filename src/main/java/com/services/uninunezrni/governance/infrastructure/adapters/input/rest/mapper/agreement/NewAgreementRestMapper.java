package com.services.uninunezrni.governance.infrastructure.adapters.input.rest.mapper.agreement;

import com.services.uninunezrni.governance.domain.model.agreement.NewAgreement;
import com.services.uninunezrni.governance.infrastructure.adapters.input.rest.model.request.agreement.NewAgreementRequest;
import com.services.uninunezrni.governance.infrastructure.adapters.input.rest.model.response.agreement.NewAgreementResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface NewAgreementRestMapper {
    NewAgreement toNewAgreement(NewAgreementRequest request);
    NewAgreementResponse toNewAgreementResponse(NewAgreement newAgreement);
    List<NewAgreementResponse> toNewAgreementResponseList(List<NewAgreement> newAgreementsList);
}
