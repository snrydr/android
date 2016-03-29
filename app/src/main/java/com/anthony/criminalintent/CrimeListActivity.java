package com.anthony.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by anthony on 25/3/16.
 */
public class CrimeListActivity extends SingleFragmentActivity{


    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
