package com.example.outsourcing.common.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum CommonErrorCode implements ErrorCode {

    INVALID_PARAMETER(HttpStatus.BAD_REQUEST, "파라미터 오류입니다."),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "서버 오류 입니다."),
    CONSTRAINT_DUPLICATION_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "하나의 값만 가질 수 있습니다.")
    ;


    private final HttpStatus httpStatus;
    private final String message;
}
