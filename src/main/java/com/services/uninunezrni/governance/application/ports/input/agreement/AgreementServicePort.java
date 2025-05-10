package com.services.uninunezrni.governance.application.ports.input.agreement;

import com.services.uninunezrni.governance.domain.model.agreement.Agreement;

import java.util.List;

public interface AgreementServicePort {
    Agreement save(Agreement agreement);
    Agreement findById(Long id);
    List<Agreement> findAll();
    Agreement update(Long id, Agreement agreement);
    void deleteById(Long id);
}

