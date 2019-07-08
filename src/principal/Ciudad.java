/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Cloja
 */
public class Ciudad {
    private String idCiudad;
    private String idProvincia;
    private String nombre;

    public Ciudad(String idCiudad, String idProvincia, String nombre) {
        this.idCiudad = idCiudad;
        this.idProvincia = idProvincia;
        this.nombre = nombre;
    }

    /**
     * @return the idCiudad
     */
    public String getIdCiudad() {
        return idCiudad;
    }

    /**
     * @return the idProvincia
     */
    public String getIdProvincia() {
        return idProvincia;
    }

    /**
     * @return the nombreq
     */
    public String getNombre() {
        return nombre;
    }
    
    public String toString() {
        return "Ciudad{" + "nombre=" + nombre + '}';
    }
}
