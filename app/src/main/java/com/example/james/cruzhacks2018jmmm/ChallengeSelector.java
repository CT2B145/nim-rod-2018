package com.example.james.cruzhacks2018jmmm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChallengeSelector extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge_selector);
    }

    public void sendMessage(View view){
        //Android studio tutorial
        Intent intent = new Intent(this, ChallengeDisplay.class);
        startActivity(intent);
    }

}
