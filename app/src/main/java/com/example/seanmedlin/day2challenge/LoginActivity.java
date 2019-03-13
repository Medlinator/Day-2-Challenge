package com.example.seanmedlin.day2challenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    public static final String EMAIL_ADDRESS = "Email Address";
    public static final String PASSWORD = "Password";


    EditText mEmailEditText;
    EditText mPasswordEditText;
    Button   mLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mEmailEditText = findViewById(R.id.et_email_address);
        mPasswordEditText = findViewById(R.id.et_password);
        mLoginButton = findViewById(R.id.btn_login);

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailAddress = mEmailEditText.getText().toString();
                String password    = mPasswordEditText.getText().toString();

                if (emailAddress != null && !emailAddress.isEmpty() && emailAddress.contains("@")
                        && password != null && !password.isEmpty()) {
                    Intent intent = new Intent(LoginActivity.this, ProfileActivity.class);
                    intent.putExtra(EMAIL_ADDRESS, emailAddress);
                    intent.putExtra(PASSWORD, password);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Must be a valid email address and password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
