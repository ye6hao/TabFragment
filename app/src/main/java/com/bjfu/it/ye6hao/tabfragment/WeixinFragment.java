package com.bjfu.it.ye6hao.tabfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bjfu.it.ye6hao.tabfragment.weixin.TabAdapter;
import com.viewpagerindicator.TabPageIndicator;

public class WeixinFragment extends Fragment
{


	private TabPageIndicator mIndicator ;
	private ViewPager mViewPager ;
	private FragmentPagerAdapter mAdapter ;


	@Override
	public void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState)
	{

		View viewRoot = inflater.inflate(R.layout.tab_weixin_01, null);

		FragmentPagerAdapter adapter = new TabAdapter(getChildFragmentManager());

		ViewPager pager = (ViewPager) viewRoot.findViewById(R.id.id_pager);

		pager.setAdapter(adapter);

		TabPageIndicator indicator = (TabPageIndicator) viewRoot.findViewById(R.id.id_indicator);

		indicator.setViewPager(pager,0);

		return viewRoot;
	}
}
