package com.example.james.cruzhacks2018jmmm;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
//import android.widget.TextView;
//
//import com.example.james.cruzhacks2018jmmm.utils.ChallengeFactory;
//import com.example.james.cruzhacks2018jmmm.utils.ChallengeList;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ProgessiveBar extends AppCompatActivity {
    BarChart barchart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progessive_bar);
        Intent intent= getIntent();
//This is in theory that the bar graph that would work
        barchart = (BarChart) findViewById(R.id.bargraph);
//        ArrayList<String> cool = new ArrayList<>();
//        ArrayList<BarEntry> barEntries = new ArrayList<>();
//
//        barEntries.add(new BarEntry(44f, 0));
//        cool.add("test");
//
//        BarDataSet barDataSet= new BarDataSet(barEntries, "test");
//
//        BarData theData = new BarData(barEntries);
//        barchart.setData(theData);
//
//        barchart.setTouchEnabled(false);
//        barchart.setScaleEnabled(true);
//        barchart.setDragEnabled(true);

    }


}
