package pe.dhexsoft.CrudBasic.exception;


import java.time.LocalDateTime;

//esta clase tiene como funcion principal ser la plantilla para devolver la informacion hacia el cliente
public class ErrorDetails {
    private LocalDateTime timeStamp;
    private String message;
    private String path;
    private String errorCode;

    //constructores
    public ErrorDetails() {
    }

    public ErrorDetails(LocalDateTime timeStamp, String message, String path, String errorCode) {
        this.message = message;
        this.path = path;
        this.errorCode = errorCode;
        this.timeStamp = timeStamp;
    }

    //getter and setter
    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
