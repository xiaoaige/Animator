package com.example.administrator.animator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.fadai.particlesmasher.ParticleSmasher;
import com.fadai.particlesmasher.SmashAnimator;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button explosionButton,dropButton,leftButton,rightButton,topButton,bottomButton,resetButton;
    private LinearLayout linearLayout;
    private ParticleSmasher particleSmasher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        particleSmasher=new ParticleSmasher(this);
        explosionButton=findViewById(R.id.explosion_button);
        dropButton=findViewById(R.id.drop_button);
        leftButton=findViewById(R.id.left_button);
        rightButton=findViewById(R.id.right_button);
        topButton=findViewById(R.id.top_button);
        bottomButton=findViewById(R.id.bottom_button);
        resetButton=findViewById(R.id.reset_button);
        explosionButton.setOnClickListener(this);
        dropButton.setOnClickListener(this);
        leftButton.setOnClickListener(this);
        rightButton.setOnClickListener(this);
        topButton.setOnClickListener(this);
        bottomButton.setOnClickListener(this);
        resetButton.setOnClickListener(this);
        linearLayout=findViewById(R.id.layout_main);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.explosion_button:
                particleSmasher.with(linearLayout)
                        .setStyle(SmashAnimator.STYLE_EXPLOSION)
                        .setDuration(15000)
                        .setStartDelay(300)
                        .setHorizontalMultiple(4)
                        .setVerticalMultiple(4)
                        .addAnimatorListener(new SmashAnimator.OnAnimatorListener() {
                            @Override
                            public void onAnimatorStart() {

                            }

                            @Override
                            public void onAnimatorEnd() {

                            }
                        }).start();
                break;
            case R.id.drop_button:
                particleSmasher.with(linearLayout)
                        .setStyle(SmashAnimator.STYLE_DROP)
                        .setDuration(15000)
                        .setStartDelay(300)
                        .setHorizontalMultiple(4)
                        .setVerticalMultiple(4)
                        .addAnimatorListener(new SmashAnimator.OnAnimatorListener() {
                            @Override
                            public void onAnimatorStart() {

                            }

                            @Override
                            public void onAnimatorEnd() {

                            }
                        }).start();
                break;
            case R.id.left_button:
                particleSmasher.with(linearLayout)
                        .setStyle(SmashAnimator.STYLE_FLOAT_LEFT)
                        .setDuration(15000)
                        .setStartDelay(300)
                        .setHorizontalMultiple(4)
                        .setVerticalMultiple(4)
                        .addAnimatorListener(new SmashAnimator.OnAnimatorListener() {
                            @Override
                            public void onAnimatorStart() {

                            }

                            @Override
                            public void onAnimatorEnd() {

                            }
                        }).start();
                break;
            case R.id.right_button:
                particleSmasher.with(linearLayout)
                        .setStyle(SmashAnimator.STYLE_FLOAT_RIGHT)
                        .setDuration(15000)
                        .setStartDelay(300)
                        .setHorizontalMultiple(4)
                        .setVerticalMultiple(4)
                        .addAnimatorListener(new SmashAnimator.OnAnimatorListener() {
                            @Override
                            public void onAnimatorStart() {

                            }

                            @Override
                            public void onAnimatorEnd() {

                            }
                        }).start();
                break;
            case R.id.top_button:
                particleSmasher.with(linearLayout)
                        .setStyle(SmashAnimator.STYLE_FLOAT_TOP)
                        .setDuration(15000)
                        .setStartDelay(300)
                        .setHorizontalMultiple(4)
                        .setVerticalMultiple(4)
                        .addAnimatorListener(new SmashAnimator.OnAnimatorListener() {
                            @Override
                            public void onAnimatorStart() {

                            }

                            @Override
                            public void onAnimatorEnd() {

                            }
                        }).start();
                break;
            case R.id.bottom_button:
                particleSmasher.with(linearLayout)
                        .setStyle(SmashAnimator.STYLE_FLOAT_BOTTOM)
                        .setDuration(15000)
                        .setStartDelay(300)
                        .setHorizontalMultiple(4)
                        .setVerticalMultiple(4)
                        .addAnimatorListener(new SmashAnimator.OnAnimatorListener() {
                            @Override
                            public void onAnimatorStart() {

                            }

                            @Override
                            public void onAnimatorEnd() {

                            }
                        }).start();
                break;
            case R.id.reset_button:
                particleSmasher.reShowView(linearLayout);
                break;
        }

    }
}
