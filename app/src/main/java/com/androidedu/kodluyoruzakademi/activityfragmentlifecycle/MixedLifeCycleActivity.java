package com.androidedu.kodluyoruzakademi.activityfragmentlifecycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MixedLifeCycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mixed_life_cycle);
    }
}
