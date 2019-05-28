package info.androidhive.admob;

        import android.app.Application;
        import com.android.google.M

/**
 * Created by ravi on 25/12/17.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // initialize the AdMob app
        MobileAds.initialize(this, getString(R.string.admob_app_id));
    }
}
