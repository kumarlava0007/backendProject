package com.backendProject.backendProject.error;

import org.springframework.http.HttpMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ResponseStatus
@ControllerAdvice
public class CustomErrorException extends ResponseEntityExceptionHandler {
    @ExceptionHandler(UserNotFound.class)
    public ResponseEntity<ErrorMessage> usernotfound(UserNotFound exception){
        ErrorMessage errorMessage=new ErrorMessage(exception.getMessage(),HttpStatus.NOT_FOUND);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
    }
    @ExceptionHandler(BadCredential.class)
    public ResponseEntity<ErrorMessage> badcredential(BadCredential exception){
        ErrorMessage errorMessage=new ErrorMessage(exception.getMessage(),HttpStatus.UNAUTHORIZED);
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(errorMessage);
    }
}
