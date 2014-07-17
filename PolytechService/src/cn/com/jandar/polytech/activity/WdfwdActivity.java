package cn.com.jandar.polytech.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import cn.com.jandar.polytech.R;

public class WdfwdActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wdfwd);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.wdfwd, menu);
		return true;
	}

}
