package com.jni.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView tv;
	private JniTest jniTest = new JniTest();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv = (TextView) findViewById(R.id.tv);
		tv.setText(jniTest.getStringFromJni());
	}
	
	  static {
	        System.loadLibrary("JniTest");
	    }
	
}
