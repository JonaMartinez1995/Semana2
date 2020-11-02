package com.gonzalo_zelinka.contactos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText nombreCompleto;
    private TextInputEditText telefono;
    private TextInputEditText email;
    private TextInputEditText descripcion;
    private DatePicker PFechaNacimiento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //GUARDO EN VARIABLES LO Q INGRESA EL USUARIO
        nombreCompleto = findViewById(R.id.NombreCompleto);
        telefono = findViewById(R.id.telefono);
        email = findViewById(R.id.Email);
        descripcion = findViewById(R.id.Descripcion);

        //picker de fecha
        PFechaNacimiento = findViewById(R.id.PFechaNacimiento);

        //RECIBO LOS DATOS DE NUEVO
        String nombre = getIntent().getStringExtra("nombre");
        String tel = getIntent().getStringExtra("tel");
        String mail = getIntent().getStringExtra("mail");
        String desc = getIntent().getStringExtra("desc");
        nombreCompleto.setText(nombre);
        telefono.setText(tel);
        email.setText(mail);
        descripcion.setText(desc);
    }

    //METODO PARA MANDAR LOS DATOS
    public void Siguiente(View view){
        Intent i= new Intent(this, Datos.class);
        i.putExtra("nombre", nombreCompleto.getText().toString());
        i.putExtra("tel", telefono.getText().toString());
        i.putExtra("mail", email.getText().toString());
        i.putExtra("desc", descripcion.getText().toString());

        //picker
        i.putExtra("dia",PFechaNacimiento.getDayOfMonth());
        i.putExtra("mes",PFechaNacimiento.getMonth());
        i.putExtra("anio",PFechaNacimiento.getYear());

        startActivity(i);
    }

}