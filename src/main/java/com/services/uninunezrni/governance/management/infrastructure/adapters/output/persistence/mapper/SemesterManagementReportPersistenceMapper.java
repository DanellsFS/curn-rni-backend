package com.services.uninunezrni.governance.management.infrastructure.adapters.output.persistence.mapper;

import com.services.uninunezrni.governance.management.domain.model.SemesterManagementReport;
import com.services.uninunezrni.governance.management.infrastructure.adapters.output.persistence.entity.SemesterManagementReportEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SemesterManagementReportPersistenceMapper {
    SemesterManagementReportEntity toSemesterManagementReportEntity(SemesterManagementReport semesterManagementReport);
    SemesterManagementReport toSemesterManagementReport(SemesterManagementReportEntity entity);
    List<SemesterManagementReport> toSemesterManagementReportList(List<SemesterManagementReportEntity> entityList);
}
