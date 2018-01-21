package com.example.james.cruzhacks2018jmmm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Options extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);


        Intent intent = getIntent();
        String message = intent.getStringExtra(MainMenu.EXTRA_MESSAGE);

    }
    public void backButton (View view){
        //Takes you back to the main menu.
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }
    }

