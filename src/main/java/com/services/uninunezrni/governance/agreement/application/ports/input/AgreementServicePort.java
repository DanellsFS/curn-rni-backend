package com.services.uninunezrni.governance.agreement.application.ports.input;

import com.services.uninunezrni.governance.agreement.domain.model.Agreement;

import java.util.List;

public interface AgreementServicePort {
    Agreement save(Agreement agreement);
    Agreement findById(Long id);
    List<Agreement> findAll();
    Agreement update(Long id, Agreement agreement);
    void deleteById(Long id);
}

