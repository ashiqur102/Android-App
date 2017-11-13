package com.example.ashiqurrahman.bcs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        b=(Button) findViewById(R.id.retun);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Thank you",Toast.LENGTH_SHORT).show();
                Intent j = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(j);
            }
        });
    }
}
