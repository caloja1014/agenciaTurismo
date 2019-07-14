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

    /**
     * @return the informacionContacto
     */
    public String getInformacionContacto() {
        return informacionContacto;
    }

    /**
     * @param informacionContacto the informacionContacto to set
     */
    public void setInformacionContacto(String informacionContacto) {
        this.informacionContacto = informacionContacto;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the nombreGerente
     */
    public String getNombreGerente() {
        return nombreGerente;
    }

    /**
     * @param nombreGerente the nombreGerente to set
     */
    public void setNombreGerente(String nombreGerente) {
        this.nombreGerente = nombreGerente;
    }

    /**
     * @return the empleados
     */
    public ArrayList<String> getEmpleados() {
        return empleados;
    }

    /**
     * @param empleados the empleados to set
     */
    public void setEmpleados(ArrayList<String> empleados) {
        this.empleados = empleados;
    }

   
}
