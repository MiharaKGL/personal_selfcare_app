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

public class SignInPage extends AppCompatActivity {

    EditText editText7, editText8;
    Button button3;

    String name, day, month, year, gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sign_in_page);

        editText7 = findViewById(R.id.editText7);
        editText8 = findViewById(R.id.editText8);
        button3 = findViewById(R.id.button3);

        Intent intent3 = getIntent();
        String regUsername = intent3.getStringExtra("username");
        String regPassword = intent3.getStringExtra("password");
        String name = intent3.getStringExtra("name");


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String uName = editText7.getText().toString();
                String uPassword = editText8.getText().toString();

                //if (uName.equals(regUsername) && uPassword.equals(regPassword)) {
                Intent intent4 = new Intent(SignInPage.this, FrontPage.class);
                intent4.putExtra("uName", uName);
                intent4.putExtra("name", name);

                startActivity(intent4);
                //}
            }
        });


    }
}
