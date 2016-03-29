package com.anthony.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

/**
 * Created by anthony on 25/3/16.
 */
public abstract class SingleFragmentActivity extends FragmentActivity{


    protected abstract Fragment createFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        FragmentManager fm = getSupportFragmentManager();
        Fragment f = fm.findFragmentById(R.id.fragment_container);

        if(f == null){
            f = createFragment();
            fm.beginTransaction().add(R.id.fragment_container, f).commit();
        }
    }
}
