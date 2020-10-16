package com.erikaposes.petagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

public class DetalleMascotas extends AppCompatActivity {

    private TextView tvNombre;
    private TextView tvTelefono;
    private TextView tvMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_mascotas);

        Bundle parametros = getIntent().getExtras();

        String nombre   = parametros.getString(getResources().getString(R.string.pnombre));
        String telefono = parametros.getString(getResources().getString(R.string.ptelefono));
        String mail     = parametros.getString(getResources().getString(R.string.pmail));


        tvNombre   = (TextView) findViewById(R.id.tvNombre);
        tvTelefono = (TextView) findViewById(R.id.tvTelefono);
        tvMail     = (TextView) findViewById(R.id.tvMail);


        tvNombre.setText(nombre);
        tvTelefono.setText(telefono);
        tvMail.setText(mail);

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK){
            Intent intent = new Intent(DetalleMascotas.this, MainActivity.class);
            startActivity(intent);

        }
        return super.onKeyDown(keyCode, event);
    }

}