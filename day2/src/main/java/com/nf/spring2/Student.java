package com.nf.spring2;

import java.util.UUID;

public class Student {
    private final String id;

    public String getId() {
        return id;
    }

    private String name;


    public Student() {
        this.id = UUID.randomUUID().toString();
      //  this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
