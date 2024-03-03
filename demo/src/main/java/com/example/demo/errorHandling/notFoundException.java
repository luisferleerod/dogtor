package com.example.demo.errorHandling;

public class notFoundException extends RuntimeException {

    private Long id;

    public notFoundException(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

