package com.example.swaadish;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.swaadish.databinding.LoginVendor01Binding;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class login_vendor_01 extends AppCompatActivity {
    LoginVendor01Binding binding;
    FirebaseAuth firebaseAuth;
    ProgressDialog progressDialog;
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=LoginVendor01Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        progressDialog = new ProgressDialog(this);

        firebaseAuth=FirebaseAuth.getInstance();

        binding.login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = binding.emailv.getText().toString().trim();
                String password = binding.passwordv.getText().toString().trim();
                progressDialog.setTitle("sending mail");
                progressDialog.show();
                firebaseAuth.signInWithEmailAndPassword(email, password)
                        .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                            @Override
                            public void onSuccess(AuthResult authResult) {
                                progressDialog.cancel();
                                Toast.makeText(login_vendor_01.this, "login successful", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(login_vendor_01.this, homepage_01.class));




                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                progressDialog.cancel();
                                Toast.makeText(login_vendor_01.this, e.getMessage(), Toast.LENGTH_SHORT).show();

                            }
                        });

            }
        });



    }
}