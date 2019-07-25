package com.example.chinni.uhclcommunicator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Uhcl extends Activity {
private Handler handler;

    private Runnable callback;

    //@SuppressLint("MissingSuperCall")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uhcl);
handler = new Handler();
        callback = new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), Login.class));
                finish();
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }
        };
        handler.postDelayed(callback, 1000);
    }
        /*Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                } finally {
                    Intent uhclIntent = new Intent(Uhcl.this, Uhcl.class);
                    startActivity(uhclIntent);
                }
            }
        };

        timer.start();
    }*/

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        //finish();
        handler.removeCallbacks(callback);
    }

}