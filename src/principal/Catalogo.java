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
public class Catalogo {
    private String idServicio;
    private String nombre;
    
    //setters
        public void idServicio(String idServicio){
            this.idServicio=idServicio;
            }
        public void nombre(String nombre){
            this.nombre=nombre;
            }
        
    //getters
        public String idServicio(){
            return idServicio;
             }        
        public String nombre(){
            return nombre;
         } 
               
}
