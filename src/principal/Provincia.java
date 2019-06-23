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
public class Provincia {
    private String idProvincia;
    private String nombre;
    private String descripcionProvincia;
    private String region;
    private String webProv;

    public Provincia(String idProvincia, String nombre, String descripcionProvincia, String region, String webProv) {
        this.idProvincia = idProvincia;
        this.nombre = nombre;
        this.descripcionProvincia = descripcionProvincia;
        this.region = region;
        this.webProv = webProv;
    }

    /**
     * @return the idProvincia
     */
    public String getIdProvincia() {
        return idProvincia;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the descripcionProvincia
     */
    public String getDescripcionProvincia() {
        return descripcionProvincia;
    }

    /**
     * @return the region
     */
    public String getRegion() {
        return region;
    }

    /**
     * @return the webProv
     */
    public String getWebProv() {
        return webProv;
    }
    
    
}
