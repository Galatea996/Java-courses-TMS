package HomeWork10.Task2;

public class SequenceNumException extends Exception {
    public SequenceNumException() {
    }

    public SequenceNumException(String message) {
        super(message);
    }

    public SequenceNumException(String message, Throwable cause) {
        super(message, cause);
    }

    public SequenceNumException(Throwable cause) {
        super(cause);
    }

    public SequenceNumException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
