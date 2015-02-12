package com.learn2crack.tab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabPagerAdapter extends FragmentStatePagerAdapter {
    public TabPagerAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int i) {
		switch (i) {
        case 0:
            //Fragment for Android Tab
            return new Login();
        case 1:
           //Fragment for Ios Tab
            return new SignUp();
        //case 2:
            //Fragment for Windows Tab
        //    return new Windows();
        //case 3:
        //    return new Test();
        }

		return null;
		
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 2; //No of Tabs
	}


    }