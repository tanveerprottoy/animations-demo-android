package com.tanveershafeeprottoy.animationsdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.activityMainBtn0).setOnClickListener(this);
        findViewById(R.id.activityMainBtn1).setOnClickListener(this);
        findViewById(R.id.activityMainBtn2).setOnClickListener(this);
        findViewById(R.id.activityMainBtn3).setOnClickListener(this);
        findViewById(R.id.activityMainBtn4).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.activityMainBtn0: {
                startActivity(new Intent(this, TranslateAnimActivity.class));
            }
            case R.id.activityMainBtn1: {
                startActivity(new Intent(this, ObjectAnimatorActivity.class));
            }
            case R.id.activityMainBtn2: {
                startActivity(new Intent(this, PathInterpolatorAnimActivity.class));
            }
            case R.id.activityMainBtn3: {
                startActivity(new Intent(this, BubbleAnimationActivity.class));
            }
            case R.id.activityMainBtn4: {
                startActivity(new Intent(this, SpringAnimationActivity.class));
            }
        }
    }
}
