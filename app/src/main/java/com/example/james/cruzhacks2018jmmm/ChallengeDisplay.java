package com.example.james.cruzhacks2018jmmm;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

import com.example.james.cruzhacks2018jmmm.utils.ChallengeFactory;
import com.example.james.cruzhacks2018jmmm.utils.ChallengeList;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class ChallengeDisplay extends AppCompatActivity {

    Intent intent;

    static String challengeFile = "challenges.json";
        ChallengeList list = new ChallengeList();

    String[] challenges = {"do something", "kill someone", "eat a pie", "I hate the world", "just fucking work already"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge_display);

        intent = getIntent();

        TextView challengeText = (TextView) findViewById(R.id.challenge);
        challengeText.setText( getRandChallenge(), TextView.BufferType.EDITABLE);
//        createChallengeList();
//        list.saveList();


    }

    public void goButton(View view) {

        Intent intent = new Intent(this, MainMenu.class);
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

    protected void createChallengeList()
    {

        try{
            FileOutputStream os = openFileOutput(challengeFile, Context.MODE_PRIVATE);
            FileInputStream is = openFileInput(challengeFile);
            ChallengeList list = new ChallengeList(is, os);
            list.addChallenge(ChallengeFactory.makeChallenge("challenge", String.valueOf(Math.random()*10), "cool"));
            System.err.println(list);
        }
        catch(IOException e)
        {
            e.printStackTrace(System.err);
        }


    }


}
