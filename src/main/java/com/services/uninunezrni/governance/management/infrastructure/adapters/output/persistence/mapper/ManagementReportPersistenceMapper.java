package com.services.uninunezrni.governance.management.infrastructure.adapters.output.persistence.mapper;

import com.services.uninunezrni.governance.management.domain.model.ManagementReport;
import com.services.uninunezrni.governance.management.infrastructure.adapters.output.persistence.entity.ManagementReportEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ManagementReportPersistenceMapper {
    ManagementReportEntity toManagementReportEntity(ManagementReport managementReport);
    ManagementReport toManagementReport(ManagementReportEntity entity);
    List<ManagementReport> toManagementReportList(List<ManagementReportEntity> entityList);
}
