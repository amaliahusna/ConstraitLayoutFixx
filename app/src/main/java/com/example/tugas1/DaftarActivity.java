package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.text.Editable;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class DaftarActivity extends AppCompatActivity {
    EditText edtNama, edtAlamat, edtEmail, edtPass, edtRepass;
    RadioButton rdkris, rdkat, rdislam, rdhindu, rdbudha;
    RadioGroup agama, kelamin;
    Button btndaftar, btncancel;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Bundle bundle = getIntent().getExtras();

        edtNama=findViewById(R.id.edNama);
        edtEmail=findViewById(R.id.edAlamat);
        edtAlamat=findViewById(R.id.editEmail);
        edtPass=findViewById(R.id.editPass);
        edtRepass=findViewById(R.id.editeepass);

        rdkris=findViewById(R.id.rdkristen);
        rdkat=findViewById(R.id.rdkatolik);
        rdislam=findViewById(R.id.rdislam);
        rdhindu=findViewById(R.id.rdhindu);
        rdbudha=findViewById(R.id.rdbudha);

        agama=findViewById(R.id.rgagama);
        kelamin=findViewById(R.id.rgkelamin);

        btndaftar=findViewById(R.id.btnDaftar);
        btncancel=findViewById(R.id.btnCancel);

        btncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DaftarActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btndaftar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v){
            if(edtNama.getText().toString().length()==0){
                edtNama.setError("Nama diperlukan!");
            }

            if(edtAlamat.getText().toString().length()==0){
                edtAlamat.setError("Alamat diperlukan!");
            }

            if(edtEmail.getText().toString().length()==0){
                edtEmail.setError("Email diperlukan!");
            }

            if(edtPass.getText().toString().length()==0){
                edtPass.setError("Password diperlukan!");
            }else if(edtPass.getText().toString().length()!=6){
                edtPass.setError("Panjang Password kurang dari 6 huruf");
            }

            if(edtPass.getText().toString().length()==0 || edtPass.equals(edtRepass)){
                edtPass.setError("Ulangi Password diperlukan!");

            }

            if(edtPass.length() != 0 && edtAlamat.length() != 0 && edtEmail.length() != 0 && edtPass.length() !=0 && edtPass.length() == 6 && edtPass.getText() == edtPass.getText()){
                Toast.makeText(getApplicationContext(), "Registrasi Berhasil!",
                        Toast.LENGTH_SHORT).show();
                //ke layout Main activity
                Intent i =  new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        }
    });
    /**
     btndaftar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(DaftarActivity.this, MainActivity.class);
        startActivity(intent);
        nama = edtNama.getText().toString();
        alamat=edtAlamat.getText().toString();
        email=edtEmail.getEditableText().toString();
        password=edtPassword.getText().toString();
        repass=edtrepass.getText().toString();
        radagama=agama.getTag().toString();
        radkelamin=agama.getTag().toString();

        if (nama.isEmpty() && alamat.isEmpty() && email.isEmpty() && password.isEmpty() && repass.isEmpty() && radagama.isEmpty() && radkelamin.isEmpty())
        {
            Toast a = Toast.makeText(getApplicationContext(), "Login Berhasil", Toast.LENGTH_LONG);
            a.show();
             //membuat objek bundle
             Bundle b = new Bundle();
             //memasukkan value dari variabel password dengan kunci "a"
             // dan dimasukkan kedalam bundle
             b.putString("a", nama.trim());
             //memasukkan value dari variabel password dengan kunci "b"
             //dan dimasukkan kedalam bundle
             b.putString("b", password.trim());
             //membuat objek intent berpindah activity dari mainactivity ke activityhasil
             Intent i = new Intent(getApplicationContext(), Home_Activity.class);
             //memasukkan bundle kedalam intent untuk dikrimkan ke ActivityHasil
             i.putExtras(b);
             //berpindah ke Home_Activity
             startActivity(i);
        }
        else if (nama.isEmpty() || alamat.isEmpty() || email.isEmpty() || password.isEmpty() || repass.isEmpty() || radagama.isEmpty() || radkelamin.isEmpty());
        {
            if(nama.equals(email)) {
            Toast ps = Toast.makeText(getApplicationContext(),"Password Salah", Toast.LENGTH_LONG);
            ps.show();
        }
        else {
        Toast es = Toast.makeText(getApplicationContext(), "Email salah", Toast.LENGTH_LONG);
        es.show();
        }
        }
     });*/
    }
}