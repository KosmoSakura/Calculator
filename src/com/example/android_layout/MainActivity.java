package com.example.android_layout;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView tv;
	String str = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv = (TextView) findViewById(R.id.tv);
	}

	public void myClick0(View v) {
		switch (v.getId()) {
		case R.id.btnd:
			try {
				str = str.substring(0, str.length() - 1);
				tv.setText(str);
			} catch (Exception e) {
				tv.setText("你有毛病");
			}
			break;
		case R.id.btnc:
			str = "";
			tv.setText(str);
			break;
		}
		if (str.contains("+")) {
			String[] arr = str.split("\\+");
			try {
				float x = Float.parseFloat(arr[0]);
				float y = Float.parseFloat(arr[1]);
				str = (x + y) + "";
				tv.setText(str);
			} catch (Exception e) {
				tv.setText("计算器不带这么玩的啊！？");
				str = "";
			}
		}
		if (str.contains("-")) {
			String[] arr = str.split("\\-");
			try {
				float x = Float.parseFloat(arr[0]);
				float y = Float.parseFloat(arr[1]);
				str = (x - y) + "";
				tv.setText(str);
			} catch (Exception e) {
				tv.setText("计算器不带这么玩的啊！？");
				str = "";
			}
		}
		if (str.contains("*")) {
			String[] arr = str.split("\\*");
			try {
				float x = Float.parseFloat(arr[0]);
				float y = Float.parseFloat(arr[1]);
				str = (x * y) + "";
				tv.setText(str);
			} catch (Exception e) {
				tv.setText("计算器不带这么玩的啊！？");
				str = "";
			}
		}
		if (str.contains("/")) {
			String[] arr = str.split("\\/");
			try {
				float x = Float.parseFloat(arr[0]);
				float y = Float.parseFloat(arr[1]);
				str = (x / y) + "";
				tv.setText(str);
			} catch (Exception e) {
				tv.setText("计算器不带这么玩的啊！？");
				str = "";
			}
		}

	}

	public void myClick(View v) {
		switch (v.getId()) {
		case R.id.b0:
			str += "0";
			tv.setText(str);
			break;
		case R.id.b1:
			str += "1";
			tv.setText(str);
			break;
		case R.id.b2:
			str += "2";
			tv.setText(str);
			break;
		case R.id.b3:
			str += "3";
			tv.setText(str);
			break;
		case R.id.b4:
			str += "4";
			tv.setText(str);
			break;
		case R.id.b5:
			str += "5";
			tv.setText(str);
			break;
		case R.id.b6:
			str += "6";
			tv.setText(str);
			break;
		case R.id.b7:
			str += "7";
			tv.setText(str);
			break;
		case R.id.b8:
			str += "8";
			tv.setText(str);
			break;
		case R.id.b9:
			str += "9";
			tv.setText(str);
			break;
		case R.id.btndian:
			str += ".";
			tv.setText(str);
			break;
		case R.id.btnjia:
			str += "+";
			tv.setText(str);
			break;
		case R.id.btnjian:
			str += "-";
			tv.setText(str);
			break;
		case R.id.btncheng:
			str += "*";
			tv.setText(str);
			break;
		case R.id.btnchu:
			str += "/";
			tv.setText(str);
			break;

		}
	}

}
