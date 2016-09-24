package com.example.web;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by nishina on 2016/09/24.
 */
@Data
public class CustomerForm {
    @NotNull
    @Size(min = 1, max = 127)
    private String firstName;
    @NotNull
    @Size(min = 1, max = 127)
    private String lastName;

}
