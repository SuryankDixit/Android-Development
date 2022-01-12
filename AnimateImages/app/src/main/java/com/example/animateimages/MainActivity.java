package com.example.animateimages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView bartImageView;
    private ImageView homerImageView;
    boolean bartIsShowing = true ;

    private Button aImg;
    private Button dImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bartImageView = findViewById(R.id.imageView);
        homerImageView = findViewById(R.id.imageView2);

        aImg = findViewById(R.id.buttonAppear);
        dImg = findViewById(R.id.buttonDisappear);

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

        aImg.setOnClickListener((View view)->{
            bartImageView.animate().translationXBy(-1000).rotation(3600);
            homerImageView.animate().translationXBy(1000).rotation(3600);
        });

        dImg.setOnClickListener((View view)->{
            bartImageView.animate().translationX(1000).rotation(3600);
            homerImageView.animate().translationX(-1000).rotation(3600);
        });
    }
}