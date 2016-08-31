package com.bjfu.it.ye6hao.tabfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bjfu.it.ye6hao.tabfragment.news.TabAdapter;
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

		/**
		 *
		 *加载tab_weixin_01.xml中的内容，里面是一个TabPageIndicator和ViewPager
		 *
		 */
		View viewRoot = inflater.inflate(R.layout.tab_weixin_01, null);



		/**我们先实例化ViewPager,然后实例化TabPageIndicator，
		 * 并且要设置TabPageIndicator和ViewPager关联，
		 * 就是调用TabPageIndicator的setViewPager(ViewPager view)方法，
		 * 这样子我们就实现了点击上面的Tab，下面的ViewPager切换，滑动ViewPager上面的Tab跟着切换，ViewPager的每一个Item我们使用的是Fragment*/

		//我们先实例化ViewPager,然后实例化TabPageIndicator，
		//这一步非常关键 TabAdapter(getChildFragmentManager());
		FragmentPagerAdapter adapter = new TabAdapter(getChildFragmentManager());

		ViewPager pager = (ViewPager) viewRoot.findViewById(R.id.id_pager);
		pager.setAdapter(adapter);

		//实例化TabPageIndicator然后设置ViewPager与之关联
		TabPageIndicator indicator = (TabPageIndicator) viewRoot.findViewById(R.id.id_indicator);
		indicator.setViewPager(pager, 0);



/*
		//如果我们要对ViewPager设置监听，用indicator设置就行了
		indicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

			@Override
			public void onPageSelected(int arg0) {
				//点击二级菜单提示信息！！
				//Toast.makeText(getActivity(), TabAdapter.TITLES[arg0], Toast.LENGTH_SHORT).show();
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {

			}

			@Override
			public void onPageScrollStateChanged(int arg0) {

			}
		});
*/


		return viewRoot;
	}




}
