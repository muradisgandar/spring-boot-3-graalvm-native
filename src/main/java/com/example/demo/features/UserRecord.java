package com.example.demo.features;

public record UserRecord(String name, Integer age) {

    public UserRecord { // constructor
        if (name == null) {
            throw new NullPointerException("Name is null");
        }
    }
}
