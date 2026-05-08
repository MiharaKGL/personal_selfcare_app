package com.example.personaldiary;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MiniPersonalDiary extends AppCompatActivity {

    EditText editText9, editText10;
    Button button11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_mini_personal_diary);

        editText9 = findViewById(R.id.editText9);
        editText10 = findViewById(R.id.editText10);
        button11 = findViewById(R.id.button11);

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String date = editText9.getText().toString();
                String writing = editText10.getText().toString();

                Intent intent8 = new Intent(MiniPersonalDiary.this, JournalReview.class);
                intent8.putExtra("date", date);
                intent8.putExtra("writing", writing);
                startActivity(intent8);
            }
        });

    }
}