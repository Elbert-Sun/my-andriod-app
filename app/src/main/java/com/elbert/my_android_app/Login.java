package com.elbert.my_android_app;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Login extends AppCompatActivity {
    Button mButton;
    EditText username;
    EditText password;
    TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mButton = findViewById(R.id.login);
        message = findViewById(R.id.message);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        mButton.setOnClickListener(
                new View.OnClickListener() {
                    @SuppressLint("SetTextI18n")
                    public void onClick(View view) {
                        if (loginInfoIsVerified(username.getText().toString(), password.getText().toString())) {
                            message.setText("Hello, Elbert!!!");
                        } else {
                            message.setText("Login fails!");
                        }
                    }
                });
    }


    private boolean loginInfoIsVerified(String username, String password) {
        return username.equals("Elbert") && password.equals("123");
    }
}
