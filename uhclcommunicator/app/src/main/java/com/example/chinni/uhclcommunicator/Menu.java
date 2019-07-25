package com.example.chinni.uhclcommunicator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Menu extends AppCompatActivity implements OnClickListener{
    Button detail, disForum, vPost, urPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        detail=(Button) findViewById(R.id.detailBtn);
        detail.setOnClickListener(this);

        disForum = (Button) findViewById(R.id.discussionBtn);
        disForum.setOnClickListener(this);

        vPost = (Button) findViewById(R.id.viewBtn);
        vPost.setOnClickListener(this);

        urPost = (Button) findViewById(R.id.yourBtn);
        urPost.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.detailBtn:
                Intent detailintent = new Intent(this,Details.class);
                startActivity(detailintent);
                break;

            case R.id.discussionBtn:
                Intent discussionintent = new Intent(this,Forum.class);
                startActivity(discussionintent);
                break;

            case R.id.viewBtn:
                Intent viewintent = new Intent(this,Selectcriteria.class);
                startActivity(viewintent);
                break;

            case R.id.yourBtn:
                Intent yourintent = new Intent(this,Details.class);
                startActivity(yourintent);
                break;

            default:
                break;
        }

    }
}