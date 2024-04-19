package com.example.signup442024;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.jar.Attributes;

public class MainActivity2 extends AppCompatActivity {

    TextView forgpass;

    EditText ename,epass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        ename = findViewById(R.id.Namelogin);
        epass = findViewById(R.id.Passlogin);
        login = findViewById(R.id.login);


        forgpass = findViewById(R.id.forgpass);
        login.setOnClickListener(new OnClickListener() {


            @Override
            public void onClick(View v) {
                String UserName = "name";
                String UserPassword ="pass";

                SharedPreferences sp = getSharedPreferences("myshared", MODE_PRIVATE);

                String name = sp.getString("UserName", "Error");
                String pass = sp.getString("UserPassword", "Error");

                Toast.makeText(MainActivity2.this, "user name"+name, Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity2.this, "user password"+pass, Toast.LENGTH_SHORT).show();


                if (UserName.equals(name) && UserPassword.equals(pass)) {
                    // Correct username and password
                    Intent c = new Intent(MainActivity2.this, Home.class);
                    startActivity(c);
                } else {
                    Toast.makeText(MainActivity2.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                }



                forgpass.setOnClickListener(new OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Intent b = new Intent(MainActivity2.this, forget_pass.class);
                        startActivity(b);
                    }
                });



            }
        });

    }
}