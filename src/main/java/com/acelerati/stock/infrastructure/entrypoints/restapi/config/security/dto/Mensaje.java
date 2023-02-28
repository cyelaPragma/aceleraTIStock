package com.acelerati.stock.infrastructure.entrypoints.restapi.config.security.dto;

//Clase para mostrar mensajes por pantalla en el cliente (front)
public class Mensaje {

    private String mensaje;

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
