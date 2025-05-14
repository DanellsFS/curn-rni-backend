package com.services.uninunezrni.governance.agreement.infrastructure.adapters.output.persistence.mapper;

import com.services.uninunezrni.governance.agreement.domain.model.AgreementsExcel;
import com.services.uninunezrni.governance.agreement.infrastructure.adapters.output.persistence.entity.AgreementsExcelEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AgreementsExcelPersistenceMapper {
    AgreementsExcelEntity toAgreementsExcelEntity(AgreementsExcel agreementsExcel);
    AgreementsExcel toAgreementsExcel(AgreementsExcelEntity entity);
    List<AgreementsExcel> toAgreementsExcelList(List<AgreementsExcelEntity> entityList);
}
