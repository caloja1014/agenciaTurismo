/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import static Menu.MenuCliente.sc;
import java.util.ArrayList;
import java.util.Scanner;
import principal.Agencia;
import principal.Ciudad;
import principal.Habitacion;
import principal.Hotel;
import principal.Reserva;

/**
 *
 * @author Freddy
 */
public class MenuCliente {
        private static final ArrayList <String> listaValsino=new ArrayList();
    private static final ArrayList <String> listaCod=new ArrayList();
    static Scanner sc =new Scanner(System.in);
    
    public ArrayList<Hotel> mostrarInformacion(String ciudad,String rango,ArrayList<Habitacion> habitaciones,ArrayList<Ciudad> ciudades){
        String[] rangoPrecio=rango.split("a");
        Double rangoSuperior=Double.parseDouble(rangoPrecio[0].trim());
        Double rangoInferior=Double.parseDouble(rangoPrecio[1].trim());
        Scanner s= new Scanner(System.in);
        ArrayList<Habitacion> habitacionesEscogidas=new ArrayList();
        ArrayList<Hotel> hoteles= new ArrayList();
        for (Habitacion habitacion: habitaciones ){
            int indice=0;
             if (habitacion.getTarifaSencilla()>=rangoInferior && (habitacion.getTarifaDoble()<=rangoSuperior || habitacion.getTarifaTriple()<=rangoSuperior) && ciudades.get(indice).getNombre().equalsIgnoreCase(ciudad) )
                indice++;
                
                
                int indiceHotel=Integer.parseInt(habitacion.getIdHotel())-1;
                Hotel hotel=data.Data.hoteles.get(indiceHotel);
                if (!hoteles.contains(hotel)){
                    hoteles.add(hotel);
                    habitacionesEscogidas.add(habitacion);
                }
      
        }
        if (hoteles.size()>0){
            return hoteles;
        }
        else{
        return null;
        }
        
    }
    
    public ArrayList<Hotel> mostrarInformacion(String ciudad,String rango,ArrayList<Habitacion> habitaciones,String servicio,ArrayList<Ciudad> ciudades){
        ArrayList<Hotel>hotelesEscogidos=this.mostrarInformacion(ciudad,rango, habitaciones,ciudades);
        ArrayList<Hotel>hotelesFinales=new ArrayList();
        for (Hotel hotel :hotelesEscogidos){
            ArrayList<String> servicios=hotel.getServicios();
            if (servicios.contains(servicio)){
                hotelesFinales.add(hotel);
            }
        }
        if (hotelesFinales.size()>0){
            return hotelesFinales;
        }
        else{
        return null;
        }
    }

    public void eliminarReserva(){
    
    boolean opcion=true;
    System.out.println("Lamento escuchar eso, me podría decir el código de su reserva?");
    
    while (opcion){
    String resp=sc.nextLine();
    int respConv=Integer.parseInt(resp);
    Reserva rev=new Reserva();
    if(rev.validarCodigo(respConv)){
        for(Reserva r:Agencia.reservas){
            if(resp.equals(r.getCodigo())){
                Agencia.reservas.remove(r); 
            }
        }
        System.out.println("Su reserva ha sido cancelada exitosamente");
        opcion=false;
    }
    else{
        System.out.println("El código ingresado es incorrecto, favor ingrese el código nuevamente");
    }
    }

}

    public void realizarNada(){

    System.out.println("No entiendo, desea reservar un hotel? ");
    String reserva=sc.nextLine();
            
    
        if (reserva.equalsIgnoreCase("si")){
            //mostrarInformacion();
             
        }else if(reserva.equalsIgnoreCase("no")){
            
        }
}}

