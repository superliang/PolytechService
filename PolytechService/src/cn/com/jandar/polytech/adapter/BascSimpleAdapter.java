package cn.com.jandar.polytech.adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import cn.com.jandar.polytech.R;

public class BascSimpleAdapter extends BaseAdapter {
	private LayoutInflater mInflater;
	private List<HashMap<String, String>> adapterData = new ArrayList<HashMap<String, String>>();

	public BascSimpleAdapter(Context context,
			List<HashMap<String, String>> adapterData) {
		this.mInflater = LayoutInflater.from(context);
		this.adapterData = adapterData;
	}

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
	public View getView(int position, View convertView, ViewGroup parent) {
		final ViewBoard viewBoard;
		if (convertView == null) {
			convertView = mInflater.inflate(R.layout.adapter_wdtz_list, null);
			viewBoard = new ViewBoard();
			viewBoard.id = position;
			viewBoard.title = (TextView) convertView
					.findViewById(R.id.list_item_title);
			viewBoard.content = (TextView) convertView
					.findViewById(R.id.list_item_content);
			viewBoard.time = (TextView) convertView
					.findViewById(R.id.list_item_time);
			viewBoard.isRead = (ImageView) convertView
					.findViewById(R.id.list_item_isread);
			convertView.setTag(viewBoard);
		} else {
			viewBoard = (ViewBoard) convertView.getTag();
		}

		viewBoard.title.setText(adapterData.get(position).get("title"));
		viewBoard.content.setText(adapterData.get(position).get("content"));
		viewBoard.time.setText(adapterData.get(position).get("time"));

		Boolean isRead = Boolean.valueOf(adapterData.get(position)
				.get("isread"));

		if (isRead) {
			viewBoard.isRead.setVisibility(View.INVISIBLE);
		}

		return convertView;
	}

	final class ViewBoard {
		public int id;
		public TextView title;
		public TextView content;
		public TextView time;
		public ImageView isRead;
	}

}
