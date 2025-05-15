package com.services.uninunezrni.curriculum.mirrorClass.infrastructure.adapters.input.rest.advice;

import com.services.uninunezrni.common.error.ErrorResponse;
import com.services.uninunezrni.curriculum.mirrorClass.domain.exception.MirrorClassNotFoundException;
import com.services.uninunezrni.curriculum.mirrorClass.infrastructure.adapters.input.rest.adapter.MirrorClassRestAdapter;
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

import static com.services.uninunezrni.curriculum.mirrorClass.utils.ErrorCatalog.*;

@RestControllerAdvice(assignableTypes = {MirrorClassRestAdapter.class})
public class MirrorClassControllerAdvice {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(MirrorClassNotFoundException.class)
    public ErrorResponse handleMirrorClassNotFoundException() {
        return ErrorResponse.builder()
                .code(MIRRORCLASS_NOT_FOUND.getCode())
                .message(MIRRORCLASS_NOT_FOUND.getMessage())
                .timestamp(LocalDateTime.now())
                .build();
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ErrorResponse handleMethodArgumentNotValidException (MethodArgumentNotValidException exception) {

        BindingResult result = exception.getBindingResult();

        return ErrorResponse.builder()
                .code(INVALID_MIRRORCLASS.getCode())
                .message(INVALID_MIRRORCLASS.getMessage())
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
