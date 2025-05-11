package com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.mapper.management;

import com.services.uninunezrni.governance.domain.model.management.ManagementReport;
import com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.entity.management.ManagementReportEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ManagementReportPersistenceMapper {
    ManagementReportEntity toManagementReportEntity(ManagementReport managementReport);
    ManagementReport toManagementReport(ManagementReportEntity entity);
    List<ManagementReport> toManagementReportList(List<ManagementReportEntity> entityList);
}
