package com.example.intentproj;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView txtNama, txtNrp, txtKtp, txtAlamat, txtTelepon;
    Button btnTutup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtNama = findViewById(R.id.txtNama);
        txtNrp = findViewById(R.id.txtNrp);
        txtKtp = findViewById(R.id.txtKtp);
        txtAlamat = findViewById(R.id.txtAlamat);
        txtTelepon = findViewById(R.id.txtTelepon);
        btnTutup = findViewById(R.id.btnTutup);

        String nama = getIntent().getStringExtra("nama");
        String nrp = getIntent().getStringExtra("nrp");
        String ktp = getIntent().getStringExtra("ktp");
        String alamat = getIntent().getStringExtra("alamat");
        String telepon = getIntent().getStringExtra("telepon");

        txtNama.setText("Nama: " + (nama != null && !nama.isEmpty() ? nama : "-"));
        txtNrp.setText("NRP: " + (nrp != null && !nrp.isEmpty() ? nrp : "-"));
        txtKtp.setText("No. KTP: " + (ktp != null && !ktp.isEmpty() ? ktp : "-"));
        txtAlamat.setText("Alamat: " + (alamat != null && !alamat.isEmpty() ? alamat : "-"));
        txtTelepon.setText("No. Telepon: " + (telepon != null && !telepon.isEmpty() ? telepon : "-"));

        if (btnTutup != null) {
            btnTutup.setOnClickListener(v -> finish());
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "SecondActivity onDestroy() dipanggil", Toast.LENGTH_SHORT).show();
    }
}
