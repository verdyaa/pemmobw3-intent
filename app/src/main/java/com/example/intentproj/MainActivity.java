package com.example.intentproj;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtNama, edtNrp, edtKtp, edtAlamat, edtTelepon;
    Button btnKirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNama = findViewById(R.id.edtNama);
        edtNrp = findViewById(R.id.edtNrp);
        edtKtp = findViewById(R.id.edtKtp);
        edtAlamat = findViewById(R.id.edtAlamat);
        edtTelepon = findViewById(R.id.edtTelepon);
        btnKirim = findViewById(R.id.btnKirim);

        btnKirim.setOnClickListener(v -> {
            String nama = edtNama.getText().toString();
            String nrp = edtNrp.getText().toString();
            String ktp = edtKtp.getText().toString();
            String alamat = edtAlamat.getText().toString();
            String telepon = edtTelepon.getText().toString();

            Intent intent = new Intent(MainActivity.this, SecondActivity.class);

            intent.putExtra("nama", nama);
            intent.putExtra("nrp", nrp);
            intent.putExtra("ktp", ktp);
            intent.putExtra("alamat", alamat);
            intent.putExtra("telepon", telepon);

            startActivity(intent);
        });
    }
}
