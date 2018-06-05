package com.example.sweatch.coach;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class AppIntroActivity extends AppIntro {

    @Override
    public void init(Bundle savedInstanceState) {

        addSlide(AppIntroFragment.newInstance("Sweatch, your handy coach", "Your Daily Statistics", R.drawable.hi, getResources().getColor(R.color.white)));
        addSlide(AppIntroFragment.newInstance("Who is the best?", "Compare with Friends", R.drawable.appintro5, getResources().getColor(R.color.appintro2)));
        addSlide(AppIntroFragment.newInstance("Invite Friends", "Share A Run with them", R.drawable.appintro3, getResources().getColor(R.color.appintro3)));
        addSlide(AppIntroFragment.newInstance("", "Get Started", R.drawable.appintro4, getResources().getColor(R.color.appintro4)));

        setBarColor(Color.parseColor("#BB86FC"));
        setSeparatorColor(Color.parseColor("#03DAC6"));

        showSkipButton(true);
        setProgressButtonEnabled(true);

        // Turn vibration on and set intensity.
        setVibrate(true);
        setVibrateIntensity(30);
    }

    @Override
    public void onSkipPressed() {
        // Do something when users tap on Skip button.
        Intent i = new Intent(AppIntroActivity.this, EnterInfoActivity.class);
        startActivity(i);
    }

    @Override
    public void onDonePressed() {
        // Do something when users tap on Done button.
        Intent i = new Intent(AppIntroActivity.this, EnterInfoActivity.class);
        startActivity(i);

        Toast.makeText(getApplicationContext(), "Finished", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSlideChanged() {
        // Do something when the slide changes.
    }

    @Override
    public void onNextPressed() {
        // Do something when users tap on Next button.
        Toast.makeText(getApplicationContext(), "Cannot Skip", Toast.LENGTH_SHORT).show();
    }

}