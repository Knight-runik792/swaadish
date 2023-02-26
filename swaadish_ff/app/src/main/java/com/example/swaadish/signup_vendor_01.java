package com.example.swaadish;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.swaadish.databinding.SignupVendor01Binding;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class signup_vendor_01 extends AppCompatActivity {
    SignupVendor01Binding binding;
    public Button button;
    FirebaseAuth firebaseAuth;
    ProgressDialog progessDialog;
    FirebaseFirestore firebaseFirestore;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = SignupVendor01Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        firebaseAuth = FirebaseAuth.getInstance();
        progessDialog= new ProgressDialog(this);
        firebaseFirestore = FirebaseFirestore.getInstance();
        binding.signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = binding.fullname.getText().toString();
                String password = binding.password.getText().toString();
                String phone =  binding.phoneNumber.getText().toString();
                String email =  binding.emailAddress.getText().toString().trim();
                String gst =  binding.gstnumber.getText().toString();
                progessDialog.show();

                firebaseAuth.createUserWithEmailAndPassword(email, password)
                        .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                            @Override
                            public void onSuccess(AuthResult authResult) {
                                startActivity(new Intent(signup_vendor_01.this, login_vendor_01.class));

                                progessDialog.cancel();
                                firebaseFirestore.collection("user")
                                        .document(FirebaseAuth.getInstance().getUid())
                                        .set(new UserModel(name, phone, email, gst));



                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(signup_vendor_01.this, "", Toast.LENGTH_SHORT).show();
                                progessDialog.cancel();

                            }
                        });

            }
        });

    }

}