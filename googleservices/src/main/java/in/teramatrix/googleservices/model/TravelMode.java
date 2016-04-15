package in.teramatrix.googleservices.model;

/**
 * <pre>
 * Author       :   Mohsin Khan
 * Date         :   3/22/2016
 * Description  :   For the calculation of distances and routes, you may specify the transportation mode to use.
 *                  By default, distances are calculated for driving mode. The following travel modes are supported:
 *
 *                  <u>driving (default)</u> indicates distance calculation using the road network.
 *
 *                  <u>walking</u> requests distance calculation for walking via pedestrian paths & sidewalks (where available).
 *
 *                  <u>bicycling</u> requests distance calculation for bicycling via bicycle paths & preferred streets (where available).
 *
 *                  <u>transit</u> requests distance calculation via public transit routes (where available).
 *                  This value may only be specified if the request includes an API key or a Google Maps APIs Premium Plan client ID.
 *                  If you set the mode to transit you can optionally specify either a departure_time or an arrival_time.
 *                  If neither time is specified, the departure_time defaults to now (that is, the departure time defaults to the current time).
 *                  You can also optionally include a transit_mode and/or a transit_routing_preference.
 * </pre>
 */
@SuppressWarnings("unused")
public final class TravelMode {
    public static final String MODE_DRIVING = "driving";
    public static final String MODE_WALKING = "walking";
    public static final String MODE_TRANSIT = "transit";
    public static final String MODE_BICYCLING = "bicycling";
}
