package com.example.personaldiary;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUpPage extends AppCompatActivity {

    EditText editText1, editText2, editText3, editText4, editText5, editText6;
    RadioGroup radioGroup1;
    Button button4;

    String gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sign_up_page);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        editText4 = findViewById(R.id.editText4);
        editText5 = findViewById(R.id.editText5);
        editText6 = findViewById(R.id.editText6);
        radioGroup1 = findViewById(R.id.radioGroup1);
        button4 = findViewById(R.id.button4);



        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = editText1.getText().toString();
                String day = editText2.getText().toString();
                String month = editText3.getText().toString();
                String year = editText4.getText().toString();
                String userName = editText5.getText().toString();
                String password = editText6.getText().toString();

                int selectId = radioGroup1.getCheckedRadioButtonId();

                if (selectId == R.id.radioButton1){
                    gender = "Male";
                }
                if (selectId == R.id.radioButton2) {
                    gender = "Female";
                }
                if (selectId == R.id.radioButton3){
                    gender = "Other";
                }

                Intent intent3 = new Intent(SignUpPage.this, SignInPage.class);
                intent3.putExtra("userName", userName);
                intent3.putExtra("password", password);
                intent3.putExtra("name", name);

                startActivity(intent3);
            }
        });
    }
}