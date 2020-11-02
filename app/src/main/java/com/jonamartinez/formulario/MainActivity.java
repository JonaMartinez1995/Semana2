package com.jonamartinez.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Contacto> contactos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactos = new ArrayList<Contacto>();

        contactos.add(new Contacto("Pedro Pony","06/11/04","012287521"));
        contactos.add(new Contacto("Zoe Zebra ","22/08/02","534897128"));
        contactos.add(new Contacto("Pepa Pig","17/02/99","012587872"));

        ListView lstContactos = (ListView)  findViewById(R.id.lstContactos);
        lstContactos.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, contactos));

    }
}