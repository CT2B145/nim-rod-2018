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
    ChallengeList list = null;

    String[] challenges = {"Do a pushup",
            "Walk outside",
            "Touch a tree",
            "Find some grass. Look at it!",
            "Touch a friend's hand",
            "Walk to a friend and smile :)",
            "Do a push-up!",
            "Karaoke your favorite song, all the way through",
            "Drink some water, please",
            "Look into a mirror, and dance, baby",
            "\"He was a mighty hunter before the LORD: wherefore it is said, Even as Nimrod the mighty hunter before the LORD!\" -Genesis 10:9",
            "Take off your shoes for a while",
            "Ask out that person you like (¬‿¬)",
            "Listen to this, [insert song here]",
            "Draw a picture",
            "That I think you'll like: ",
            "Run around the block",
            "Try and take a nap, it might feel good?",
            "Try some soylent",
            "Eat a snack",
            "Quick! What's 7x7!",
            "Put your phone on a table, and walk out"

                            };


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

    protected ChallengeList getChallengeList()
    {

        try{
            FileOutputStream os = openFileOutput(challengeFile, Context.MODE_PRIVATE);
            FileInputStream is = openFileInput(challengeFile);
            ChallengeList list = new ChallengeList(is, os);
            return list;
        }
        catch(IOException e)
        {
            e.printStackTrace(System.err);
        }

        return null;
    }


}
