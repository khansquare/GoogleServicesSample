package in.teramatrix.googleservices;

/**
 * <pre>
 * Author       :   Mohsin Khan
 * Date         :   3/21/2016
 * Description  :   An interface to publish results in the caller classes. By implementing this,
 *                  end user of the module can access final results.
 * </pre>
 */
public interface ResponseListener {
    /**
     * This method will invoke on Http Request failure
     * @param e Cause of failure
     */
    void onRequestFailure(Exception e);
}
