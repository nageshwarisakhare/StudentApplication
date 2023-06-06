package com.drc.assessment.StudentApplication.exceptions;

public class AlreadyExistException extends RuntimeException {
    private static final long serialVersionUID = 5344320715962995240L;
    private String message;


    public AlreadyExistException(String message) {
        super(String.format(message));
        this.message = message;

    }

    public String getMessage() {
        return message;
    }

}
