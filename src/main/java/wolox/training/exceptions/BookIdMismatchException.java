package wolox.training.exceptions;

public class BookIdMismatchException extends RuntimeException {

    public BookIdMismatchException(long expectedId, long actualId) {
        super("The id " + actualId + "does not match with " + expectedId);
    }
}