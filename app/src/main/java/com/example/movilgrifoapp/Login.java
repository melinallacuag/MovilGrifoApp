package com.example.movilgrifoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button btn_login;
    EditText usuario, contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_login = findViewById(R.id.btnlogin);
        usuario = findViewById(R.id.usuario);
        contraseña = findViewById(R.id.contraseña);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuarioUser = usuario.getText().toString().trim();
                String contraseñaUser = contraseña.getText().toString().trim();

                if (usuarioUser.isEmpty() &&  contraseñaUser.isEmpty()){
                    Toast.makeText(Login.this,"Ingresar datos",Toast.LENGTH_SHORT).show();
                }else {
                    startActivity(new Intent(Login.this,Dasboard.class));
                }
            }
        });
    }
}