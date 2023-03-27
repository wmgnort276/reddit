package com.bezkoder.springjwt.payload.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Data
public class SubRedditRequest {
    @NotBlank(message = "user can not be blank")
    private String name;
    @NotEmpty()
    private String description;
}
