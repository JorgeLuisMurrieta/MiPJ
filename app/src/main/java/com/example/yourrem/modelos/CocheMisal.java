package com.example.yourrem.modelos;

public class CocheMisal {


     String detalle;
     String fecha;
     String epoca;
     String nombre;

    public CocheMisal(){
    }
    public CocheMisal(String detalle, String fecha, String epoca, String nombre){
        this.nombre=nombre;
        this.detalle=detalle;
        this.fecha=fecha;
        this.epoca=epoca;
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

    public String getEpoca() {
        return epoca;
    }

    public void setEpoca(String epoca) {
        this.epoca=epoca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
