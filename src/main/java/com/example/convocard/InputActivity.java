package com.example.convocard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputActivity extends AppCompatActivity {
    //To store user input for sender name
    EditText sender,graduan;
    //To send data to MainActivity.java
    Button submit;
    //To store a string value of sender name
    String senderName,graduanName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        //attach sender variable to the EditText view in activity_input.xml using findViewById method
        sender=(EditText) findViewById(R.id.senderEditText);
        graduan=(EditText) findViewById(R.id.graduanEditText);
        //attach submit variable to the Button view in activity_input.xml using findViewById method
        submit=(Button) findViewById(R.id.submitButton);
        //set up a listener to user click on submit button
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //there is a need for a condition statement empty
                //establish a connection between current activity and MainActivity.java using intent
                Intent userIntent=new Intent(getApplicationContext(),MainActivity.class);
                //Extract user data from the EditText view
                senderName= sender.getText().toString();
                graduanName=graduan.getText().toString();
                //add user data to our intent
                userIntent.putExtra("sender",senderName);
                userIntent.putExtra("graduan",graduanName);
                //open the activity , MAinActivity.java
                startActivity(userIntent);
            }

        });
    }
}
