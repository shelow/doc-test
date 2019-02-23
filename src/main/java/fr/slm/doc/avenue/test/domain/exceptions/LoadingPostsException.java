package fr.slm.doc.avenue.test.domain.exceptions;

public class LoadingPostsException extends Throwable {
    public LoadingPostsException(String message) {
        super(message);
    }

    public LoadingPostsException(String message, Throwable e) {
        super(message, e);
    }
}
