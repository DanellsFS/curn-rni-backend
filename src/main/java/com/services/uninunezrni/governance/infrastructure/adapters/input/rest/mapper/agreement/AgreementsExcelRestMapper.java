package com.services.uninunezrni.governance.infrastructure.adapters.input.rest.mapper.agreement;

import com.services.uninunezrni.governance.domain.model.agreement.AgreementsExcel;
import com.services.uninunezrni.governance.infrastructure.adapters.input.rest.model.request.agreement.AgreementsExcelRequest;
import com.services.uninunezrni.governance.infrastructure.adapters.input.rest.model.response.agreement.AgreementsExcelResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AgreementsExcelRestMapper {
    AgreementsExcel toAgreementsExcel(AgreementsExcelRequest request);
    AgreementsExcelResponse toAgreementsExcelResponse(AgreementsExcel agreementsExcel);
    List<AgreementsExcelResponse> toAgreementsExcelResponseList(List<AgreementsExcel> agreementsExcelsList);
}
