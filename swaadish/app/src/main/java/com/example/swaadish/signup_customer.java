package com.example.swaadish;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.swaadish.databinding.SignupCustomerBinding;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;


public class signup_customer extends AppCompatActivity {
    SignupCustomerBinding binding;
    public Button button;
    FirebaseAuth firebaseAuth;
    ProgressDialog progessDialog;
    FirebaseFirestore firebaseFirestore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = SignupCustomerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        firebaseAuth = FirebaseAuth.getInstance();
        progessDialog= new ProgressDialog(this);
        firebaseFirestore = FirebaseFirestore.getInstance();

        binding.signupC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namec = binding.namec.getText().toString();
                String emailc = binding.emailc.getText().toString().trim();
                String passwordc = binding.passwordc.getText().toString();
                String phonec =  binding.phonec.getText().toString();

                progessDialog.show();

                firebaseAuth.createUserWithEmailAndPassword(emailc, passwordc)
                        .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                            @Override
                            public void onSuccess(AuthResult authResult) {
                                startActivity(new Intent(signup_customer.this, login_customer.class));

                                progessDialog.cancel();
                                firebaseFirestore.collection("user")
                                        .document(FirebaseAuth.getInstance().getUid())
                                        .set(new UserModelC(namec, phonec, emailc));



                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(signup_customer.this, "", Toast.LENGTH_SHORT).show();
                                progessDialog.cancel();

                            }
                        });


            }
        });
    }
}