package pe.dhexsoft.CrudBasic.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice    //esta clase va ser como interceptor entre toda las peticiones q haga el cliente al backend
public class GlobalExceptionHandler {

    //dentro ResponseeEntity yo voy devolver objetos de tipo ErrorDetails
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorDetails> handleResourceNotFoundException(ResourceNotFoundException ex,
                                                                        WebRequest webRequest){  //que hace el metodo: captura toda las peticiones pero captura especificamente las excepciones de tipo ResourceNotFoundException
        ErrorDetails error = new ErrorDetails (
                LocalDateTime.now(),
                ex.getMessage(),
                webRequest.getDescription(false),
                "NOT FOUND"
        );
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
