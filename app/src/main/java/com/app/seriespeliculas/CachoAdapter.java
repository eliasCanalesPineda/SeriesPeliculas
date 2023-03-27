package com.app.seriespeliculas;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class CachoAdapter extends FragmentStateAdapter {

    ArrayList<Fragment> fragments;


    public CachoAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);

        fragments = new ArrayList<Fragment>();
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragments.get(position);
    }

    public void addFragment(Fragment fragment){
        fragments.add(fragment);
    }

    @Override
    public int getItemCount() {
        return fragments.size();
    }
}
