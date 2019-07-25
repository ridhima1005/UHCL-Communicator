package com.example.chinni.uhclcommunicator;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ViewPost  extends Activity{

    String[] mobileArray = {
            "Android",
            "IPhone"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_post);

        ArrayAdapter aa = new ArrayAdapter<String>(this, R.layout
        .view_list, mobileArray);

        ListView lv = (ListView) findViewById(R.id.listSubj);
        lv.setAdapter(aa);
    }
}
