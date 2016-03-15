package com.study.intenttest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 每个intent 只能指定一个action，但可以有多个category
                Intent intent = new Intent("com.study.intenttest.ACTION_START");
                // 可以调用intent的addCategory方法添加新的category, intent的category必须是某个活动
                // category的子集，才能启动某个活动
                intent.addCategory("com.study.intenttest.MY_CATEGORY");
                // startActivity()方法会自动在intent添加default category
                startActivity(intent);
            }
        });

        button2 = (Button) findViewById(R.id.button_3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent.view 是一个android系统内置的动作，常量值为android.intent.action.VIEW
                Intent intent = new Intent(Intent.ACTION_VIEW);
                // 指明intent正在操作的数据，只有<data>标签中指定的内容和intent携带的Data完全一致时，
                // 当前活动才能响应这个intent
                intent.setData(Uri.parse("http:www.baidu.com"));
                startActivity(intent);
            }
        });
    }
}
