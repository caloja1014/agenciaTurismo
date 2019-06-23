/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.text.ParseException;

/**
 *
 * @author Freddy
 */
public class MenuAgencia {
    
        public void presentarMenuAgencia() throws ParseException{
        System.out.println("Menu agenecia: \n1.- Consultar Reservas \n2.- Salir");
        String opcion=sc.nextLine();
        if(opcion.equalsIgnoreCase("1")){
            consultarReserva();
        }
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
