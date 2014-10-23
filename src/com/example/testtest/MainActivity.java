package com.example.testtest;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView tv1,tv2;
	private ScrollView sv1;
	private int[]location = new int[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
//        tv1 = (TextView) findViewById(R.id.textView1);
//        sv1.setOnTouchListener(new OnTouchListener() {
//			
//			@Override
//			public boolean onTouch(View v, MotionEvent event) {
//				LayoutParams p = new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT);
//		        tv1.getLocationOnScreen(location);
//		        p.setMargins(0,(int) (tv1.getTop()) , 0, 0);
//		        tv2.setLayoutParams(p);
//		        tv1.setVisibility(View.INVISIBLE);
//		        tv2.setVisibility(View.VISIBLE);
//				return false;
//			}
//		});
    }

    
}
