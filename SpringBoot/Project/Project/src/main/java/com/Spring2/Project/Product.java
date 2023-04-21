package com.Spring2.Project;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Student {
    // name ,unique roll no , branch - CSE/IT/EE/ME/BT

    private String name;

    private long rollN0;

    private Branch branch;

    private float marks;

}
