package com.example.layputdesgin;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;

import com.example.layputdesgin.databinding.ActivityMainBinding;

public class MainActivity extends baseAct<ActivityMainBinding> {



    @Override
    protected void initViews() {
                binding.tvAboutMe01.setOnClickListener(v -> gotoAboutme(v)) ;
                binding.tvContract01.setOnClickListener(v -> gotoContact(v)) ;
    }

        private void gotoContact(View v) {
            Intent intent = new Intent() ;
            v.startAnimation(AnimationUtils.loadAnimation(this, androidx.appcompat.R.anim.abc_fade_in));
            intent.setClass(this,MainActivity.class);
            startActivity(intent);
    }

    private void gotoAboutme(View v) {
        v.startAnimation(AnimationUtils.loadAnimation(this, androidx.appcompat.R.anim.abc_fade_in));
        Intent intent = new Intent() ;
        intent.setClass(this,m002_act.class);
        startActivity(intent);
    }


    @Override
    protected ActivityMainBinding initViewBinding() {
        return ActivityMainBinding.inflate(getLayoutInflater());
    }
}