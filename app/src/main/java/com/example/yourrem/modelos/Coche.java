package com.example.yourrem.modelos;

public class Coche {


     String detalle;
     String fecha;
     String hora;
     String titulo;

    public Coche(){
    }
    public Coche( String detalle, String fecha, String hora, String titulo){
        this.titulo=titulo;
        this.detalle=detalle;
        this.fecha=fecha;
        this.hora=hora;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha=fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora=hora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
