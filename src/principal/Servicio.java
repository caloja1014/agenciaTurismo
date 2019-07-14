/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author gabrielapazmino
 */
public class Servicio {
    private String secuenia;
    private String idHotel;
    private String idServicio;
    private Boolean estado;
    
    //contructor
    public Servicio(String secuenia, String idHotel, String idServicio, Boolean estado) {
        this.secuenia = secuenia;
        this.idHotel = idHotel;
        this.idServicio = idServicio;
        this.estado = estado;
    }

    /**
     * @return the secuenia
     */
    public String getSecuenia() {
        return secuenia;
    }

    /**
     * @param secuenia the secuenia to set
     */
    public void setSecuenia(String secuenia) {
        this.secuenia = secuenia;
    }

    /**
     * @return the idHotel
     */
    public String getIdHotel() {
        return idHotel;
    }

    /**
     * @param idHotel the idHotel to set
     */
    public void setIdHotel(String idHotel) {
        this.idHotel = idHotel;
    }

    /**
     * @return the idServicio
     */
    public String getIdServicio() {
        return idServicio;
    }

    /**
     * @param idServicio the idServicio to set
     */
    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    /**
     * @return the estado
     */
    public Boolean getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    

}