package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class adminhome extends AppCompatActivity {
        Button btn1,btn2,btn3,btn4,btn5,btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminhome);
        btn1=findViewById((R.id.btn1));
        btn2=findViewById((R.id.btn2));
        btn3=findViewById((R.id.btn3));
        btn4=findViewById((R.id.btn4));
        btn5=findViewById((R.id.btn5));
        btn6=findViewById((R.id.btn6));
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(adminhome.this, addnewconstruction.class);
                startActivity(intent);
            }
        });

    }
}