package com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.mapper.agreement;

import com.services.uninunezrni.governance.domain.model.agreement.Operationalization;
import com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.entity.agreement.OperationalizationEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OperationalizationPersistenceMapper {
    OperationalizationEntity toOperationalizationEntity(Operationalization operationalization);
    Operationalization toOperationalization(OperationalizationEntity entity);
    List<Operationalization> toOperationalizationList(List<OperationalizationEntity> entityList);
}
