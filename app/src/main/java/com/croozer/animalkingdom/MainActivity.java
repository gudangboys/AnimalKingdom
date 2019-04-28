package com.croozer.animalkingdom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView animals = findViewById(R.id.text_view_animals);

        animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent animalIntent = new Intent(MainActivity.this, AnimalActivity.class);
                startActivity(animalIntent);
            }
        });


        TextView birds = findViewById(R.id.text_view_birds);

        birds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent birdIntent = new Intent(MainActivity.this, BirdActivity.class);
                startActivity(birdIntent);
            }
        });


    }
}
