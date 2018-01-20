package com.example.james.cruzhacks2018jmmm;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.JsonReader;
import android.view.View;
import android.widget.TextView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.Reader;

public class ChallengeDisplay extends AppCompatActivity {

    Intent intent;

    String challengeFile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge_display);

        TextView challengeText = (TextView) findViewById(R.id.challenge);
        challengeText.setText(getRandChallenge(), TextView.BufferType.EDITABLE);
    }

    protected void goButton(View view) {

    }

    protected String getRandChallenge()
    {
        return "hello";
    }

    protected void addChallenge()
    {
        FileInputStream is = null;
        try{
            is = openFileInput(challengeFile);
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace(System.err);
        }


    }


}
