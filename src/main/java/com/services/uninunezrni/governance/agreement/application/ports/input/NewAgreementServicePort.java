package com.services.uninunezrni.governance.agreement.application.ports.input;

import com.services.uninunezrni.governance.agreement.domain.model.NewAgreement;

import java.util.List;

public interface NewAgreementServicePort {
    NewAgreement save(NewAgreement NewAgreement);
    NewAgreement findById(Long id);
    List<NewAgreement> findAll();
    NewAgreement update(Long id, NewAgreement newAgreement);
    void deleteById(Long id);
}
