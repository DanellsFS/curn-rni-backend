package com.services.uninunezrni.governance.management.infrastructure.adapters.output.persistence.mapper;

import com.services.uninunezrni.governance.management.domain.model.ManagementIndicator;
import com.services.uninunezrni.governance.management.infrastructure.adapters.output.persistence.entity.ManagementIndicatorEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ManagementIndicatorPersistenceMapper {
    ManagementIndicatorEntity toManagementIndicatorEntity(ManagementIndicator managementIndicator);
    ManagementIndicator toManagementIndicator(ManagementIndicatorEntity entity);
    List<ManagementIndicator> toManagementIndicatorList(List<ManagementIndicatorEntity> entityList);
}
