package com.services.uninunezrni.governance.application.ports.output.agreement;

import com.services.uninunezrni.governance.domain.model.agreement.AgreementsExcel;

import java.util.List;
import java.util.Optional;

public interface AgreementsExcelPersistencePort {
    AgreementsExcel save(AgreementsExcel agreementsExcel);
    Optional<AgreementsExcel> findById(Long id);
    List<AgreementsExcel> findAll();
    void deleteById(Long id);
}
