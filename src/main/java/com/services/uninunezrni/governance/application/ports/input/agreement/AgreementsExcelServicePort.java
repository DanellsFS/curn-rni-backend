package com.services.uninunezrni.governance.application.ports.input.agreement;

import com.services.uninunezrni.governance.domain.model.agreement.AgreementsExcel;

import java.util.List;

public interface AgreementsExcelServicePort {
    AgreementsExcel save(AgreementsExcel agreementsExcel);
    AgreementsExcel findById(Long id);
    List<AgreementsExcel> findAll();
    AgreementsExcel update(Long id, AgreementsExcel agreement);
    void deleteById(Long id);
}
