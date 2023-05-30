package com.example.heallthmonitorapp;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText username;
    EditText password;
    Button loginButton;
    Button ResetButton ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);
        ResetButton = findViewById(R.id.ResetButton);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(username.getText().toString().equals("mehedi") && password.getText().toString().equals("mehedi1250")){

                    Intent intent = new Intent(MainActivity.this, Profile.class);
                    startActivity(intent);

                }else {
                    Toast.makeText(MainActivity.this, "Enter CORRECT information", Toast.LENGTH_SHORT).show();
                }


            }
        });




        ResetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2 = new Intent(MainActivity.this,MainActivity.class);
                finish();

                startActivity(intent2);
            }
        });



    }
}