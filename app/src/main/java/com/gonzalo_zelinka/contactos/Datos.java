package com.gonzalo_zelinka.contactos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class Datos extends AppCompatActivity {
    private TextView TvNombre;
    private TextView TvPhone;
    private TextView tvEmail;
    private TextView tvDescription;
    private TextView tvFechaNacimiento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        //RELACIONO LAS VARIABLES CON LOS TEXT VIEW PARA PODER MANEJAR SU CONTENIDO
        TvNombre = findViewById(R.id.TvNombre);
        TvPhone = findViewById(R.id.TvPhone);
        tvEmail = findViewById(R.id.tvEmail);
        tvDescription = findViewById(R.id.tvDescription);
        tvFechaNacimiento = findViewById(R.id.TvFechaNacimiento);

        //RECIBO LOS DATOS
        //picker de fecha
        Bundle fecha = this.getIntent().getExtras();
        int dia = fecha.getInt("dia");
        int mes = fecha.getInt("mes");
        int anio = fecha.getInt("anio");
        mes = mes+1;
        tvFechaNacimiento.setText(dia + "/" + mes + "/" + anio);

        //otros datos
        String nombre = getIntent().getStringExtra("nombre");
        String tel = getIntent().getStringExtra("tel");
        String mail = getIntent().getStringExtra("mail");
        String desc = getIntent().getStringExtra("desc");
        TvNombre.setText(nombre);
        TvPhone.setText(tel);
        tvEmail.setText(mail);
        tvDescription.setText(desc);

    }

    //METODO PARA VOLVER
    public void Regresar(View view){
        Intent i= new Intent(this, MainActivity.class);

        //MANDO LOS DATOS DE NUEVO
        i.putExtra("nombre", TvNombre.getText().toString());
        i.putExtra("tel", TvNombre.getText().toString());
        i.putExtra("mail", TvNombre.getText().toString());
        i.putExtra("desc", TvNombre.getText().toString());
        finish();
    }



}