package com.example.firebase;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ChemistPageAdapter extends FragmentPagerAdapter {
    public ChemistPageAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
     if(position==0){
         return new ChemistryEleven();
     }
     else {
        return  new ChemistryTweleth();
     }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
       if(position==0){
           return "11th Class";
       }
       else {
           return  "12th Class";
       }
    }
}
