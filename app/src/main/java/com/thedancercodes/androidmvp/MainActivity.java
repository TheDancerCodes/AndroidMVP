package com.thedancercodes.androidmvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inject a Context into our MainActivity.
        ((App) getApplication()).getComponent().inject(this);
    }
}
