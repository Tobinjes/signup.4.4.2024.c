package com.example.signup442024;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn, acc;
    EditText etname, etpass;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        etname = findViewById(R.id.Name);
        etpass = findViewById(R.id.pass);

        btn = findViewById(R.id.btnlogin);
        acc = findViewById(R.id.account);

        acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name= etname.getText().toString();
                String pass= etpass.getText().toString();

                SharedPreferences sp =getSharedPreferences( "myshared", MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();

                editor.putString( "UserName", name);
                editor.putString(  "UserPassword" , pass);

                editor.commit();

                Intent c =new Intent(MainActivity.this, MainActivity2.class);

                        startActivity(c);
            }
        });


        btn.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(i);
            }
        });

    }
}