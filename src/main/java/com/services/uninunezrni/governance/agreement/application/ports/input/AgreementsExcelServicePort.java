package com.services.uninunezrni.governance.agreement.application.ports.input;

import com.services.uninunezrni.governance.agreement.domain.model.AgreementsExcel;

import java.util.List;

public interface AgreementsExcelServicePort {
    AgreementsExcel save(AgreementsExcel agreementsExcel);
    AgreementsExcel findById(Long id);
    List<AgreementsExcel> findAll();
    AgreementsExcel update(Long id, AgreementsExcel agreement);
    void deleteById(Long id);
}
