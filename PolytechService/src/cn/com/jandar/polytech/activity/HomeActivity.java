package cn.com.jandar.polytech.activity;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import cn.com.jandar.polytech.R;
import cn.com.jandar.polytech.core.BaseActivity;

public class HomeActivity extends BaseActivity {
	private TextView wdtz;
	private TextView wdfwd;
	private TextView pjgh;
	private TextView fwdgz;

	private List<TextView> textViews = new ArrayList<TextView>();
	private Class[] classs = {WdtzActivity.class,WdfwdActivity.class,PjghActivity.class,FwdgzActivity.class};

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);

		// 初始化textview
		wdtz = (TextView) findViewById(R.id.wdtz_image_textview);
		wdfwd = (TextView) findViewById(R.id.wdfwd_image_textview);
		pjgh = (TextView) findViewById(R.id.pjgh_image_textview);
		fwdgz = (TextView) findViewById(R.id.fwdgz_image_textview);

		textViews.add(wdtz);
		textViews.add(wdfwd);
		textViews.add(pjgh);
		textViews.add(fwdgz);

		for (int i = 0; i < textViews.size(); i++) {
			TextView item = textViews.get(i);
			final Class itemClass = classs[i];
			item.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent = new Intent(HomeActivity.this,
							itemClass);
					startActivity(intent);
				}
			});
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

}
