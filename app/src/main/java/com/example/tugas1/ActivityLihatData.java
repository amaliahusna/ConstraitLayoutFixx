package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityLihatData extends AppCompatActivity {
    TextView tvnama, tvnomor;
    String nama;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);
        Bundle b = getIntent().getExtras();
        nama = b.getString("a");

        tvnama = (TextView) findViewById(R.id.tvNamaKontak);
        tvnomor = (TextView) findViewById(R.id.tvNomorTelepon);
        switch (nama)
        {
            case "Dana":
                tvnama.setText("Dana R");
                tvnomor.setText("085123451234");
                break;
            case "Heru":
                tvnama.setText("Heru P");
                tvnomor.setText("085123451235");
                break;
            case "Aulia P":
                tvnama.setText("Aulia P");
                tvnomor.setText("085123451236");
                break;
            case "Indra S":
                tvnama.setText("Indra S");
                tvnomor.setText("085123451237");
                break;
            case "Tara":
                tvnama.setText("Tara J");
                tvnomor.setText("085123451238");
                break;
            case "Aqfa":
                tvnama.setText("Aqfa A");
                tvnomor.setText("085123451239");
                break;
            case "Husna":
                tvnama.setText("Husna A");
                tvnomor.setText("085123451230");
                break;
            case "Lia":
                tvnama.setText("Lia G");
                tvnomor.setText("085123451231");
                break;
            case "Eka":
                tvnama.setText("Eka W");
                tvnomor.setText("085123451232");
                break;
            case "Nova":
                tvnama.setText("Nova Y");
                tvnomor.setText("085123451233");
                break;
        }
    }
}