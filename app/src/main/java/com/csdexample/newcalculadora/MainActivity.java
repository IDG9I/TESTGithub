package com.csdexample.newcalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //crea variables de tipos CheckBox
    CheckBox CheckRecordar;
    CheckBox CheckMantener;

    //es para mostrar el layout
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //se llama el checkbox del layout al CheckRecordar
        CheckRecordar = (CheckBox) findViewById(R.id.RecordarC);
        CheckMantener = (CheckBox) findViewById(R.id.MantenerS);
    }

    //crea una funcion para llamar otra clase y mostrarlo en pantalla (SLayout)
    public void SecundaryClass (View view){
        Intent SecundaryLayout = new Intent(this, secundary.class);
        startActivity(SecundaryLayout);

        if(view.getId() == R.id.button){
            validar();
        }
    }

    /*public void onClick(View view){
        if(view.getId() == R.id.button){
            validar();
        }
    }
    */
    
    private void validar(){
        String text="Para mas seguridad le recomendamos desactivar estas opciones en caso su Dispositivo no tenga clave ";
        if(CheckRecordar.isChecked()){
            text+="{Recordar Contraseña}";
        }

        if(CheckMantener.isChecked()){
            text+="{Mantener Sesion}";
        }
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }
}