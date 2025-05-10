package com.services.uninunezrni.governance.application.ports.input.agreement;

import com.services.uninunezrni.governance.domain.model.agreement.NewAgreement;

import java.util.List;

public interface NewAgreementServicePort {
    NewAgreement save(NewAgreement NewAgreement);
    NewAgreement findById(Long id);
    List<NewAgreement> findAll();
    NewAgreement update(Long id, NewAgreement newAgreement);
    void deleteById(Long id);
}
