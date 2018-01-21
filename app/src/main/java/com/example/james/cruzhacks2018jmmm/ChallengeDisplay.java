package com.example.james.cruzhacks2018jmmm;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import android.view.View;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;

public class ChallengeDisplay extends AppCompatActivity {

    Intent intent;

    String challengeFile;
    String[] challenges = {"do something", "kill someone", "eat a pie", "I hate the world", "just fucking work already"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge_display);

        intent = getIntent();

        TextView challengeText = (TextView) findViewById(R.id.challenge);
        challengeText.setText( getRandChallenge(), TextView.BufferType.EDITABLE);


    }

    public void goButton(View view) {
        System.out.println(13423432);

        Intent intent = new Intent(this, ProgessiveBar.class);
        startActivity(intent);
    }

    public void stopButton(View view) {

        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }


    protected String getRandChallenge()
    {
        return challenges[(int) Math.floor(Math.random()*challenges.length)];
    }



}
