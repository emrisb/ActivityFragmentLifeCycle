package com.androidedu.kodluyoruzakademi.activityfragmentlifecycle;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class BFragment extends Fragment {

    private final String MAIN_TAG = "BFragment";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        printLog(MAIN_TAG, "Before onCreate");
        super.onCreate(savedInstanceState);
        printLog(MAIN_TAG, "After onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        printLog(MAIN_TAG, "Before onCreateView");
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        printLog(MAIN_TAG, "After onCreateView");
        return view;
    }


    @Override
    public void onStart() {
        super.onStart();
        printLog(MAIN_TAG, "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        printLog(MAIN_TAG, "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        printLog(MAIN_TAG, "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        printLog(MAIN_TAG, "onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        printLog(MAIN_TAG, "onDestroy");
    }

    public String printLog(String TAG, String methodName) {
        Log.e(TAG, methodName);
        return methodName;
    }

}
