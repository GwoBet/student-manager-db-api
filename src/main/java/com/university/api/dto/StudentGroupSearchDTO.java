package com.university.api.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class StudentGroupSearchDTO extends StudentGroupDTO {

    private Integer studentsCount;
}