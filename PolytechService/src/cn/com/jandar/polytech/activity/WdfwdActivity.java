package cn.com.jandar.polytech.activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import cn.com.jandar.polytech.R;
import cn.com.jandar.polytech.activity.wdfwd.XfwdActivity;
import cn.com.jandar.polytech.adapter.BascSimpleAdapter;
import cn.com.jandar.polytech.core.BaseActivity;
import cn.com.jandar.polytech.tempData.GetBascListAdapterData;

public class WdfwdActivity extends BaseActivity {
	private ListView listView;
	private List<HashMap<String, String>> adapterData = new ArrayList<HashMap<String, String>>();
	private BascSimpleAdapter bsAdapter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wdfwd);

		listView = (ListView) findViewById(android.R.id.list);
		GetBascListAdapterData tempGetData = new GetBascListAdapterData(
				"wdfwd.properties", context);
		adapterData = tempGetData.getData();

		bsAdapter = new BascSimpleAdapter(context, adapterData);

		listView.setAdapter(bsAdapter);
		bsAdapter.notifyDataSetChanged();

		listView.setOnItemClickListener(new OnItemClickListener() {

			@SuppressWarnings("unchecked")
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				HashMap<String, String> data = (HashMap<String, String>) arg0
						.getItemAtPosition(arg2);
				String dataMark = data.get("title");
				if ("新服务单".equals(dataMark)) {
					Intent intent = new Intent(WdfwdActivity.this,
							XfwdActivity.class);
					startActivity(intent);
				}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.wdfwd, menu);
		return true;
	}

}
