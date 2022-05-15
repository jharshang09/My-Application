package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class category extends AppCompatActivity {
    private Button music;
    private Button dance;
    private Button animation;
    private Button quotes;
    private Button art_and_craft;
    private Button drawing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interest_choice);

        music = findViewById(R.id.music);
        dance = findViewById(R.id.dance);
        animation = findViewById(R.id.animation);
        quotes = findViewById(R.id.quotes);
        art_and_craft = findViewById(R.id.art_and_craft);
        drawing = findViewById(R.id.drawing);

        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(category.this, music.class);
                startActivity(intent);
            }
        });

        dance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(category.this, dance.class);
                startActivity(intent);
            }
        });

        animation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(category.this, animation.class);
                startActivity(intent);
            }
        });

        quotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(category.this, quotes.class);
                startActivity(intent);
            }
        });

        art_and_craft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(category.this, art.class);
                startActivity(intent);
            }
        });

        drawing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(category.this, drawing.class);
                startActivity(intent);
            }
        });

    }
}
