package com.services.uninunezrni.governance.application.service;

import com.services.uninunezrni.governance.application.ports.input.NewAgreementServicePort;
import com.services.uninunezrni.governance.application.ports.output.NewAgreementPersistencePort;
import com.services.uninunezrni.governance.domain.exception.AgreementNotFoundException;
import com.services.uninunezrni.governance.domain.exception.NewAgreementNotFoundException;
import com.services.uninunezrni.governance.domain.model.NewAgreement;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NewAgreementService implements NewAgreementServicePort {

    private final NewAgreementPersistencePort persistencePort;

    @Override
    public NewAgreement save(NewAgreement newAgreement) { return persistencePort.save(newAgreement); }

    @Override
    public NewAgreement findById(Long id) {
        return persistencePort.findById(id)
                .orElseThrow(NewAgreementNotFoundException::new);
    }

    @Override
    public List<NewAgreement> findAll() {
        return persistencePort.findAll();

    }

    @Override
    public NewAgreement update(Long id, NewAgreement newAgreement) {
        return persistencePort.findById(id)
                .map(savedNewAgreement -> {
                    savedNewAgreement.setNewAgreement(newAgreement.getNewAgreement());
                    return persistencePort.save(savedNewAgreement);
                })
                .orElseThrow(AgreementNotFoundException::new);
    }

    @Override
    public void deleteById(Long id) {
        if (persistencePort.findById(id).isEmpty()) {
            throw new NewAgreementNotFoundException();
        }
        persistencePort.deleteById(id);
    }
}
