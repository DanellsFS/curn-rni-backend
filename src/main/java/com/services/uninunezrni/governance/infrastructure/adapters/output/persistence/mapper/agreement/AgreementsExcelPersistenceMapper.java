package com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.mapper.agreement;

import com.services.uninunezrni.governance.domain.model.agreement.AgreementsExcel;
import com.services.uninunezrni.governance.infrastructure.adapters.output.persistence.entity.agreement.AgreementsExcelEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AgreementsExcelPersistenceMapper {
    AgreementsExcelEntity toAgreementsExcelEntity(AgreementsExcel agreementsExcel);
    AgreementsExcel toAgreementsExcel(AgreementsExcelEntity entity);
    List<AgreementsExcel> toAgreementsExcelList(List<AgreementsExcelEntity> entityList);
}
