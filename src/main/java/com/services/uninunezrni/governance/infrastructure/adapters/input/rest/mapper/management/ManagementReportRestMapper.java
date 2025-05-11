package com.services.uninunezrni.governance.infrastructure.adapters.input.rest.mapper.management;

import com.services.uninunezrni.governance.domain.model.management.ManagementReport;
import com.services.uninunezrni.governance.infrastructure.adapters.input.rest.model.request.management.ManagementReportRequest;
import com.services.uninunezrni.governance.infrastructure.adapters.input.rest.model.response.management.ManagementReportResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ManagementReportRestMapper {
    ManagementReport toManagementReport(ManagementReportRequest request);
    ManagementReportResponse toManagementReportResponse(ManagementReport managementReport);
    List<ManagementReportResponse> toManagementReportResponseList(List<ManagementReport> managementReportList);
}
