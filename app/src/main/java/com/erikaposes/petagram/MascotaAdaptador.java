package com.erikaposes.petagram;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewholder>{
    ArrayList<Mascota> mascotas;
    Activity activity;

    public MascotaAdaptador (ArrayList<Mascota> mascotas, Activity activity){
        this.mascotas = mascotas;
        this.activity = activity;
    }

    //Infla el layout y lo pasará al viewholder para que él obtenga los views.
    @Override
    public MascotaViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota, parent, false);
        return new MascotaViewholder(v);
    }

    //asocia cada elemento de la lista con cada view
    @Override
    public void onBindViewHolder(@NonNull MascotaViewholder mascotaViewholder, int position) {
        final Mascota mascota = mascotas.get(position);
        mascotaViewholder.imgFoto.setImageResource(mascota.getFoto());
        mascotaViewholder.tvNombre.setText(mascota.getNombre());

        mascotaViewholder.imgFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity, mascota.getNombre(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(activity, DetalleMascotas.class);
                intent.putExtra("nombre", mascota.getNombre());
                intent.putExtra("telefono", mascota.getTelefono());
                intent.putExtra("mail", mascota.getMail());
                activity.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() { //Cantidad de elementos que contiene mi lista de contactos
        return mascotas.size();
    }

    public static class MascotaViewholder extends RecyclerView.ViewHolder{

        private ImageView imgFoto;
        private TextView tvNombre;


        public MascotaViewholder(@NonNull View itemView) {
            super(itemView);
            imgFoto         = (ImageView) itemView.findViewById(R.id.imgFoto);
            tvNombre        = (TextView) itemView.findViewById(R.id.tvNombre);

        }
    }


}
