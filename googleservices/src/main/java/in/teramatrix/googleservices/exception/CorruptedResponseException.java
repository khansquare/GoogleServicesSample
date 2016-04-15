package in.teramatrix.googleservices.exception;

/**
 * <pre>
 * Author       :   Mohsin Khan
 * Date         :   3/18/2016
 * Description  :   It's a custom exception specially designed for some critical events. This is related
 *                  to the server's response.
 * </pre>
 */
public class CorruptedResponseException extends Exception {
    private String message = null;

    public static final String NULL_RESPONSE = "Null response from the server";
    public static final String STATUS_NOT_OK = "Response status is not OK";
    public static final String EMPTY_ARRAY = "Results array is empty";

    public CorruptedResponseException() {
        super();
    }

    public CorruptedResponseException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
