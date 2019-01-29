package com.tanveershafeeprottoy.animationsdemo;

import android.os.Bundle;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;

import androidx.appcompat.app.AppCompatActivity;

public class BubbleAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bubble_animation);
        performBubbleAnim(findViewById(R.id.activityBubbleAnimationImgView));
    }

    private void performBubbleAnim(View view) {
        ScaleAnimation scale = new ScaleAnimation(
            0,
            5,
            0,
            5,
            ScaleAnimation.RELATIVE_TO_SELF,
            .15f,
            ScaleAnimation.RELATIVE_TO_SELF,
            .15f
        );
        scale.setDuration(2000);
        scale.setInterpolator(new OvershootInterpolator());
        view.startAnimation(scale);
    }
}
