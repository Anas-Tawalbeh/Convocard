package com.example.convocard;

import android.app.Activity;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class BackgroundsAdapter extends ArrayAdapter<Backgrounds> {

    BackgroundsAdapter(Activity context, ArrayList<Backgrounds> BackgroundAdapter){
        super(context,0, BackgroundAdapter);
    }

}
