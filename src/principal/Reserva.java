/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Date;

/**
 *
 * @author gabrielapazmino
 */
public class Reserva {
    private Date fechaCheckIn;
    private String fechaCheckOut;
    private Hotel hotel;
    private Cliente cliente;

    //constructor 

    public Reserva(Date fechaCheckIn, String fechaCheckOut, Hotel hotel, Cliente cliente) {
        this.fechaCheckIn = fechaCheckIn;
        this.fechaCheckOut = fechaCheckOut;
        this.hotel = hotel;
        this.cliente = cliente;
    }
    
    
    //metodo
        public boolean verificarCliente(String identificacion){
            return true;
        }
     
    
    //getters
    
    public Date getFechaCheckIn() {
        return fechaCheckIn;
    }

    public String getFechaCheckOut() {
        return fechaCheckOut;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public Cliente getCliente() {
        return cliente;
    }

    //setters
    public void setFechaCheckIn(Date fechaCheckIn) {
        this.fechaCheckIn = fechaCheckIn;
    }

    public void setFechaCheckOut(String fechaCheckOut) {
        this.fechaCheckOut = fechaCheckOut;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    

        
}
