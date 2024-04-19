package com.example.signup442024;

import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Home extends AppCompatActivity {

    Button bttn;
    Button btt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        bttn = findViewById(R.id.bttnsignup);
        btt = findViewById(R.id.bttlogin);

        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {

                Intent s =new Intent( Home.this, MainActivity.class);
                startActivity(s);

                btt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent l =new Intent( Home.this, MainActivity2.class);
                        startActivity(l);
                    }
                });
            };

        });

    }
}