package com.example.nodeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Main2Activity extends AppCompatActivity {


    EditText nome;
    EditText Data;
    EditText Hora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nome = findViewById(R.id.edtNome);
        Data = findViewById(R.id.edtData);
        Hora = findViewById(R.id.edtHora);
        String name = nome.getText().toString();
        Date date = Data.
        String Hour = Hora.getText().toString();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = ;

    }
}
