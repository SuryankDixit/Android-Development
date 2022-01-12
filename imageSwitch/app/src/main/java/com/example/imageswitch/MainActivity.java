package com.example.imageswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private ImageView imageView;

    /*
    public void switchImage(View view){
        Log.i("Info","Button Pressed");

        ImageView imageView = findViewById(R.id.imageView3);
        imageView.setImageResource(R.drawable.ic_launcher_foreground);
    }
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button2);

        button.setOnClickListener((View view)->{
            Log.i("Info","Button Pressed");
            imageView = findViewById(R.id.imageView3);
            imageView.setImageResource(R.drawable.ic_launcher_foreground);
        });

        /*
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Info","Button Pressed");

                imageView = findViewById(R.id.imageView3);
                imageView.setImageResource(R.drawable.ic_launcher_foreground);
            }
        });
         */
    }
}