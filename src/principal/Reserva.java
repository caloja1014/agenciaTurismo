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
    private static ArrayList<Integer> codigos=new ArrayList<>();
    private static Random random = new Random();
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
        for(Cliente c:Agencia.clientes){
           if(c.getIdentificacion().equals(identificacion)){
               return true;
           } 
        }
        return false;
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

    /**
     * @return the fechaCheckIn
     */
    public String getFechaCheckIn() {
        return fechaCheckIn;
    }

    /**
     * @param fechaCheckIn the fechaCheckIn to set
     */
    public void setFechaCheckIn(String fechaCheckIn) {
        this.fechaCheckIn = fechaCheckIn;
    }

    /**
     * @return the fechaCheckOut
     */
    public String getFechaCheckOut() {
        return fechaCheckOut;
    }

    /**
     * @param fechaCheckOut the fechaCheckOut to set
     */
    public void setFechaCheckOut(String fechaCheckOut) {
        this.fechaCheckOut = fechaCheckOut;
    }

    /**
     * @return the hotel
     */
    public Hotel getHotel() {
        return hotel;
    }

    /**
     * @param hotel the hotel to set
     */
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the montoRecaudado
     */
    public int getMontoRecaudado() {
        return montoRecaudado;
    }

    /**
     * @param montoRecaudado the montoRecaudado to set
     */
    public void setMontoRecaudado(int montoRecaudado) {
        this.montoRecaudado = montoRecaudado;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the codigos
     */
    public static ArrayList<Integer> getCodigos() {
        return codigos;
    }

    /**
     * @param aCodigos the codigos to set
     */
    public static void setCodigos(ArrayList<Integer> aCodigos) {
        codigos = aCodigos;
    }

    /**
     * @return the random
     */
    public static Random getRandom() {
        return random;
    }

    /**
     * @param aRandom the random to set
     */
    public static void setRandom(Random aRandom) {
        random = aRandom;
    }
    
   
}