package com.example.criminalintent;

import androidx.fragment.app.Fragment;

/**
 * Класс - контроллер
 */
public class CrimeListActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
