package cn.com.jandar.polytech.activity.wdfwd;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import cn.com.jandar.polytech.R;
import cn.com.jandar.polytech.core.BaseActivity;
import cn.com.jandar.polytech.view.MyDialog;

public class XfwdActivity extends BaseActivity {
	private Button backButton;
	private Button actionButton;

	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wdfwd_xfwd);
        initTbar("我的服务单详情");

        backButton = (Button) findViewById(R.id.xfwd_back_botton);
        actionButton = (Button) findViewById(R.id.xfwd_xiangy_botton);
        
        backButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
			}
		});
        
        actionButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				MyDialog.Builder builder = new MyDialog.Builder(context);
				builder.setTitle("-=响应界面=-");
				builder.setMessage("");
				builder.setButtonLineGone();
				builder.setNegativeButton("确认响应", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						dialog.dismiss();
					}
				});
				builder.setPositiveButton("返回", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						dialog.dismiss();
					}
				});
				
				builder.create().show();
			}
		});
    }
}
