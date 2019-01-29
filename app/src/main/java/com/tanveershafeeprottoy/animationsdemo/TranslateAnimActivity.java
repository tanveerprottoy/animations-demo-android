package com.tanveershafeeprottoy.animationsdemo;

import android.os.Bundle;
import android.view.View;
import android.view.animation.TranslateAnimation;

import androidx.appcompat.app.AppCompatActivity;

public class TranslateAnimActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate_anim);
        performTranslateAnimation(findViewById(R.id.activityTranslateAnimImgView));
    }

    private void performTranslateAnimation(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(
            TranslateAnimation.RELATIVE_TO_SELF, 0.0f,
            TranslateAnimation.RELATIVE_TO_SELF, 5.0f,
            TranslateAnimation.RELATIVE_TO_SELF, 0.0f,
            TranslateAnimation.RELATIVE_TO_SELF, 5.0f
        );
        translateAnimation.setDuration(5000);
        translateAnimation.setFillAfter(true);
//        translateAnimation.setInterpolator(new LinearInterpolator());
        view.startAnimation(translateAnimation);
    }
}
