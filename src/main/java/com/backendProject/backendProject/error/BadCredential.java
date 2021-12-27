package com.backendProject.backendProject.error;

public class BadCredential extends Exception{
    public BadCredential() {
        super();
    }

    public BadCredential(String message) {
        super(message);
    }

    public BadCredential(String message, Throwable cause) {
        super(message, cause);
    }

    public BadCredential(Throwable cause) {
        super(cause);
    }

    protected BadCredential(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
