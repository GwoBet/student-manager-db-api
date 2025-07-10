package com.university.api;

import lombok.Data;

@Data
public class ApiResponse<R> {

    private R response;
    private ExceptionDTO exception;
}
