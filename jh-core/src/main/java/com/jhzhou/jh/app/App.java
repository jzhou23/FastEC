package com.jhzhou.jh.app;

import android.content.Context;

import java.util.WeakHashMap;

/**
 * Created by jhzhou on 1/1/18.
 */

public class App {

    public static Configurator init(Context context) {
        getConfigurations().put(ConfigType.APPLICATION_CONTEXT.name(), context.getApplicationContext());
        return Configurator.getInstance();
    }

    private static WeakHashMap<String, Object> getConfigurations() {
        return Configurator.getInstance().getConfigs();
    }
}
