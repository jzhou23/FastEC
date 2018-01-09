package com.jhzhou.fastec;

import android.app.Application;

import com.jhzhou.jh.app.App;

/**
 * Created by jhzhou on 1/8/18.
 */

public class ExampleApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        App.init(this)
                .configure();
    }
}
