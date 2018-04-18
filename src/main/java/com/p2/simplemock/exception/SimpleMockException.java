package com.p2.simplemock.exception;

/**
 * Created by I335831 on 4/18/2018.
 */
public class SimpleMockException extends RuntimeException {

    private String errorMessage;

    public SimpleMockException(String errorMessage){
        super();
        this.errorMessage = errorMessage;
    }
}
