package com.university.api.dto;

import com.university.api.dto.base.BaseDTO;
import lombok.Data;

import java.util.List;

@Data
public class StudentGroupTableDTO implements BaseDTO {

    private long total;

    private List<StudentGroupSearchDTO> studentGroups;
}