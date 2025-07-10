package com.university.api;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ExceptionDTO {

    private String exceptionName;
    private String errorMessage;
}
