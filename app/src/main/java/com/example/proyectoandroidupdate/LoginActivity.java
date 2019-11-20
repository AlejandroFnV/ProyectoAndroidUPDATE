package com.example.proyectoandroidupdate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.proyectoandroidupdate.R;
import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    private Button btLogin;
    private TextInputEditText etUsername, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initComponents();
        initEvents();

    }

    private void initEvents() {
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, FirstScreenActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initComponents() {
        btLogin = findViewById(R.id.btLogin);
        etUsername = findViewById(R.id.TIEDUsername);
        etPassword = findViewById(R.id.TIEDPassword);
    }
}
