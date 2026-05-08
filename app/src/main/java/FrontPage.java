package com.example.personaldiary;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FrontPage extends AppCompatActivity {

    TextView textView9, textView12;
    Button button8, button5, button6, button7;
    String[] quotes = {
            "Believe you can and you’re halfway there.",
            "Every day is a new beginning. Take a deep breath and start again.",
            "You are stronger than you think.",
            "Be proud of how far you’ve come and have faith in how far you can go.",
            "Keep going — you’re doing great!",
            "Happiness is not by chance, but by choice.",
            "Your only limit is your mind."
    };

    int currentIndex = 0;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_front_page);

        textView9 = findViewById(R.id.textView9);
        textView12 = findViewById(R.id.textView12);
        button8 = findViewById(R.id.button8);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);

        //To print the name with hello

        Intent intent = getIntent();
        String displayName = intent.getStringExtra("uName");

        textView9.setVisibility(View.VISIBLE);
        textView9.setText("Hello, "+displayName);

        // To change the quote of the day when button is clicked
        textView12.setText(quotes[currentIndex]);

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentIndex = (currentIndex + 1) % quotes.length;
                textView12.setText(quotes[currentIndex]);
            }
        });

        //For Mood Tracker. Working correctly
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(FrontPage.this, MoodTracker.class);
                startActivity(intent5);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(FrontPage.this, HealthTracker.class);
                startActivity(intent6);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(FrontPage.this, MiniPersonalDiary.class);
                startActivity(intent7);
            }
        });



    }
}