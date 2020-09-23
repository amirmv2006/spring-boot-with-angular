package ir.amv.os.backend.adapters.rest;

import java.util.concurrent.ExecutionException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author Amir
 */
@ControllerAdvice
public class GenericRestController extends ResponseEntityExceptionHandler {

  @ExceptionHandler(ExecutionException.class)
  public ResponseEntity<Object> handleExecutionException(
      ExecutionException execExc, HttpHeaders headers, WebRequest request) {
    Exception cause =
        execExc.getCause() instanceof Exception ? (Exception) execExc.getCause() : execExc;
    return handleExceptionInternal(cause, null, headers, HttpStatus.INTERNAL_SERVER_ERROR, request);
  }

}
