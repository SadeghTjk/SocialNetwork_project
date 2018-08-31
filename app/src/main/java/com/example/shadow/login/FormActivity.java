package com.example.shadow.login;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toolbar;
import android.view.Menu;
import android.widget.Toast;
import android.view.MenuItem;
import android.app.ActionBar;
import android.view.MenuItem;

public class FormActivity extends AppCompatActivity {

    EditText getName;
    EditText getUser;
    EditText getPass;
    EditText getEmail;
    Button getSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getName = findViewById(R.id.getName);
        getUser = findViewById(R.id.getUser);
        getPass = findViewById(R.id.getPass);
        getEmail = findViewById(R.id.getEmail);
        getSignUp = findViewById(R.id.getSignUp);

    }

    public void signupform(View view) {
        String name = getName.getText().toString();
        String user = getUser.getText().toString();
        String pass = getPass.getText().toString();
        String email = getEmail.getText().toString();

        SharedPreferences sp = getSharedPreferences("login info", Context.MODE_PRIVATE);
        sp.edit().putString("name", name).apply();
        sp.edit().putString("user", user).apply();
        sp.edit().putString("pass", pass).apply();
        sp.edit().putString("email", email).apply();

        Toast.makeText(getApplicationContext(), "Sign Up Secssecful!",
                Toast.LENGTH_LONG).show();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

}
