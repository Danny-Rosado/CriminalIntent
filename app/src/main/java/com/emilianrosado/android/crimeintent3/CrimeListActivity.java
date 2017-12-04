package com.emilianrosado.android.crimeintent3;

import android.support.v4.app.Fragment;

/**
 * Created by Danny on 30/11/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
