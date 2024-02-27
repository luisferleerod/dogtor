package com.example.demo.controlador;

public class notFoundException extends RuntimeException {

    private Integer id;

    public notFoundException(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

