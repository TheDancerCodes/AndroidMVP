package com.thedancercodes.androidmvp;

import android.app.Application;

/**
 * Created by TheDancerCodes on 16/01/2018.
 */

public class App extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        // Define all the modules that we have in the app.
        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getComponent(){
        return component;
    }
}
