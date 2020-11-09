package com.example.tecnoproject20;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdaptadorDeProyectos {
    public AdaptadorDeProyectos(Context context, List objects) {
        super();
    }

    public View getView(int position, View convertView, ViewGroup parent){

        //Obteniendo una instancia del inflater
        LayoutInflater inflater = (LayoutInflater)getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //Salvando la referencia del View de la fila
        View v = convertView;

        //Comprobando si el View no existe
        if (null == convertView) {
            //Si no existe, entonces inflarlo
            v = inflater.inflate(
                    R.layout.item_lista,
                    parent,
                    false);
        }

        //Obteniendo instancias de los elementos
        TextView Titulo = (TextView)v.findViewById(R.id.titulo);
        TextView descPro = (TextView)v.findViewById(R.id.descPro);
        ImageView Logo = (ImageView)v.findViewById(R.id.LogoP);


        //Obteniendo instancia de la Tarea en la posición actual
        Proyectos item = getItem(position);

        Titulo.setText(item.getTitulo());
        descPro.setText(item.getDescPro());
        //Logo.setImageResource(convertirRutaEnId(item.Logo()));

        //Devolver al ListView la fila creada
        return v;

    }

    private Context getContext() {
        return null;
    }

    private Proyectos getItem(int position) {
        return null;
    }

   /* private int convertirRutaEnId(String nombre){
        Context context = getContext();
        return context.getResources()
                .getIdentifier(nombre, "drawable", context.getPackageName());
    }*/
}
