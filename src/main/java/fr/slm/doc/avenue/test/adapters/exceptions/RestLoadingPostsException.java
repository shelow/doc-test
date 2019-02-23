package fr.slm.doc.avenue.test.adapters.exceptions;

import fr.slm.doc.avenue.test.domain.exceptions.LoadingPostsException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class RestLoadingPostsException extends LoadingPostsException {
    public RestLoadingPostsException(String message, LoadingPostsException e) {
        super(message, e);
    }
}
