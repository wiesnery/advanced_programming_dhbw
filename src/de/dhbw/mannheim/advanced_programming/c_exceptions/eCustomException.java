package de.dhbw.mannheim.advanced_programming.c_exceptions;

// 1. extend from RuntimeException for unchecked and from Exception for checked exceptions
public class eCustomException extends RuntimeException {

    // 2. custom exceptions can carry specific payload which for example can help to indicate the error to the user
    final String userErrorMessage;

    public eCustomException(String userErrorMessage) {
        this.userErrorMessage = userErrorMessage;
    }
}
