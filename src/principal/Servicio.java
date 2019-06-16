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
    
    
    //setters
        public void secuenia(String secuenia){
            this.secuenia=secuenia;
            }
        public void idHotel(String idHotel){
            this.idHotel=idHotel;
            }
        public void idServicio(String idServicio){
            this.idServicio=idServicio;
            }
        public void estado(Boolean estado){
            this.estado=estado;
            }        
    //getters
        public String secuenia(){
            return secuenia;
             }        
        public String idHotel(){
            return idHotel;
         } 
        public String idServicio(){
            return idServicio;
             }        
        public Boolean estado(){
            return estado;
         }     
}
