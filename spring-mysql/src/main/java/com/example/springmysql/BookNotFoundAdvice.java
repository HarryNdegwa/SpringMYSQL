package com.example.springmysql;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class BookNotFoundAdvice {

    @ResponseBody // injects the status content to the response body
    @ExceptionHandler(BookNotFoundException.class) // specifies the class to handle the exception
    @ResponseStatus(HttpStatus.NOT_FOUND) // specifies the status of the exception
    String BookNotFoundExceptionHandler(BookNotFoundException ex) {
        return ex.getMessage();
    }

}
