package mjpon.ucsc.edu.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Intent intent = getIntent();
    }

    public void backButton (View view){
        //Takes you back to the main menu.
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }
    }
