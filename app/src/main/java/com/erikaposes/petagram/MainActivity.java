package com.erikaposes.petagram;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toolbar;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascota);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();

        /*GridLayoutManager glm = new GridLayoutManager(this, 2);

        listaMascotas.setLayoutManager(glm);
        inicializarListaMascotas();
        inicializarAdaptador();*/

    }

    public MascotaAdaptador adaptador;
    private void inicializarAdaptador(){
        adaptador = new MascotaAdaptador(mascotas, this);
        listaMascotas.setAdapter(adaptador);

    }

    public void inicializarListaMascotas() {
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.fotoa, "Laika",  "(+598) 99 111 111", "erika@gmail.com"));
        mascotas.add(new Mascota(R.drawable.fotob, "Tom", "(+598) 99 222 222", "mateo@gmail.com"));
        mascotas.add(new Mascota(R.drawable.fotoc, "Jerry", "(+598) 99 333 333", "aiti@gmail.com"));
        mascotas.add(new Mascota(R.drawable.fotod, "Goofy", "(+598) 99 444 444", "martin@gmail.com"));
        mascotas.add(new Mascota(R.drawable.fotoe, "Huma", "(+598) 99 555 555", "martin@gmail.com"));

    }
}