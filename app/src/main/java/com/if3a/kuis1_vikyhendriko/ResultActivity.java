package com.if3a.kuis1_vikyhendriko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class ResultActivity extends AppCompatActivity {
    private EditText tvNama, tvNegara, tvEmail;
    String nama, negara, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tvNama = findViewById(R.id.tv_nama);
        tvNegara = findViewById(R.id.tv_negara);
        tvEmail = findViewById(R.id.tv_email);

        Intent terima = getIntent();
        nama = terima.getStringExtra("varNama");
        negara = terima.getStringExtra("varNegara");
        email = terima.getStringExtra("varEmail");

        tvNama.setText(nama);
        tvEmail.setText(email);
        tvNegara.setText(negara);

    }
}