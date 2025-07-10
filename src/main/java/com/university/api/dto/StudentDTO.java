package com.university.api.dto;

import com.university.api.dto.base.BaseDTO;
import lombok.Data;

import java.time.LocalDate;

@Data
public class StudentDTO implements BaseDTO {
    private Integer id;
    private String name;
    private LocalDate acceptanceDate;
    private String groupId;
}