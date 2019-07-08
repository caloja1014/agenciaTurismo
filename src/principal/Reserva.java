/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author gabrielapazmino
 */
public class Reserva {
    private String fechaCheckIn;
    private String fechaCheckOut;
    private Hotel hotel;
    private Cliente cliente;
    private int montoRecaudado;
    private int codigo;
    static ArrayList<Integer> codigos=new ArrayList<>();
    static Random random = new Random();
    //constructor 

    public Reserva(String fechaCheckIn, String fechaCheckOut, Hotel hotel, Cliente cliente, int montoRecaudado) {
        this.fechaCheckIn = fechaCheckIn;
        this.fechaCheckOut = fechaCheckOut;
        this.hotel = hotel;
        this.cliente = cliente;
        this.montoRecaudado=montoRecaudado;
                
    }

    public Reserva() {
    }
    
    
    //metodo
        public boolean verificarCliente(String identificacion){
            return true;
        }
     public int generarCodigo(){
        int cod=random.nextInt(1000000);
        while(!validarCodigo(cod)){
            cod=random.nextInt(1000000);
        }
        return cod;
        }   
    
        public boolean validarCodigo(int cod){
            if(codigos.contains(cod)){
                return false;
            }
            return true;
        }
    
    
    //getters
    
    public String getFechaCheckIn() {
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

    public int getMontoRecaudado() {
        return montoRecaudado;
    }
        public int getCodigo() {
        return codigo;
    }

    //setters
    public void setFechaCheckIn(String fechaCheckIn) {
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
