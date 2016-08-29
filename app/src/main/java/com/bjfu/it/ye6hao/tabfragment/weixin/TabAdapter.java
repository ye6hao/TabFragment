package com.bjfu.it.ye6hao.tabfragment.weixin;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabAdapter extends FragmentPagerAdapter
{

	public static final String[] TITLES = new String[] {"推荐","人文社会", "经济管理", "艺术文化", "创业创新","科学生活","其他" };

	public TabAdapter(FragmentManager fm)
	{
		super(fm);
	}

	@Override
	public Fragment getItem(int arg0)
	{
		MainFragment fragment = new MainFragment(arg0);
		return fragment;
	}

	@Override
	public CharSequence getPageTitle(int position)
	{
		return TITLES[position % TITLES.length];
	}

	@Override
	public int getCount()
	{
		return TITLES.length;
	}

}
