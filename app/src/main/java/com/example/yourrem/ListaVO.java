package com.example.yourrem;

public class ListaVO {
    private String id, nombre, info, hora, fecha;

    public ListaVO(String nombre, String info, String id, String hora, String fecha){
        this.nombre = nombre;
        this.info = info;
        this.id = id;
        this.hora=hora;
        this.fecha=fecha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
