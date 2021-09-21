package io.movierate.moviecatalogservice.models;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class HelloWorld {
    private String message;

    public HelloWorld() {}

    public HelloWorld(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
