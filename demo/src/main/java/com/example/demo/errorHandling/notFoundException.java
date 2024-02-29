package com.example.demo.errorHandling;

public class notFoundException extends RuntimeException {

    private Long id;

    public notFoundException(Long id2) {
        this.id = id2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

