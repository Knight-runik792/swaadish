package com.example.swaadish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signup_01 extends AppCompatActivity {
    public Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup01);


        button = (Button) findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener(){


                                      @Override
                                      public void onClick(View v) {
                                          Intent intent =new Intent(signup_01.this, signup_vendor_01.class);
                                          startActivity(intent);

                                      }
                                  }

        );

        button = (Button) findViewById(R.id.button7);
        button.setOnClickListener(new View.OnClickListener(){


                                      @Override
                                      public void onClick(View v) {
                                          Intent intent =new Intent(signup_01.this, signup_customer.class);
                                          startActivity(intent);

                                      }
                                  }

        );
    }
}