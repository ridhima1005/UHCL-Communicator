package com.example.chinni.uhclcommunicator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Forum extends AppCompatActivity implements OnItemSelectedListener, View.OnClickListener {
    private Button post;

    private EditText subject, description;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forum);

        // Spinner element
        Spinner spinner = (Spinner) findViewById(R.id.spinnerCriteria);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("Accommodation");
        categories.add("Cultural");
        categories.add("Course");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
        setVariables();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
// On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {

    }

    private void setVariables(){
        subject = (EditText) findViewById(R.id.editTextSubject);
        description = (EditText) findViewById(R.id.editTextDescription);
      //  criteria = (Spinner) findViewById(R.id.spinnerCriteria);
        post = (Button) findViewById((R.id.btn_post));
        post.setOnClickListener(this);
    }

    public void onClick(View view){
        startActivity(new Intent(getApplicationContext(), Menu.class));
        Toast.makeText(getApplicationContext(), "Success!", Toast.LENGTH_SHORT).show();

    }
}