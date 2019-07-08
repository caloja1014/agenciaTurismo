/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;

/**
 *
 * @author Freddy
 */
public class Cliente {
    private String identificacion;
    private String ciudadResi;
    private String nombre;
    private String email;
    private String numerosContacto;
    private String numeroTarjeta;

    public Cliente(String identificacion, String ciudadResi, String nombre, String email, String numerosContacto, String numeroTarjeta) {
        this.identificacion = identificacion;
        this.ciudadResi = ciudadResi;
        this.nombre = nombre;
        this.email = email;
        this.numerosContacto = numerosContacto;
        this.numeroTarjeta = numeroTarjeta;
    }
    
    public String getIdentificacion() {
        return identificacion;
    }

    public String getCiudadResi() {
        return ciudadResi;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getNumerosContacto() {
        return numerosContacto;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setCiudadResi(String ciudadResi) {
        this.ciudadResi = ciudadResi;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumerosContacto(String numerosContacto) {
        this.numerosContacto = numerosContacto;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    
}
