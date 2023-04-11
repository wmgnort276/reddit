package com.bezkoder.springjwt;

import lombok.Data;

@Data
public class Src {
    private String name;
    private int age;

    public Src(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
