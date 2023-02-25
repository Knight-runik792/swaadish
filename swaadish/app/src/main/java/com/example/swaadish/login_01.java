package com.example.swaadish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class login_01 extends AppCompatActivity {
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ogin01);

        button = (Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener(){


                                      @Override
                                      public void onClick(View v) {
                                          Intent intent =new Intent(login_01.this, login_vendor_01.class);
                                          startActivity(intent);

                                      }
                                  }

        );

        button = (Button) findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener(){


                                      @Override
                                      public void onClick(View v) {
                                          Intent intent =new Intent(login_01.this, login_customer.class);
                                          startActivity(intent);

                                      }
                                  }

        );

    }
}
