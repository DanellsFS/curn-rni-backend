package com.services.uninunezrni.governance.agreement.infrastructure.adapters.input.rest.advice;

import com.services.uninunezrni.governance.agreement.domain.exception.NewAgreementNotFoundException;
import com.services.uninunezrni.common.error.ErrorResponse;
import com.services.uninunezrni.governance.agreement.infrastructure.adapters.input.rest.adapter.AgreementRestAdapter;
import com.services.uninunezrni.governance.agreement.infrastructure.adapters.input.rest.adapter.NewAgreementRestAdapter;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.stream.Collectors;

import static com.services.uninunezrni.governance.agreement.utils.ErrorCatalog.*;


@RestControllerAdvice(assignableTypes = {NewAgreementRestAdapter.class})
public class NewAgreementControllerAdvice {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NewAgreementNotFoundException.class)
    public ErrorResponse handleNewAgreementNotFoundException () {
        return ErrorResponse.builder()
                .code(NEW_AGREEMENT_NOT_FOUND.getCode())
                .message(NEW_AGREEMENT_NOT_FOUND.getMessage())
                .timestamp(LocalDateTime.now())
                .build();
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ErrorResponse handleMethodArgumentNotValidException (MethodArgumentNotValidException exception) {

        BindingResult result = exception.getBindingResult();

        return ErrorResponse.builder()
                .code(INVALID_NEW_AGREEMENT.getCode())
                .message(INVALID_NEW_AGREEMENT.getMessage())
                .details(result.getFieldErrors().stream()
                        .map(DefaultMessageSourceResolvable::getDefaultMessage).collect(Collectors.toList()))
                .timestamp(LocalDateTime.now())
                .build();
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public ErrorResponse handleGenericError (Exception exception) {
        return ErrorResponse.builder()
                .code(GENERIC_ERROR.getCode())
                .message(GENERIC_ERROR.getMessage())
                .details(Collections.singletonList(exception.getMessage()))
                .timestamp(LocalDateTime.now())
                .build();
    }
}
