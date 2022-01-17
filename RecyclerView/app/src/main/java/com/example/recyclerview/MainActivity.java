package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.recyclerview.Adapters.RecipeAdapter;
import com.example.recyclerview.Classes.RecyclerItemClickListener;
import com.example.recyclerview.Models.RecipeModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        ArrayList<RecipeModel> list = new ArrayList<>();
        list.add(new RecipeModel(R.drawable.food2cheeseroll,"Cheese Roll"));
        list.add(new RecipeModel(R.drawable.food2,"Burger"));
        list.add(new RecipeModel(R.drawable.food3pizza,"Pizza"));
        list.add(new RecipeModel(R.drawable.food4pasta,"Pasta"));
        list.add(new RecipeModel(R.drawable.food5garlicb,"Garlic Bread"));
        list.add(new RecipeModel(R.drawable.food6choco,"Choco Lava Cake"));
        list.add(new RecipeModel(R.drawable.food7zingy,"Zingy Parcel"));
        list.add(new RecipeModel(R.drawable.food8chcolate,"Chocolate"));
        list.add(new RecipeModel(R.drawable.food9indian,"Indian Thali"));

        RecipeAdapter recipeAdapter = new RecipeAdapter(list,this);
        recyclerView.setAdapter(recipeAdapter);

        /*
        Linear Layoyt:

        // by default it is vertical , pass 2 arguments for horizontal layout
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // on false, swipe right,on true, swipe left
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
         */


        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager) ;

        /*
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
         */

        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(
                this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch(position){
                    case 0:
                        // whenever we have to go from one activity to other activity
                        Intent intent = new Intent(MainActivity.this,ScrollingActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "Second item is clicked", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                }
            }

            @Override
            public void onLongItemClick(View view, int position) {
                switch(position){
                    case 0:
                        // whenever we have to go from one activity to other activity
                        Toast.makeText(MainActivity.this, "Item1 long pressed.", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "Item2 long pressed.", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                }
            }
        }
        ));
    }
}