package com.example.chinni.uhclcommunicator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class Details extends Activity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
        Toast.makeText(getApplicationContext(), "Hello Hawk !!!", Toast.LENGTH_SHORT).show();

    }
}