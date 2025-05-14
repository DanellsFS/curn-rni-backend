package com.services.uninunezrni.governance.management.infrastructure.adapters.input.rest.mapper;

import com.services.uninunezrni.governance.management.domain.model.SemesterManagementReport;
import com.services.uninunezrni.governance.management.infrastructure.adapters.input.rest.model.request.SemesterManagementReportRequest;
import com.services.uninunezrni.governance.management.infrastructure.adapters.input.rest.model.response.SemesterManagementReportResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SemesterManagementReportRestMapper {
    SemesterManagementReport toSemesterManagementReport(SemesterManagementReportRequest request);
    SemesterManagementReportResponse toSemesterManagementReportResponse(SemesterManagementReport semesterManagementReport);
    List<SemesterManagementReportResponse> toSemesterManagementReportResponseList(List<SemesterManagementReport> semesterManagementReportList);
}
