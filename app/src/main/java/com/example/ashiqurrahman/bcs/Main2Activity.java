package com.example.ashiqurrahman.bcs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import br.com.bloder.magic.view.MagicButton;

public class Main2Activity extends AppCompatActivity {
   MagicButton m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        m=(MagicButton) findViewById(R.id.magiic);
        m.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"thank you",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(i);

            }
        });
    }
}
