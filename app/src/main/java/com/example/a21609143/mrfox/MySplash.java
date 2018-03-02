package com.example.a21609143.mrfox;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MySplash extends AppCompatActivity {

    private static final int SPLASH_TIME_OUT = 3000;
    private ImageView imgFox;
    private TextView txv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        imgFox = findViewById(R.id.imgFox);
        txv = findViewById(R.id.txvSplash);

        Typeface face= Typeface.createFromAsset(getAssets(),"fonts/AmaticSC-Regular.ttf");
        txv.setTypeface(face);

        Animation translateLogo = AnimationUtils.loadAnimation(this,R.anim.translate_fox);
        Animation translateText = AnimationUtils.loadAnimation(this,R.anim.translate_text);


        imgFox.startAnimation(translateLogo);
        txv.startAnimation(translateText);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MySplash.this,MyLogin.class);
                startActivity(i);
            }
        },SPLASH_TIME_OUT);
    }

    
}

