package com.example.myapplication.DishcoverRecipePages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.myapplication.R;

public class NoodlePage extends AppCompatActivity {

    private ImageView navigateBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ramen_recipe_page);
        navigateBack = findViewById(R.id.navigateBack);

        navigateBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}