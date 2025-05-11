package com.services.uninunezrni.governance.infrastructure.adapters.input.rest.mapper.management;

import com.services.uninunezrni.governance.domain.model.management.SemesterManagementReport;
import com.services.uninunezrni.governance.infrastructure.adapters.input.rest.model.request.management.SemesterManagementReportRequest;
import com.services.uninunezrni.governance.infrastructure.adapters.input.rest.model.response.management.SemesterManagementReportResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SemesterManagementReportRestMapper {
    SemesterManagementReport toSemesterManagementReport(SemesterManagementReportRequest request);
    SemesterManagementReportResponse toSemesterManagementReportResponse(SemesterManagementReport semesterManagementReport);
    List<SemesterManagementReportResponse> toSemesterManagementReportResponseList(List<SemesterManagementReport> semesterManagementReportList);
}
