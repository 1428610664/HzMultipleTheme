package hz.com.hzmultipletheme;

import android.app.Application;

import hz.com.hzmultipletheme.colorUi.util.SharedPreferencesMgr;


/**
 * Created by chengli on 15/6/14.
 */
public class MyApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        SharedPreferencesMgr.init(this, "derson");
    }
}
