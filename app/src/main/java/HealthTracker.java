package com.example.personaldiary;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HealthTracker extends AppCompatActivity {

    Button button10;
    SeekBar seekBar1, seekBar2;
    TextView textView21, textView23, textView24;

    double height = 0, weight = 0, bmi = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_health_tracker);

        seekBar1 = findViewById(R.id.seekBar1);
        seekBar2 = findViewById(R.id.seekBar2);
        textView21 = findViewById(R.id.textView21);
        textView23 = findViewById(R.id.textView23);
        button10 = findViewById(R.id.button10);
        textView24 = findViewById(R.id.textView24);

        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView21.setText(String.valueOf(progress) + " Kg");
                weight = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean fromUser) {
                textView23.setText(String.valueOf(i) + "cm");
                height = i / 100.0;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bmi = weight / (height * height);;
                textView24.setText("BMI = " + String.valueOf(bmi));
            }
        });

    }
}