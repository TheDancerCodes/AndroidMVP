package com.thedancercodes.androidmvp;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by TheDancerCodes on 16/01/2018.
 */

@Module
public class ApplicationModule {

    private Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    // Specifying a Context that uses @Singleton that can be used as a part of the dependency list.
    public Context provideContext(){
        return application;
    }
}
