/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;

/**
 *
 * @author gabrielapazmino
 */
public class Hotel {
    private String idHotel;
    private String idCiudad;
    private String nombre;
    private String descipcionHotel;
    private String targetaHotel;
    private String ubicacion;
    private String direccion;
    private String webHotel;
    private String clasificacion;
    private String foto;
    private String latitud;
    private String longitud;
    private ArrayList<String> servicios=new ArrayList();
        //constructor

    public Hotel(String idHotel, String idCiudad, String nombre, String descipcionHotel, String targetaHotel, String ubicacion, String direccion, String webHotel, String clasificacion, String foto, String latitud, String longitud) {
        this.idHotel = idHotel;
        this.idCiudad = idCiudad;
        this.nombre = nombre;
        this.descipcionHotel = descipcionHotel;
        this.targetaHotel = targetaHotel;
        this.ubicacion = ubicacion;
        this.direccion = direccion;
        this.webHotel = webHotel;
        this.clasificacion = clasificacion;
        this.foto = foto;
        this.latitud = latitud;
        this.longitud = longitud;
    }
    

    
    /**
     * @return the servicios
     */
    public ArrayList<String> getServicios() {
        return servicios;
    }
    
    public String toString() {
        return "Hotel{" + "nombre=" + nombre + ", descipcionHotel=" + descipcionHotel + ", targetaHotel=" + targetaHotel + ", ubicacion=" + ubicacion + ", direccion=" + direccion + ", webHotel=" + webHotel + ", clasificacion=" + clasificacion + ", foto=" + foto + ", latitud=" + latitud + ", longitud=" + longitud + '}';
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
     * @return the idCiudad
     */
    public String getIdCiudad() {
        return idCiudad;
    }

    /**
     * @param idCiudad the idCiudad to set
     */
    public void setIdCiudad(String idCiudad) {
        this.idCiudad = idCiudad;
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
     * @return the descipcionHotel
     */
    public String getDescipcionHotel() {
        return descipcionHotel;
    }

    /**
     * @param descipcionHotel the descipcionHotel to set
     */
    public void setDescipcionHotel(String descipcionHotel) {
        this.descipcionHotel = descipcionHotel;
    }

    /**
     * @return the targetaHotel
     */
    public String getTargetaHotel() {
        return targetaHotel;
    }

    /**
     * @param targetaHotel the targetaHotel to set
     */
    public void setTargetaHotel(String targetaHotel) {
        this.targetaHotel = targetaHotel;
    }

    /**
     * @return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the webHotel
     */
    public String getWebHotel() {
        return webHotel;
    }

    /**
     * @param webHotel the webHotel to set
     */
    public void setWebHotel(String webHotel) {
        this.webHotel = webHotel;
    }

    /**
     * @return the clasificacion
     */
    public String getClasificacion() {
        return clasificacion;
    }

    /**
     * @param clasificacion the clasificacion to set
     */
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    /**
     * @return the foto
     */
    public String getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }

    /**
     * @return the latitud
     */
    public String getLatitud() {
        return latitud;
    }

    /**
     * @param latitud the latitud to set
     */
    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    /**
     * @return the longitud
     */
    public String getLongitud() {
        return longitud;
    }

    /**
     * @param longitud the longitud to set
     */
    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }
}
