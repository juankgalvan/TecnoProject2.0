package com.example.tecnoproject20;

public class Proyectos {
    private String titulo;
    private String descPro;
    private String Logo;

    public Proyectos(String titulo, String descPro, String Logo) {
        this.titulo = titulo;
        this.descPro = descPro;
        this.Logo = Logo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescPro() {
        return descPro;
    }

    public void setDescPro(String descPro) {
        this.descPro = descPro;
    }

    public String getLogo() { return Logo;
    }

    public void setLogo(String Logo) {
        this.Logo = Logo;
    }
}
