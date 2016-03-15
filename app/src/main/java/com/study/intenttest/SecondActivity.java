package com.study.intenttest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by WXB506 on 2016/3/15.
 */
public class SecondActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        // 获得启动该活动所使用的intent
        Intent intent = getIntent();
        Toast.makeText(this, intent.getStringExtra("mainactivity"), Toast.LENGTH_LONG).show();
    }
}
