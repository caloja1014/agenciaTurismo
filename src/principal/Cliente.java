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

    /**
     * @return the identificacion
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * @param identificacion the identificacion to set
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * @return the ciudadResi
     */
    public String getCiudadResi() {
        return ciudadResi;
    }

    /**
     * @param ciudadResi the ciudadResi to set
     */
    public void setCiudadResi(String ciudadResi) {
        this.ciudadResi = ciudadResi;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the numerosContacto
     */
    public String getNumerosContacto() {
        return numerosContacto;
    }

    /**
     * @param numerosContacto the numerosContacto to set
     */
    public void setNumerosContacto(String numerosContacto) {
        this.numerosContacto = numerosContacto;
    }

    /**
     * @return the numeroTarjeta
     */
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    /**
     * @param numeroTarjeta the numeroTarjeta to set
     */
    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    
}
