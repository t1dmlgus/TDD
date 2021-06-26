package com.s1dmlgus.tdd.attendee;


import lombok.Data;

@Data
public class Attendee {

    private String name;
    private int order;


    public void add(String name) {
        this.name = name;
    }

    public String get(int i) {

        return "";
    }
}
