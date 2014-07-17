package cn.com.jandar.polytech.activity;

import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;
import cn.com.jandar.polytech.R;
import cn.com.jandar.polytech.core.BaseActivity;

public class WdtzActivity extends BaseActivity {
	private ListView wdtzListView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wdtz);
		initTbar(R.string.global_menu_wdtz_text);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.wdtz, menu);
		return true;
	}

}
