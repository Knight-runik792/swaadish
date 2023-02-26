package com.example.swaadish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cardPayment extends AppCompatActivity {
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_payment);


        button = (Button) findViewById(R.id.pay_btn);
        button.setOnClickListener(new View.OnClickListener(){


                                      @Override
                                      public void onClick(View v) {
                                          Intent intent =new Intent(cardPayment.this, orderConfirmed.class);
                                          startActivity(intent);

                                      }
                                  }

        );




    }
}