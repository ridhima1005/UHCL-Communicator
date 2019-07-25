package com.example.chinni.uhclcommunicator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Selectcriteria extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener{

    Button submit;

    Spinner selectedCriteria;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_criteria);

        selectedCriteria = (Spinner) findViewById(R.id.spinnerCriteria1);

        selectedCriteria.setOnItemSelectedListener(this);

        List<String> categories = new ArrayList<String>();
        categories.add("Accommodation");
        categories.add("Cultural");
        categories.add("Course");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        selectedCriteria.setAdapter(dataAdapter);

        submit = (Button) findViewById((R.id.btnSubmit));
        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(getApplicationContext(), ViewPost.class));
        Toast.makeText(getApplicationContext(), "Success!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String item = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}