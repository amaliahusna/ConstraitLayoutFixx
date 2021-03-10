package com.example.tugas1;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText edemail, edpassword, edusername;
    String nama, password,username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin=findViewById(R.id.button);
        edemail=findViewById(R.id.editTextTextEmailAddress);
        edpassword=findViewById(R.id.editTextNumberPassword);
        edusername=findViewById(R.id.editTextTextPersonName);

    btnLogin.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            nama = edemail.getText().toString();
            password = edpassword.getText().toString();
            username = edusername.getText().toString();
            String username="husna";
            String email="admin@mail.com";
            String pass = "123";
            if (nama.equals(email) && password.equals(pass) && username.equals(username))
            {
                Toast t = Toast.makeText(getApplicationContext(),
                        "Login Berhasil", Toast.LENGTH_LONG);
                t.show();
            }
            else
            {
                Toast t = Toast.makeText(getApplicationContext(),
                        "Login Gagal", Toast.LENGTH_LONG);
                t.show();
            }
        }
    });
}}