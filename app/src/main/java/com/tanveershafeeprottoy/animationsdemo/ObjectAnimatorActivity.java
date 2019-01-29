package com.tanveershafeeprottoy.animationsdemo;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ObjectAnimatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_animator);
        performObjectAnimation(findViewById(R.id.activityObjectAnimatorImgView));
    }

    private void performObjectAnimation(View view) {
        ObjectAnimator animation = ObjectAnimator.ofFloat(view, "translationX", 200f);
        animation.setDuration(5000);
        animation.start();
    }
}
