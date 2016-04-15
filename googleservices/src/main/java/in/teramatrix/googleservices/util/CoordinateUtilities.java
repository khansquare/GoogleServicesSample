package in.teramatrix.googleservices.util;

import android.location.Location;
import android.util.Log;

import com.google.android.gms.maps.model.LatLng;

import java.util.Date;

/**
 * <pre>
 * Author       :   Mohsin Khan
 * Date         :   4/15/2016
 * Description  :   Implemented methods are some basic operation on Coordinate system.
 * </pre>
 */
@SuppressWarnings("unused")
public class CoordinateUtilities {
    /**
     * Method will simply convert a {@link Location} instance to string and log it.
     * @param current to be logged in logcat
     * @param recent if want to see distance from previous location then pass last {@link Location}
     */
    public static void logDetails(Location current, Location recent) {
        if (current != null) {
            Log.e("Location", "Accuracy: " + current.getAccuracy()
                            + "|Speed: " + current.getSpeed()
                            + "|LatLng: " + current.getLatitude() + ", " + current.getLongitude()
                            + "|Time: " + new Date(current.getTime()).toString()
                            + "|Provider: " + current.getProvider().toUpperCase()
                            + ((recent != null) ? "|Distance: " + current.distanceTo(recent) : ""));
        }
    }

    /**
     * @param a first location
     * @param b second location
     * @return true if a & b have similar latitude and longitude
     */
    public static boolean isEqual(Location a, Location b) {
        if (a.getLatitude() == b.getLatitude())
            if (a.getLongitude() == b.getLongitude())
                return true;
        return false;
    }

    /**
     * @param a first location
     * @param b second location
     * @return true if a & b have similar latitude and longitude
     */
    public static boolean isEqual(LatLng a, LatLng b) {
        if (a.latitude==b.latitude)
            if (a.longitude==b.longitude)
                return true;
        return false;
    }

    /**
     * @param a starting point
     * @param b ending point
     * @return center point from starting to ending point
     */
    public static LatLng midPoint(LatLng a, LatLng b){
        double lat1 = Math.toRadians(a.latitude);
        double lat2 = Math.toRadians(b.latitude);
        double lon1 = Math.toRadians(a.longitude);
        double lon2 = b.longitude;
        double dLon = Math.toRadians(lon2 - a.longitude);
        double Bx = Math.cos(lat2) * Math.cos(dLon);
        double By = Math.cos(lat2) * Math.sin(dLon);
        return new LatLng(Math.toDegrees(Math.atan2(Math.sin(lat1) + Math.sin(lat2), Math.sqrt((Math.cos(lat1) + Bx) * (Math.cos(lat1) + Bx) + By * By))),
                Math.toDegrees(lon1 + Math.atan2(By, Math.cos(lat1) + Bx)));
    }
}
