package cn.com.jandar.polytech.util;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;

@SuppressLint("NewApi")
public class PropertyUtil {
	public static Properties loadConfig(Context context, String file) {
		Properties properties = new Properties();
		try {
			AssetManager am = context.getAssets();
			InputStream s = am.open(file);
			BufferedReader br=new BufferedReader(new InputStreamReader(s,"UTF-8"));
			properties.load(br);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return properties;
	}

	public void saveConfig(Context context, String file, Properties properties) {
		try {
			FileOutputStream s = new FileOutputStream(file, false);
			properties.store(s, "");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
