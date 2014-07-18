package cn.com.jandar.polytech.activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;
import cn.com.jandar.polytech.R;
import cn.com.jandar.polytech.adapter.BascSimpleAdapter;
import cn.com.jandar.polytech.core.BaseActivity;
import cn.com.jandar.polytech.tempData.GetBascListAdapterData;

public class PjghActivity extends BaseActivity {
	private ListView listView;
	private List<HashMap<String, String>> adapterData = new ArrayList<HashMap<String, String>>();
	private BascSimpleAdapter bsAdapter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bjgh);

		listView = (ListView) findViewById(android.R.id.list);

		GetBascListAdapterData tempDataUtil = new GetBascListAdapterData(
				"pjgh.properties", context);
		adapterData = tempDataUtil.getData();

		bsAdapter = new BascSimpleAdapter(context, adapterData);
		listView.setAdapter(bsAdapter);

		bsAdapter.notifyDataSetChanged();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bjgh, menu);
		return true;
	}

}
