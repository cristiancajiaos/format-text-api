package com.example.opr.model;

public class OpResult {
    private final Long id;
    private final String result;

    public OpResult(Long id, String result) {
        this.id = id;
        this.result = result;
    }

    public Long getId() {
        return id;
    }

    public String getResult() {
        return result;
    }
}

