package com.android.l3si.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main_Launcher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_launcher);
    }

    public void ubutton (View view){
        Intent myintent1 = new Intent(this, MainUserLogin.class);
            startActivity(myintent1);
    }

    public void wbutton (View view){
        Intent myintent2 = new Intent(this, MainWorkerLogin.class);
            startActivity(myintent2);
    }

}