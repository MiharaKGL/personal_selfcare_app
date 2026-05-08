package com.example.personaldiary;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class JournalReview extends AppCompatActivity {

    TextView textView13, textView14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_journal_review);

        textView13 = findViewById(R.id.textView13);
        textView14 = findViewById(R.id.textView14);

        Intent intent8 = getIntent();
        String date = intent8.getStringExtra("date");
        String writing = intent8.getStringExtra("writing");

        textView13.setText("Review of your Journal on " + date);
        textView14.setText(writing);

    }
}