package com.example.seanmedlin.day2challenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.seanmedlin.day2challenge.LoginActivity.EMAIL_ADDRESS;
import static com.example.seanmedlin.day2challenge.LoginActivity.PASSWORD;

public class ProfileActivity extends AppCompatActivity {

    TextView mEmailAddressTextView;
    TextView mPasswordTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        mEmailAddressTextView = findViewById(R.id.tv_email_address);
        mPasswordTextView = findViewById(R.id.tv_password);

        String emailAddress = getIntent().getStringExtra(EMAIL_ADDRESS);
        String password = getIntent().getStringExtra(PASSWORD);

        mEmailAddressTextView.setText(emailAddress);
        mPasswordTextView.setText(password);
    }
}
