package com.example.animateimages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView bartImageView;
    private ImageView homerImageView;
    boolean bartIsShowing = true ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bartImageView = findViewById(R.id.imageView);
        homerImageView = findViewById(R.id.imageView2);

        bartImageView.setOnClickListener((View view)->{
            Log.i("Info","ImageView Tapped");
            if(bartIsShowing) {
                bartImageView.animate().alpha(0).setDuration(2000);
                homerImageView.animate().alpha(1).setDuration(2000);
                bartIsShowing = false;
            }else{
                bartImageView.animate().alpha(1).setDuration(2000);
                homerImageView.animate().alpha(0).setDuration(2000);
                bartIsShowing=true;
            }
        });
    }
}