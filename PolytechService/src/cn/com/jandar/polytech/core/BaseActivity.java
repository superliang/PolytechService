package cn.com.jandar.polytech.core;

import java.io.File;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import cn.com.jandar.polytech.R;

/**
 * @author XUXIANG 活动基类，做一下初始化，或都每个活动类都要做的事
 */
public abstract class BaseActivity extends Activity {
	protected Handler mHandler = null;
	protected Context context;
	protected File cache;
	
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	/**
	 * 初始化标题栏 Resourse模式
	 * 
	 * @param title
	 */
	public void initTbar(int title) {
		// 标题
		TextView tbar_title = (TextView) findViewById(R.id.title);
		if (tbar_title != null)
			tbar_title.setText(title);

//		// 回首页键
//		Button btn_home = (Button) findViewById(R.id.back);
//		if (btn_home != null)
//			btn_home.setOnClickListener(new HomeButtonOnclickListener());
//		
//		// 返回键
//		Button btn_back = (Button) findViewById(R.id.tback);
//		if (btn_back != null)
//			btn_back.setOnClickListener(new BackButtonOnclickListener());
	}

	/**
	 * 初始化标题栏 传入值模式
	 * 
	 * @param title
	 */
	public void initTbar(String title) {
		// 标题
		TextView tbar_title = (TextView) findViewById(R.id.title);
		if (tbar_title != null)
			tbar_title.setText(title);

//		// 回首页键
//		Button btn_home = (Button) findViewById(R.id.back);
//		if (btn_home != null)
//			btn_home.setOnClickListener(new HomeButtonOnclickListener());
//		
//		// 返回键
//		Button btn_back = (Button) findViewById(R.id.tback);
//		if (btn_back != null)
//			btn_back.setOnClickListener(new BackButtonOnclickListener());
	}

}
