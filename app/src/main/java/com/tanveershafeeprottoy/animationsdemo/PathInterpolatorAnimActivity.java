package com.tanveershafeeprottoy.animationsdemo;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.AppCompatActivity;

public class PathInterpolatorAnimActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_path_interpolator_anim);
        performPathInterpolatorAnimation(findViewById(R.id.activityPathInterpolatorAnimImgView));
        performCurvedPathAnim(findViewById(R.id.activityPathInterpolatorAnimImgView1));
    }

    private void performPathInterpolatorAnimation(View view) {
       /* Path path = new Path();
        path.arcTo(0f, 0f, 1000f, 1000f, 270f, -180f, true);
        PathInterpolator pathInterpolator = new PathInterpolator(path);*/

        //above PathInterpolator can also be define in xml, which is exactly what is done below

        ObjectAnimator animation = ObjectAnimator.ofFloat(
            view,
            "translationX",
            300f
        );
        animation.setInterpolator(AnimationUtils.loadInterpolator(this, R.anim.path_interpolator));
        animation.start();
    }

    private void performCurvedPathAnim(View view) {
        Path path = new Path();
        path.arcTo(0f, 0f, 1000f, 1000f, 270f, -180f, true);
        ObjectAnimator animator = ObjectAnimator.ofFloat(view, View.X, View.Y, path);
        animator.setDuration(2000);
        animator.start();
    }
}
