package com.drc.assessment.StudentApplication.exceptions;

public class InvalidEmailException extends RuntimeException {

    private static final long serialVersionUID = 5344320715962995240L;
    private String message;

    public InvalidEmailException(String message) {
        super(message);
        this.message = message;

    }

    public String getMessage() {
        return message;
    }

}
