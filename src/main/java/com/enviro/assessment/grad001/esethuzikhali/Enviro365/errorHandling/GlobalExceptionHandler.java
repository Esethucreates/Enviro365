package com.enviro.assessment.grad001.esethuzikhali.Enviro365.errorHandling;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.time.Instant;

@ControllerAdvice
public class GlobalExceptionHandler {
    // Handle defined errors in service impl
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponsePOJO> handleResourceNotFoundException(ResourceNotFoundException ex) {
        ErrorResponsePOJO error = new ErrorResponsePOJO(
                HttpStatus.NOT_FOUND.value(),
                ex.getMessage(),
                Instant.now().toEpochMilli()
        );
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    // Handle empty name fields
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ErrorResponsePOJO> handleIllegalArgumentException(IllegalArgumentException ex) {
        ErrorResponsePOJO error = new ErrorResponsePOJO(
                HttpStatus.BAD_REQUEST.value(),
                ex.getMessage(),
                Instant.now().toEpochMilli()
        );
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    // Handle invalid path variable non-integer passed
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<ErrorResponsePOJO> handleTypeMismatch(MethodArgumentTypeMismatchException ex) {
        ErrorResponsePOJO error = new ErrorResponsePOJO(HttpStatus.BAD_REQUEST.value(),
                "Invalid path variable: Expected an integer but received a different format.",
                Instant.now().toEpochMilli());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }


    //  Handle database constraint for unique items
    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<ErrorResponsePOJO> handleDataIntegrityViolation(DataIntegrityViolationException ex) {
        ErrorResponsePOJO errorResponse = new ErrorResponsePOJO(HttpStatus.CONFLICT.value(), "Database constraint violation: " + ex.getMessage(), Instant.now().toEpochMilli());
        return new ResponseEntity<>(errorResponse, HttpStatus.CONFLICT);
    }

    //  handle General Exceptions
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponsePOJO> handleGlobalException(Exception ex) {
        ErrorResponsePOJO error = new ErrorResponsePOJO(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                "An unexpected error occurred.",
                Instant.now().toEpochMilli()
        );
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
