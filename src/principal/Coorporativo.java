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
public class Coorporativo extends Cliente{
    private String informacionContacto;
    private String cargo;
    private String nombreGerente;
    private ArrayList<String> empleados;
    
    public Coorporativo(String identificacion, String ciudadResi, String nombre, String email, String numerosContacto, String numeroTarjeta, String informacionContacto, String cargo, String nombreGerente) {
        super(identificacion, ciudadResi, nombre, email, numerosContacto, numeroTarjeta);
        this.informacionContacto=informacionContacto;
        this.cargo=cargo;
        this.nombreGerente=nombreGerente;
    }   

    public String getInformacionContacto() {
        return informacionContacto;
    }

    public String getCargo() {
        return cargo;
    }

    public String getNombreGerente() {
        return nombreGerente;
    }

    public void setInformacionContacto(String informacionContacto) {
        this.informacionContacto = informacionContacto;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setNombreGerente(String nombreGerente) {
        this.nombreGerente = nombreGerente;
    }
}
