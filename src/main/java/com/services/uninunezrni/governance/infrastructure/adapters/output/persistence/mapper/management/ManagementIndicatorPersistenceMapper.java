package com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.mapper.management;

import com.services.uninunezrni.governance.domain.model.management.ManagementIndicator;
import com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.entity.management.ManagementIndicatorEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ManagementIndicatorPersistenceMapper {
    ManagementIndicatorEntity toManagementIndicatorEntity(ManagementIndicator managementIndicator);
    ManagementIndicator toManagementIndicator(ManagementIndicatorEntity entity);
    List<ManagementIndicator> toManagementIndicatorList(List<ManagementIndicatorEntity> entityList);
}
