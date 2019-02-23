package fr.slm.doc.avenue.test.adapters.exceptions;

import fr.slm.doc.avenue.test.domain.exceptions.PostNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RestPostNotFoundException extends PostNotFoundException {
    public RestPostNotFoundException(String message, PostNotFoundException e) {
        super(message, e);
    }
}
