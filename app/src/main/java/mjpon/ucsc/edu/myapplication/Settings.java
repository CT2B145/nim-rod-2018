package mjpon.ucsc.edu.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
    }

        // Capture the layout's TextView and set the string as its text
        // THIS IS NOT NEED FOR THE INDENTATION, THIS IS ONLY USED FOR MOVING TEXT OVER WHICH WAS NEVER NEEDED IN THE FIRST PLACE
//        TextView textView = findViewById(R.id.textView);
//        textView.setText(message);

    public void sendMessage(View view){
        //This takes you to the about page for information
        Intent intent = new Intent(this, About.class);

        startActivity(intent);
    }



    public void optionsMenu(View view){

        //This takes you to the options menu for custom stuff.
        Intent intent = new Intent(this, Options.class);
        startActivity(intent);
    }

    public void backButton (View view){
        //Takes you back to the main menu.
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
