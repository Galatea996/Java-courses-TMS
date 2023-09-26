package HomeWork10.Task2;

public class SequenceStrException extends Exception{
    public SequenceStrException() {
    }

    public SequenceStrException(String message) {
        super(message);
    }

    public SequenceStrException(String message, Throwable cause) {
        super(message, cause);
    }

    public SequenceStrException(Throwable cause) {
        super(cause);
    }

    public SequenceStrException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
