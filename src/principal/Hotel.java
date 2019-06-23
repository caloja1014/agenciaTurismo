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
    
    
        
        //getters

    public String getIdHotel() {
        return idHotel;
    }

    public String getIdCiudad() {
        return idCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescipcionHotel() {
        return descipcionHotel;
    }

    public String getTargetaHotel() {
        return targetaHotel;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getWebHotel() {
        return webHotel;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public String getFoto() {
        return foto;
    }

    public String getLatitud() {
        return latitud;
    }

    public String getLongitud() {
        return longitud;
    }
        
    //setters

    public void setIdHotel(String idHotel) {
        this.idHotel = idHotel;
    }

    public void setIdCiudad(String idCiudad) {
        this.idCiudad = idCiudad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescipcionHotel(String descipcionHotel) {
        this.descipcionHotel = descipcionHotel;
    }

    public void setTargetaHotel(String targetaHotel) {
        this.targetaHotel = targetaHotel;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setWebHotel(String webHotel) {
        this.webHotel = webHotel;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }
    
    
    
}
