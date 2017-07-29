package com.androidedu.kodluyoruzakademi.activityfragmentlifecycle;

import android.app.Fragment;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MixedLifeCycleActivity extends AppCompatActivity {

    private final String MAIN_TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        printLog(MAIN_TAG, "Before onCreate");
        setContentView(R.layout.activity_mixed_life_cycle);
        printLog(MAIN_TAG, "After onCreate");


        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        CFragment cFragment = new CFragment();
        fragmentTransaction.add(R.id.dynamicFragment, cFragment);
        fragmentTransaction.commit();

    }

    @Override
    protected void onStart() {
        super.onStart();
        printLog(MAIN_TAG, "onStart");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        printLog(MAIN_TAG, "onRestoreInstanceState");
    }

    @Override
    protected void onResume() {
        super.onResume();
        printLog(MAIN_TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        printLog(MAIN_TAG, "onPause");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        printLog(MAIN_TAG, "onSaveInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
        printLog(MAIN_TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        printLog(MAIN_TAG, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        printLog(MAIN_TAG, "onRestart");
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        printLog(MAIN_TAG, "onAttachFragment");
    }

    public String printLog(String TAG, String methodName) {
        Log.e(TAG, methodName);
        return methodName;
    }



}
