package com.example.convocard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //variables To save the recieved value
        String graduanName,senderName;
        //Attach the TextViews variables to the TextViews in activity_main.xml
        TextView senderTextView=(TextView) findViewById(R.id.textView3);
        TextView graduanTextView=(TextView) findViewById(R.id.senderNameTextView);
        //Create an intent to recieve the intent form the other activity
        Intent recieved=getIntent();
        //expract data from the intent
        Bundle recievedBundle=recieved.getExtras();
        //store the value inside the key of put extra in a variable
        graduanName=(String) recievedBundle.get("graduan");
        //set the text view to be the name stored in the variable
        graduanTextView.setText(graduanName);
        //store the value inside the key of put extra in a variable
        senderName=(String) recievedBundle.get("sender");
        //set the text view to be the name stored in the variable
        senderTextView.setText(senderName);



    }
}
