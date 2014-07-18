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

public class WdtzActivity extends BaseActivity {
	private ListView wdtzListView;
	private List<HashMap<String,String>> adapterData = new ArrayList<HashMap<String, String>>();
	private BascSimpleAdapter bsAdapter;
	
	

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wdtz);
		initTbar(R.string.global_menu_wdtz_text);
		
		wdtzListView = (ListView) findViewById(android.R.id.list);
		
		GetBascListAdapterData tempDataUtil = new GetBascListAdapterData("wdtz.properties", context);
		adapterData = tempDataUtil.getData();
		
		bsAdapter = new BascSimpleAdapter(context,adapterData);
		wdtzListView.setAdapter(bsAdapter);
		
		bsAdapter.notifyDataSetChanged();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.wdtz, menu);
		return true;
	}

}
