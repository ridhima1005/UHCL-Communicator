package com.example.chinni.uhclcommunicator;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private EditText username, password;

    private Button login;

    private TextView loginLockedTV, attemptsLeftTV, numberOfRemainingLoginAttemptsTV;

    int numberOfRemainingLoginAttempts = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getWindow().setBackgroundDrawableResource(R.drawable.hawk_image);

        setContentView(R.layout.login1);
        setupVariables();
    }

    public void authenticateLogin(View view) {
        if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
            startActivity(new Intent(getApplicationContext(), Menu.class));
            Toast.makeText(getApplicationContext(), "Welcome!", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(getApplicationContext(), "Please Enter Correct Password/Username", Toast.LENGTH_SHORT).show();
            numberOfRemainingLoginAttempts--;
            attemptsLeftTV.setVisibility(View.VISIBLE);
            numberOfRemainingLoginAttemptsTV.setVisibility(View.VISIBLE);
            numberOfRemainingLoginAttemptsTV.setText(Integer.toString(numberOfRemainingLoginAttempts));
            if (numberOfRemainingLoginAttempts == 0) {
                login.setEnabled(false);
                loginLockedTV.setVisibility(View.VISIBLE);
                loginLockedTV.setBackgroundColor(Color.RED);
                loginLockedTV.setText("Account LOCKED!!!");
            }
        }
    }

    private void setupVariables() {
        username = (EditText) findViewById(R.id.usernameET);
        password = (EditText) findViewById(R.id.passwordET);
        login = (Button) findViewById(R.id.loginBtn);
        loginLockedTV = (TextView) findViewById(R.id.loginLockedTV);
        attemptsLeftTV = (TextView) findViewById(R.id.attemptsLeftTV);
        numberOfRemainingLoginAttemptsTV = (TextView) findViewById(R.id.numberOfRemainingLoginAttemptsTV);
        numberOfRemainingLoginAttemptsTV.setText(Integer.toString(numberOfRemainingLoginAttempts));
    }
}