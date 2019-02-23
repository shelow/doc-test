package fr.slm.doc.avenue.test.domain.exceptions;

public class PostNotFoundException extends Throwable {
    public PostNotFoundException(String message) {
        super(message);
    }
}
