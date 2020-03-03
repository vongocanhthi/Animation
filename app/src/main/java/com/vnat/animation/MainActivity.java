package com.vnat.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnTranslate, btnAlpha, btnScale, btnComplex, btnRotate;
    Animation animTranslate, animAlpha, animScale, animRotate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        setClick();
    }

    private void setClick() {
        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animTranslate);
            }
        });

        btnAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);
            }
        });

        btnScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);
            }
        });

        btnComplex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimationSet set = new AnimationSet(false);
                set.addAnimation(animAlpha);
                set.addAnimation(animScale);
                set.addAnimation(animRotate);
                v.startAnimation(set);
            }
        });

        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animRotate);
            }
        });
    }

    private void init() {
        btnTranslate = findViewById(R.id.btnTranslate);
        btnAlpha = findViewById(R.id.btnAlpha);
        btnScale = findViewById(R.id.btnScale);
        btnComplex = findViewById(R.id.btnComplex);
        btnRotate = findViewById(R.id.btnRotate);

        animTranslate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_translate);
        animAlpha = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_alpha);
        animScale = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_scale);
        animRotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_rotate);
    }
}
