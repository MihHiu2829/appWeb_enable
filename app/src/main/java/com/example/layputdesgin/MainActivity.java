package com.example.layputdesgin;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;

import com.example.layputdesgin.databinding.ActivityMainBinding;

public class MainActivity extends baseAct<ActivityMainBinding> {



    @Override
    protected void initViews() {
        binding.tvHome.setOnClickListener(v -> GotoHome());
    }

    private void GotoHome() {
        Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE) ;
        dialog.setContentView(R.layout.act_home);

        Window window = dialog.getWindow() ;
        if(window == null ) return ;
        window.setLayout(WindowManager.LayoutParams.MATCH_PARENT,WindowManager.LayoutParams.WRAP_CONTENT);
        window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        WindowManager.LayoutParams windowAttributes = window.getAttributes() ;
        windowAttributes.gravity = Gravity.CENTER ;
        window.setAttributes(windowAttributes);
        dialog.setCancelable(true);
//        dialog.dismiss();
            dialog.show();
    }

    @Override
    protected ActivityMainBinding initViewBinding() {
        return ActivityMainBinding.inflate(getLayoutInflater());
    }
}