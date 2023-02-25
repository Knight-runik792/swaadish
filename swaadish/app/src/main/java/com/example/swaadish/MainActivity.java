package com.example.swaadish;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener(){


                                      @Override
                                      public void onClick(View v) {
                                          Intent intent =new Intent(MainActivity.this, login_01.class);
                                          startActivity(intent);

                                      }
                                  }

        );

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){


                                      @Override
                                      public void onClick(View v) {
                                          Intent intent =new Intent(MainActivity.this, signup_01.class);
                                          startActivity(intent);

                                      }
                                  }

        );

        button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener(){


                                      @Override
                                      public void onClick(View v) {
                                          Intent intent =new Intent(MainActivity.this, homepage_01.class);
                                          startActivity(intent);

                                      }
                                  }

        );





    }
}