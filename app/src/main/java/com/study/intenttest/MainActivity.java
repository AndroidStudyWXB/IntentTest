package com.study.intenttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;

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
                // 可以调用intent的addCategory方法添加新的category
                intent.addCategory("com.study.intenttest.MY_CATEGORY");
                // startActivity()方法会自动在intent添加default category
                startActivity(intent);
            }
        });
    }
}
