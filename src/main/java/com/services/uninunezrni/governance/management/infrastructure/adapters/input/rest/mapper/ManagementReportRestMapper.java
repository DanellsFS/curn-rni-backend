package com.services.uninunezrni.governance.management.infrastructure.adapters.input.rest.mapper;

import com.services.uninunezrni.governance.management.domain.model.ManagementReport;
import com.services.uninunezrni.governance.management.infrastructure.adapters.input.rest.model.request.ManagementReportRequest;
import com.services.uninunezrni.governance.management.infrastructure.adapters.input.rest.model.response.ManagementReportResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ManagementReportRestMapper {
    ManagementReport toManagementReport(ManagementReportRequest request);
    ManagementReportResponse toManagementReportResponse(ManagementReport managementReport);
    List<ManagementReportResponse> toManagementReportResponseList(List<ManagementReport> managementReportList);
}
