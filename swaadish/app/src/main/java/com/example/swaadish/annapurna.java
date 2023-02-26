package com.example.swaadish;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class annapurna extends AppCompatActivity {
    public Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annapurna);


        button = (Button) findViewById(R.id.half_tiffin);
        button.setOnClickListener(new View.OnClickListener(){


                                      @Override
                                      public void onClick(View v) {
                                          Intent intent =new Intent(annapurna.this, payment.class);
                                          startActivity(intent);

                                      }
                                  }

        );

        button = (Button) findViewById(R.id.full_tiffin);
        button.setOnClickListener(new View.OnClickListener(){


                                      @Override
                                      public void onClick(View v) {
                                          Intent intent =new Intent(annapurna.this, payment.class);
                                          startActivity(intent);

                                      }
                                  }

        );



    }
}