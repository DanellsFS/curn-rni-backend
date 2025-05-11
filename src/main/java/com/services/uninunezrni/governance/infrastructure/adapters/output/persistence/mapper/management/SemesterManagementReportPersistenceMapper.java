package com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.mapper.management;

import com.services.uninunezrni.governance.domain.model.management.SemesterManagementReport;
import com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.entity.management.SemesterManagementReportEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SemesterManagementReportPersistenceMapper {
    SemesterManagementReportEntity toSemesterManagementReportEntity(SemesterManagementReport semesterManagementReport);
    SemesterManagementReport toSemesterManagementReport(SemesterManagementReportEntity entity);
    List<SemesterManagementReport> toSemesterManagementReportList(List<SemesterManagementReportEntity> entityList);
}
