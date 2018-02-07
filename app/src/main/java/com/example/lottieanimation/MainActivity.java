package com.example.lottieanimation;

import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.SeekBar;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    LottieAnimationView lottieAnimationView1;
    SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lottieAnimationView1 = (LottieAnimationView)findViewById(R.id.animationA);
        seekBar = (SeekBar)findViewById(R.id.seekbar);

        // 자동 반복
        lottieAnimationView1.playAnimation();
        lottieAnimationView1.loop(true);

        // animator를 사용한 커스텀과 속도 조절
        /*ValueAnimator animator = ValueAnimator.ofFloat(0f, 1f).setDuration(2000);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                lottieAnimationView1.setProgress((float)animation.getAnimatedValue());
            }
        });
        animator.start();*/

        // seekBar를 이용한 조절
        /*seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                lottieAnimationView1.setProgress((float)progress/100);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });*/


    }

}