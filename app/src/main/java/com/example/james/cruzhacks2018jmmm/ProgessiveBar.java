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

public class ProgessiveBar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progessive_bar);
        Intent intent= getIntent();

    }
}
