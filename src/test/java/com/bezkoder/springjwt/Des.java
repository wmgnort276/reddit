package com.bezkoder.springjwt;

import lombok.Data;

@Data
public class Des {
    private String name;
    private int age;

    public Des(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
