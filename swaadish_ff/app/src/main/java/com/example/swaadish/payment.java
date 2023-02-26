package com.example.swaadish;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.type.LatLng;

public class payment extends AppCompatActivity {

    public Button button;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        TextView subtotal = findViewById(R.id.sub_total);
        Bundle bn = getIntent().getExtras();
        String name = bn.getString("abc");
        subtotal.setText(String.valueOf(name));



        button = (Button) findViewById(R.id.cash);
        button.setOnClickListener(new View.OnClickListener(){


                                      @Override
                                      public void onClick(View v) {
                                          Intent intent =new Intent(payment.this, orderConfirmed.class);
                                          startActivity(intent);

                                      }
                                  }

        );

        button = (Button) findViewById(R.id.card);
        button.setOnClickListener(new View.OnClickListener(){


                                      @Override
                                      public void onClick(View v) {
                                          Intent intent =new Intent(payment.this, cardPayment.class);
                                          startActivity(intent);

                                      }
                                  }

        );





    }
}