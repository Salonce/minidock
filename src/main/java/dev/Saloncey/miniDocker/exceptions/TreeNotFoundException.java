package dev.Saloncey.miniDocker.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "tree not found")
public class TreeNotFoundException extends RuntimeException{
    public TreeNotFoundException(String message){
        super(message);
    }
}
