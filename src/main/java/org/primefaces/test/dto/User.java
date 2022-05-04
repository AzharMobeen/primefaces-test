package org.primefaces.test.dto;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class User {

    private String fullName;
    private int age;
}