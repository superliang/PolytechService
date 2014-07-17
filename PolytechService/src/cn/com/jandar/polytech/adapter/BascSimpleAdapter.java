package cn.com.jandar.polytech.adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class BascSimpleAdapter extends BaseAdapter{
	private List<HashMap<String,String>> adapterData = new ArrayList<HashMap<String,String>>();

	@Override
	public int getCount() {
		return adapterData.size();
	}

	@Override
	public Object getItem(int position) {
		return adapterData.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		
		return null;
	}

}
