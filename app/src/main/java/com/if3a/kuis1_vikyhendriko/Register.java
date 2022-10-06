package com.if3a.kuis1_vikyhendriko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Register extends AppCompatActivity {
    private EditText etNama, etEmail, etPassword, etNegara;
    private Button btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etNama = findViewById(R.id.et_nama);
        etEmail = findViewById(R.id.et_email);
        etPassword = findViewById(R.id.et_password);
        etNegara = findViewById(R.id.et_negara);
        btnSignup= findViewById(R.id.btn_signup);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = etNama.getText().toString();
                String password = etPassword.getText().toString();
                String email = etEmail.getText().toString();
                String negara = etNegara.getText().toString();

                if(nama.trim().equals(null)){
                    etNama.setError("Nama Tidak Boleh Kosong");
                }
                else if(password.trim().equals(null)){
                    etPassword.setError("Password Tidak Boleh Kosong");
                }
                else if(email.trim().equals(null)){
                    etEmail.setError("PIN Tidak Boleh Kosong");
                }
                else if(negara.trim().equals(null)){
                    etNegara.setError("PIN Tidak Boleh Kosong");
                }
                else {
                    Intent intent = new Intent(Register.this, ResultActivity.class);
                    intent.putExtra("varNama", nama);
                    intent.putExtra("varEmail", email);
                    intent.putExtra("varNegara", negara);
                    startActivity(intent);
            }
        }
    }
}