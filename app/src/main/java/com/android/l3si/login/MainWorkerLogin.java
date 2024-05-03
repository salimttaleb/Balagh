package com.android.l3si.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainWorkerLogin extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_worker_login);

        username = findViewById(R.id.wusername);
        password = findViewById(R.id.wpassword);
        loginButton = findViewById(R.id.wloginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("user") && password.getText().toString().equals("1234")) {
                    Toast.makeText(MainWorkerLogin.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainWorkerLogin.this, "Login Failed!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void wsignupButton(View view) {
        Intent myintent4 = new Intent(this, MainWorkerSignup.class);
        startActivity(myintent4);
    }
}