package in.teramatrix.googleservices.model;

/**
 * <pre>
 * Author       :   Mohsin Khan
 * Date         :   1/6/2016
 * Description  :   ...
 * </pre>
 */
@SuppressWarnings("unused")
public class Distance {
    private String origin;
    private String destination;
    private String durationText;
    private float durationValue;
    private String distanceText;
    private float distanceValue;

    public Distance() {
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDurationText() {
        return durationText;
    }

    public void setDurationText(String durationText) {
        this.durationText = durationText;
    }

    public float getDurationValue() {
        return durationValue;
    }

    public void setDurationValue(float durationValue) {
        this.durationValue = durationValue;
    }

    public String getDistanceText() {
        return distanceText;
    }

    public void setDistanceText(String distanceText) {
        this.distanceText = distanceText;
    }

    public float getDistanceValue() {
        return distanceValue;
    }

    public void setDistanceValue(float distanceValue) {
        this.distanceValue = distanceValue;
    }

    @Override
    public String toString() {
        return "Distance{" +
                "From='" + origin + '\'' +
                ", To='" + destination + '\'' +
                ", Duration='" + durationText + '\'' +
                ", Distance='" + distanceText + '\'' +
                '}';
    }
}