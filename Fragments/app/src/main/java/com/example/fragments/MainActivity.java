package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.fragments.Fragments.FirstFragment;
import com.example.fragments.Fragments.SecondFragment;

public class MainActivity extends AppCompatActivity {

    Button button1,button2;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.fragment1);
        button2 = findViewById(R.id.fragment2);
        linearLayout = findViewById(R.id.linearLayout);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirstFragment firstFragment = new FirstFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout,firstFragment);   // replace fragment in linear Layout
                transaction.commit();   // start transaction
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecondFragment secondFragment = new SecondFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout,secondFragment);   // replace fragment in linear Layout
                transaction.commit();   // start transaction
            }
        });
    }
}