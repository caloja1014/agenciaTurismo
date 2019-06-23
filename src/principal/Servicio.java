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
    
    
    
    //setters

    public void setSecuenia(String secuenia) {
        this.secuenia = secuenia;
    }

    public void setIdHotel(String idHotel) {
        this.idHotel = idHotel;
    }

    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    
    //getters

    public String getSecuenia() {
        return secuenia;
    }

    public String getIdHotel() {
        return idHotel;
    }

    public String getIdServicio() {
        return idServicio;
    }

    public Boolean getEstado() {
        return estado;
    }
    
    
}
