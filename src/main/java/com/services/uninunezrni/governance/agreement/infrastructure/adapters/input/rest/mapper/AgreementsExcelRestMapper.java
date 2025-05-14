package com.services.uninunezrni.governance.agreement.infrastructure.adapters.input.rest.mapper;

import com.services.uninunezrni.governance.agreement.domain.model.AgreementsExcel;
import com.services.uninunezrni.governance.agreement.infrastructure.adapters.input.rest.model.request.AgreementsExcelRequest;
import com.services.uninunezrni.governance.agreement.infrastructure.adapters.input.rest.model.response.AgreementsExcelResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AgreementsExcelRestMapper {
    AgreementsExcel toAgreementsExcel(AgreementsExcelRequest request);
    AgreementsExcelResponse toAgreementsExcelResponse(AgreementsExcel agreementsExcel);
    List<AgreementsExcelResponse> toAgreementsExcelResponseList(List<AgreementsExcel> agreementsExcelsList);
}
