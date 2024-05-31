package com.vinayak09.wsafety;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText usernameEt, passwordEt;
    Button loginBtn;

    String username = "admin";
    String password = "admin123";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEt = findViewById(R.id.etUsername);
        passwordEt = findViewById(R.id.etPassword);
        loginBtn = findViewById(R.id.btnLogin);

    }

    public void login(View view){

        String usernameGet = usernameEt.getText().toString().trim();
        String passwordGet = passwordEt.getText().toString().trim();

        if(usernameGet.equals(username) && passwordGet.equals(password)) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Wrong Credentials", Toast.LENGTH_SHORT).show();
        }
    }
}