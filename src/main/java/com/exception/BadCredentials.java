package com.exception;

import org.springframework.security.authentication.BadCredentialsException;

public class BadCredentials extends BadCredentialsException {
    public BadCredentials(String s) {
        super(s);
    }
}
