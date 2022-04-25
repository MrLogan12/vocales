package com.example.ejercicio_20_abril;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etPalabra;
    private Button btnProcesar, btnContar;
    private CheckBox cbMinuscula;

    private String palabra;
    private Boolean ebminuscula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarVistas();

        btnContar.setOnClickListener(view -> {obtenerInformacion();contarVocales();});
    }
    private void contarVocales(){
        int cont = 0;
        int cantidadvocales=0;

        for(int i = 0; i < palabra.length(); i++){
            char letra = palabra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                cont++;
                cantidadvocales++;
            }
        }
        Toast.makeText(this, "La palabra tiene " + cont + " vocales", Toast.LENGTH_SHORT).show();
    }

    private void inicializarVistas() {
        etPalabra = findViewById(R.id.etPalabra);
        btnProcesar = findViewById(R.id.btnProcesar);
        btnContar = findViewById(R.id.btnContar);
        cbMinuscula = findViewById(R.id.cbMinuscula);

    }
    private void obtenerInformacion(){
        palabra = etPalabra.getText().toString();
        ebminuscula = cbMinuscula.isChecked();
    }
}