package com.thedancercodes.androidmvp;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by TheDancerCodes on 16/01/2018.
 */

@Singleton
@Component(modules = ApplicationComponent.class)

// Application Component shows Dagger where to inject the dependencies to.
public interface ApplicationComponent {

    // Activities, Services or Fragments that can be added here should be declared
    // here with individual inject methods.
    void inject (MainActivity target);
}
