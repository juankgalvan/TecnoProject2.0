package com.example.tecnoproject20;

import android.util.JsonReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class jsonProyectosParser {
    public List<Proyectos> leerFlujoJson(InputStream in) throws IOException {
        // Nueva instancia JsonReader
        JsonReader reader = new JsonReader(new InputStreamReader(in, "UTF-8"));
        try {
            // Leer Array
            return leerArrayProyectos(reader);
        } finally {
            reader.close();
        }

    }



    public List<Proyectos> leerArrayProyectos(JsonReader reader) throws IOException {
        // Lista temporal
        ArrayList<Proyectos> Proyectos = new ArrayList<>();

        reader.beginArray();
        while (reader.hasNext()) {
            // Leer objeto
            Proyectos.add(leerProyectos(reader));
        }
        reader.endArray();
        return Proyectos;
    }

    public Proyectos leerProyectos(JsonReader reader) throws IOException {
        // Variables locales
        String titulo = null;
        String descPro = null;
        String Logo = null;

        // Iniciar objeto
        reader.beginObject();

        /*
        Lectura de cada atributo
         */
        while (reader.hasNext()) {
            String name = reader.nextName();
            switch (name) {
                case "titulo":
                    titulo = reader.nextString();

                    break;
                case "descPro":
                    descPro = reader.nextString();
                    break;
                case "Logo":
                    Logo = reader.nextString();
                    break;
                default:
                    reader.skipValue();
                    break;
            }
        }
        reader.endObject();
        return new Proyectos(titulo, descPro, Logo);
    }
}
