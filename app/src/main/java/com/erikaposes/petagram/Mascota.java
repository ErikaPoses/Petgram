package com.erikaposes.petagram;

public class Mascota {
    private String nombre;
    private String telefono;
    private String mail;
    private int foto;

    public Mascota(int foto, String nombre, String telefono, String mail) {
        this.foto       = foto;
        this.nombre     = nombre;
        this.telefono   = telefono;
        this.mail       = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
