package com.bjfu.it.ye6hao.tabfragment.news;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.bjfu.it.ye6hao.tabfragment.R;

import java.util.ArrayList;
import java.util.List;


@SuppressLint("ValidFragment")
public class NewsTitleFragment extends ListFragment
{

	private  MyAdapter myAdapter;

	private int newsType = 0;

	//根据类型，查询不同类别的讲座
	public NewsTitleFragment(int newsType)
	{
		this. newsType = newsType;
	}


	@Override
	public void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		myAdapter =new MyAdapter();
		myAdapter.bindData(getData());
	}

	//设置数据源
	public  List<String> getData(){
		List<String> list =new ArrayList<String>();
		for( int i=1;i<10;i++){
			list.add("jack"+i);
		}
		return list;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{

		View view = inflater.inflate(R.layout.tab_item_fragment_main, null);

		//这里不一样，关键地方
		setListAdapter(myAdapter);

		return view;

	}

	//ListView点击事件
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {

		super.onListItemClick(l, v, position, id);
		String item = myAdapter.getItem(position).toString();
		Toast.makeText(getActivity(), "--->" + item, Toast.LENGTH_SHORT).show();
	}

	//自定义适配器
	class MyAdapter extends BaseAdapter{

		private List<String> list;

		public void bindData(List<String> list){
			this.list = list;
		}

		@Override
		public int getCount() {
			return  list.size();
		}

		@Override
		public Object getItem(int position) {
			return list.get(position);
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup viewGroup) {
			View view = null;
			if (convertView == null) {
				view = LayoutInflater.from(getActivity()).inflate(
						R.layout.news_item, null);
			} else {
				view = convertView;
			}

			TextView textView = (TextView) view.findViewById(R.id.news_title);
			textView.setText(list.get(position).toString());
			return view;
		}
	}






}
