package com.demo.startapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startOtherAppActivity(View view){

        //1 通过组件导出调用
//        ComponentName component = new ComponentName("com.demo.homeapp", "com.demo.homeapp.TestActivity");
//        Intent intent = new Intent();
//        intent.setComponent(component);
//        startActivity(intent);

        //2 通过action调用
//        Intent intent = new Intent();
//        intent.setAction("com.demo.homeapp.test");
//        startActivity(intent);

        //3 调用mainActivity
//        Intent intent = getPackageManager().getLaunchIntentForPackage("com.demo.homeapp");
//        startActivity(intent);

        //4 通过data设置响应指定数据类型
//        Uri uri = Uri.parse("tea://hello");
//        intent.setData(uri);s
//        intent.setAction("com.demo.homeapp.test.TestActivity");
//        Intent intent=new Intent("com.demo.homeapp.test", Uri.parse("tea://hello"));
//        startActivity(intent);
        startActivity(new Intent("com.demo.homeapp.test"));
    }
}
