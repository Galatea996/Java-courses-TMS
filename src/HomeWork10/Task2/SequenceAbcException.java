package HomeWork10.Task2;

public class SequenceAbcException extends Exception{
    public SequenceAbcException() {
    }

    public SequenceAbcException(String message) {
        super(message);
    }

    public SequenceAbcException(String message, Throwable cause) {
        super(message, cause);
    }

    public SequenceAbcException(Throwable cause) {
        super(cause);
    }

    public SequenceAbcException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
