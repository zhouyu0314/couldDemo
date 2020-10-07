package com.gy.exceptions;

public class LoginTimeOutException extends ServiceException {
    public LoginTimeOutException() {
        super();
    }

    public LoginTimeOutException(String message) {
        super(message);
    }

    public LoginTimeOutException(String message, Throwable cause) {
        super(message, cause);
    }

    public LoginTimeOutException(Throwable cause) {
        super(cause);
    }

    protected LoginTimeOutException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
