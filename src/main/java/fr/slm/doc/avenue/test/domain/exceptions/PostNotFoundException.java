package fr.slm.doc.avenue.test.domain.exceptions;

public class PostNotFoundException extends Throwable {
    public PostNotFoundException(String message) {
        super(message);
    }

    public PostNotFoundException(String message, PostNotFoundException e) {
        super(message, e);
    }
}
