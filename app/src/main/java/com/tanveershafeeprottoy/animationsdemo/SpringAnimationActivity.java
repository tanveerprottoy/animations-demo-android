package com.tanveershafeeprottoy.animationsdemo;

import android.os.Bundle;
import android.view.VelocityTracker;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;

public class SpringAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spring_animation);
        performSpringAnim(findViewById(R.id.activitySpringAnimationImgView));
    }

    private void performSpringAnim(View view) {
        // Setting up a spring animation to animate the view’s translationY property with the final
        // spring position at 0.
        final SpringAnimation springAnim = new SpringAnimation(
            view, DynamicAnimation.TRANSLATION_Y, 300
        );
/*        float pixelPerSecond = TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,
                20,
                getResources().getDisplayMetrics()
        );*/
        // Compute velocity in the unit pixel/second
        VelocityTracker velocityTracker = VelocityTracker.obtain();
        velocityTracker.computeCurrentVelocity(1000);
        float velocity = velocityTracker.getYVelocity();
        velocityTracker.recycle();
        springAnim.setStartVelocity(velocity);
        springAnim.getSpring().setDampingRatio(SpringForce.DAMPING_RATIO_HIGH_BOUNCY);
        springAnim.getSpring().setStiffness(SpringForce.STIFFNESS_LOW);
        springAnim.start();
        /*
         * animateToFinalPosition() method performs two tasks:
         *
         * Sets the final position of the spring.
         * Starts the animation, if it has not started.
         */
        //springAnim.animateToFinalPosition(300);
    }
}
