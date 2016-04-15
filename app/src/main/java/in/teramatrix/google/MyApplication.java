package in.teramatrix.google;

import android.app.Application;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

/**
 * <pre>
 * Author       :   Mohsin Khan
 * Date         :   3/23/2016
 * Description  :   ...
 * </pre>
 */
public class MyApplication extends Application {
    /**
     * A Tracker instance for Google Analytics
     */
    private Tracker mTracker;

    /**
     * Gets the default {@link Tracker} for this {@link Application}.
     * @return tracker
     */
    synchronized public Tracker getDefaultTracker() {
        if (mTracker == null) {
            GoogleAnalytics analytics = GoogleAnalytics.getInstance(this);
            // To enable debug logging use: adb shell setprop log.tag.GAv4 DEBUG
            mTracker = analytics.newTracker(R.xml.global_tracker);
            mTracker.enableExceptionReporting(true);
        }
        return mTracker;
    }
}
