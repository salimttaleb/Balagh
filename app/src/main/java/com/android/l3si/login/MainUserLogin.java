package com.android.l3si.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainUserLogin extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_user_login);

        username = findViewById(R.id.uusername);
        password = findViewById(R.id.upassword);
        loginButton = findViewById(R.id.uloginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("user") && password.getText().toString().equals("1234")) {
                    Toast.makeText(MainUserLogin.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainUserLogin.this, "Login Failed!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void usignupButton(View view) {
        Intent myintent3 = new Intent(this, MainUserSignup.class);
        startActivity(myintent3);
    }

}