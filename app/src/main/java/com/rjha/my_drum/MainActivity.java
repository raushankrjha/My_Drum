package com.rjha.my_drum;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {
    MediaPlayer m1,m2,m3,m4,m5,m6,m7,m8;
  ImageButton b1,b2,b3,b4,b5,b6,b7,b8;

    public InterstitialAd interstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (ImageButton) findViewById(R.id.imageButton1);
        b2 = (ImageButton) findViewById(R.id.imageButton2);
        b3 = (ImageButton) findViewById(R.id.imageButton3);
        b4 = (ImageButton) findViewById(R.id.imageButton4);
        b5 = (ImageButton) findViewById(R.id.imageButton5);
        b6 = (ImageButton) findViewById(R.id.imageButton6);
        b7 = (ImageButton) findViewById(R.id.imageButton7);
        b8 = (ImageButton) findViewById(R.id.imageButton8);





        interstitialAd=new InterstitialAd(this);
        interstitialAd.setAdUnitId("ca-app-pub-7565184612395429/3886738309");
        interstitialAd.loadAd(new AdRequest.Builder().build());
        interstitialAd.setAdListener(new AdListener()
        {
            public void onAdClosed()
            {
                finish();
                System.exit(0);
                System.gc();
                interstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

        m1 = MediaPlayer.create(MainActivity.this, R.raw.one);
        m2 = MediaPlayer.create(MainActivity.this, R.raw.two);
        m3 = MediaPlayer.create(MainActivity.this, R.raw.three);
        m4 = MediaPlayer.create(MainActivity.this, R.raw.four);
        m5 = MediaPlayer.create(MainActivity.this, R.raw.fv);
        m6 = MediaPlayer.create(MainActivity.this, R.raw.sixth);
        m7 = MediaPlayer.create(MainActivity.this, R.raw.seventh);
        m8 = MediaPlayer.create(MainActivity.this, R.raw.eighth);
        b1.setSoundEffectsEnabled(false);
        b2.setSoundEffectsEnabled(false);
        b3.setSoundEffectsEnabled(false);
        b4.setSoundEffectsEnabled(false);
        b5.setSoundEffectsEnabled(false);
        b6.setSoundEffectsEnabled(false);
        b7.setSoundEffectsEnabled(false);
        b8.setSoundEffectsEnabled(false);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m1.start();
                b1.setSoundEffectsEnabled(false);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m2.start();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m3.start();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m4.start();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m5.start();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m6.start();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m7.start();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m8.start();
            }
        });

    }
    boolean doubleBackToExitPressedOnce=false;
    public void onBackPressed()
    {
        if(interstitialAd.isLoaded()) {
            interstitialAd.show();
        }
       else  if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click back again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
