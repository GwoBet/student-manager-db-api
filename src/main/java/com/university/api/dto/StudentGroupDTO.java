package com.university.api.dto;

import com.university.api.dto.base.BaseDTO;
import lombok.Data;

import java.time.LocalDate;

@Data
public class StudentGroupDTO implements BaseDTO {
    private String groupId;
    private LocalDate creationDate;
}
