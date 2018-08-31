package com.example.shadow.login;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class loginActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button signin;
    TextView wrong;
    String user;
    String pass;
    SharedPreferences sp;
    Intent login;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        login = new Intent(getApplicationContext(), SecActivity.class);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        signin = findViewById(R.id.signin);
        wrong = findViewById(R.id.wrong);
        signup = findViewById(R.id.signup);

        sp= getSharedPreferences("login info",0);
 //       String usr = sp.getString("user","");
//        if(!usr.equals("") && usr.equals("sadegh")){   //log in by username
//           startActivity(login);
//       }
//        sp.edit().putBoolean("logged",false).apply();

   //     if (sp.getBoolean("logged",true))
   //         startActivity(login);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user = sp.getString("user", "");

                pass = sp.getString("pass", "");
                wrong.setText(user);
                 if (username.getText().toString().equals(user) && password.getText().toString().equals(pass)) {
 //                    sp.edit().putString("user","sadegh").apply();
                    startActivity(login);

//                    sp.edit().putBoolean("logged",true).apply();

                } else {
                //    wrong.setText("Invalid Login Information");
                }
            }
        });
    }

    public void sign_up(View view) {
        Intent signUpForm = new Intent(getApplicationContext(),FormActivity.class);
        startActivity(signUpForm);
    }

}
