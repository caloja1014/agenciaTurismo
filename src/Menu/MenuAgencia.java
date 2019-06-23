/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import data.Data;
import principal.*;
import java.text.ParseException;
import java.util.Scanner;
import java.util.logging.Logger;
import principal.Ciudad;
import principal.Hotel;
import principal.Reserva;

/**
 *
 * @author Freddy
 */
public class MenuAgencia {
    
   
    Scanner sc=new Scanner(System.in);
    Reserva rv=new Reserva();
    public MenuAgencia() throws ParseException {
        presentarMenuAgencia();
    }
    
    
    public void presentarMenuAgencia() throws ParseException{
        System.out.println("Menu agenecia: \n1.- Consultar Reservas \n2.- Salir");
        String opcion=sc.nextLine();
        if(opcion.equalsIgnoreCase("1")){
            consultarReserva();
        }
    }
        
    public void consultarReserva() throws ParseException{
        System.out.println("Ingrese fecha de inicio(formato yyyy-MM-dd): ");
        String fechaIn=sc.nextLine();
        int fechaIni=convertirFecha(fechaIn);
        System.out.println("Ingrese fecha de fin(formato yyyy-MM-dd):: ");
        String fechaFin=sc.nextLine();
        int fechaOut=convertirFecha(fechaFin);
        System.out.println("Ingrese la ciudad que desea consultar o \"T\" si desea ingresar todas las ciudades ");
        String opcion=sc.nextLine();
        float monto=0;
        for(Reserva rs:Agencia.reservas){
            int fechaReserConvert=convertirFecha(rs.getFechaCheckIn());
            if(opcion.equalsIgnoreCase("T")){
                if(fechaReserConvert>=fechaIni && fechaReserConvert<=fechaOut){
                    monto+=rs.getMontoRecaudado();
                }
            }
            else{
                for(Ciudad c:Data.ciudades){
                    for(Hotel h:Data.hoteles){
                        if(fechaReserConvert>=fechaIni && fechaReserConvert<=fechaOut && rs.getHotel().equals(h) && h.getIdCiudad().equals(opcion)){
                            monto+=rs.getMontoRecaudado();
                        }   
                    }
                }
            }
        }
        System.out.println(monto);
    }
        
    public int convertirFecha(String fecha){
        String[] fechaSeparada=fecha.split("-");
        String fechaParaConvertir="";
        for(String s:fechaSeparada){
            fechaParaConvertir+=s;
        }
        return Integer.parseInt(fechaParaConvertir);
    }
}
