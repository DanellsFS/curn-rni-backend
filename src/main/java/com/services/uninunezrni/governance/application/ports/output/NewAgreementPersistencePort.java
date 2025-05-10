package com.services.uninunezrni.governance.application.ports.output;

import com.services.uninunezrni.governance.domain.model.NewAgreement;

import java.util.List;
import java.util.Optional;

public interface NewAgreementPersistencePort {
    NewAgreement save(NewAgreement agreement);
    Optional<NewAgreement> findById(Long id);
    List<NewAgreement> findAll();
    void deleteById(Long id);
}
