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
    
    
    //setters
        public void fechaCheckIn(Date fechaCheckIn){
            this.fechaCheckIn=fechaCheckIn;
            }
        public void fechaCheckOut(String fechaCheckOut){
            this.fechaCheckOut=fechaCheckOut;
            }
        public void hotel(Hotel hotel){
            this.hotel=hotel;
            }
        public void cliente(Cliente cliente){
            this.cliente=cliente;
            
        }
    
    //getters
        public Date fechaCheckIn(){
            return fechaCheckIn;
             }        
        public String fechaCheckOut(){
            return fechaCheckOut;
         } 
        public Hotel hotel(){
            return hotel;
             }        
        public Cliente cliente(){
            return cliente;
             } 
    
    //metodo
        public boolean verificarCliente(String identificacion){
            return true;
        }
        
}
