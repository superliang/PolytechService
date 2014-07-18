package cn.com.jandar.polytech.tempData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import android.content.Context;

import cn.com.jandar.polytech.util.PropertyUtil;

public class GetBascListAdapterData {
	private Context context;
	private String fileName;
	private String[] textArray = { "title", "content", "time", "isread" };
	private List<HashMap<String, String>> adapterData = new ArrayList<HashMap<String, String>>();

	public GetBascListAdapterData(String fileName, Context context) {
		this.context = context;
		this.fileName = fileName;
	}

	public List<HashMap<String, String>> getData() {

		List<String[]> allData = new ArrayList<String[]>();

		Properties prop = PropertyUtil.loadConfig(context, fileName);
		String[] title = prop.getProperty("title").split(",");
		String[] content = prop.getProperty("content").split(",");
		String[] time = prop.getProperty("time").split(",");
		String[] isRead = prop.getProperty("isread").split(",");

		allData.add(title);
		allData.add(content);
		allData.add(time);
		allData.add(isRead);

		for (int i = 0; i < title.length; i++) {
			HashMap<String, String> tempMap = new HashMap<String, String>();
			int j = 0;
			for (String[] dataArray : allData) {
				tempMap.put(textArray[j], dataArray[i]);
				j++;
			}
			adapterData.add(tempMap);
		}

		return adapterData;
	}
}
