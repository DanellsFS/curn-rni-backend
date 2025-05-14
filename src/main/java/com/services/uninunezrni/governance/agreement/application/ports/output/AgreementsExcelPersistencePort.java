package com.services.uninunezrni.governance.agreement.application.ports.output;

import com.services.uninunezrni.governance.agreement.domain.model.AgreementsExcel;

import java.util.List;
import java.util.Optional;

public interface AgreementsExcelPersistencePort {
    AgreementsExcel save(AgreementsExcel agreementsExcel);
    Optional<AgreementsExcel> findById(Long id);
    List<AgreementsExcel> findAll();
    void deleteById(Long id);
}
