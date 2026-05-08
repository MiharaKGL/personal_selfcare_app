package com.example.personaldiary;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MoodTracker extends AppCompatActivity {

    RadioGroup radioGroup2;
    Button button9;
    TextView tvSuggestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_mood_tracker);

        radioGroup2 = findViewById(R.id.radioGroup2);
        button9 = findViewById(R.id.button9);
        tvSuggestion = findViewById(R.id.tvSuggestion);

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup2.getCheckedRadioButtonId();

                if (selectedId == -1) {
                    tvSuggestion.setText("Please select your mood first!");
                    return;
                }

                //radioGroup2 = findViewById(radioGroup2);
                //String mood = selectedButton.getText().toString();

                else if (selectedId == R.id.radioHappy){
                    tvSuggestion.setText("Keep that smile! You are doing great! 🎶 Maybe listen to your favorite song!");
                }
                else if (selectedId == R.id.radioSad){
                    tvSuggestion.setText("Don't Worry.You are going to be Okay! Watch something funny or talk to a friend.");
                }
                else if (selectedId == R.id.radioStressed){
                    tvSuggestion.setText("Take a deep breath 🌿 Try a short walk or stretch.Remember Green = Good!");
                }
                else if (selectedId == R.id.radioAngry){
                    tvSuggestion.setText("Drink some water 💧 and take a moment alone to cool down.");
                }
                else {
                    tvSuggestion.setText("Take a power nap or relax for a bit ");
                }
            }
        });

    }
}