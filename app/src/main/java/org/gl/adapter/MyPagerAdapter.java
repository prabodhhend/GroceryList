package org.gl.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import org.gl.fragment.AboutUSFragment;
import org.gl.fragment.MainFragment;
import org.gl.fragment.MyListFragment;
import org.gl.fragment.PrivacyPolicyFragment;
import org.gl.fragment.ProfileFragment;
import org.gl.fragment.SettingsFragment;

/**
 * Created by honey on 3/16/2016.
 */
public class MyPagerAdapter extends FragmentPagerAdapter {

    private static int NUM_ITEMS = 6;


    public MyPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);

    }

    // Returns total number of pages
    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new MainFragment();
                break;
            case 1:
                fragment = new MyListFragment();
                break;
            case 2:
                fragment = new ProfileFragment();
                break;
            case 3:
                fragment = new AboutUSFragment();
                break;
            case 4:
                fragment = new PrivacyPolicyFragment();
                break;
            case 5:
                fragment = new SettingsFragment();
                break;
            default:
                return null;
        }

        return fragment;
    }

    // Returns the page title for the top indicator
    @Override
    public CharSequence getPageTitle(int position) {
        return "Page " + position;
    }

    @Override
    public int getItemPosition(Object object) {

        return POSITION_NONE;

    }

}
