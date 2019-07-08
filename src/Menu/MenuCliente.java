/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import static Menu.MenuCliente.sc;
import data.Data;
import static data.Data.hoteles;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import principal.Agencia;
import static principal.Agencia.clientes;
import static principal.Agencia.reservas;
import principal.Ciudad;
import principal.Cliente;
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
    ArrayList<Habitacion> habitacionesL;
    ArrayList<Ciudad> ciudadesL;
    
    public MenuCliente(){
        presentarInterfazCliente();
    }
    
    public void presentarInterfazCliente(){
        listaValsino.add("si");
        listaValsino.add("no");
        System.out.println("Hola! Soy Buzz tu agente asignado! En que puedo ayudarte?");
        String usuario1=sc.nextLine();
        boolean reservacion= Pattern.matches(".*reservacion.*|.*reserva.*|.*reservar.*",usuario1); 
        boolean eliminacion= Pattern.matches(".*cancelar.*|.*eliminar.*|.*cancelacion.*|.*anular.*|.*eliminacion.*|.*anulacion.*",usuario1); 
        boolean consultar= Pattern.matches(".*informacion.*&&.*eliminar.*|.*informacion.*&&.*anular.*",usuario1);
        boolean opcion=true;
        while (opcion){
            if(reservacion){    
                realizarReserva(usuario1);
                System.out.println("Desea realizar otra accion?");
                String validacion=sc.nextLine();
                while (!listaValsino.contains(validacion)){
                    System.out.println("Dato incorrecto, ingrese si o no");
                    validacion=sc.nextLine();
                }
                if (validacion.equalsIgnoreCase("si")){
                    opcion=true;
                }else if(validacion.equalsIgnoreCase("no")){
                    opcion=false;
                }
            }
            else if(eliminacion){
                eliminarReserva();
                System.out.println("Desea realizar otra accion?");
                String validacion=sc.nextLine();
                while (!listaValsino.contains(validacion)){
                    System.out.println("Dato incorrecto, ingrese si o no");
                    validacion=sc.nextLine();
                }
                if (validacion.equalsIgnoreCase("si")){
                    opcion=true;
                }else if(validacion.equalsIgnoreCase("no")){
                    opcion=false;
                }
            }
            else if(consultar){
                String ciu=sc.nextLine();
                String cod=sc.nextLine();
                String serv=sc.nextLine();
                mostrarInformacion(String ciu, String cod, ArrayList<Habitacion> habitacionesL, ArrayList<Ciudad> ciudadesL);  
                System.out.println("Desea realizar otra accion?");
                String validacion=sc.nextLine();
                while (!listaValsino.contains(validacion)){
                    System.out.println("Dato incorrecto, ingrese si o no");
                    validacion=sc.nextLine();
                }
                if (validacion.equalsIgnoreCase("si")){
                    opcion=true;
                }else if(validacion.equalsIgnoreCase("no")){
                    opcion=false;
                }
            }
            else{
                realizarNada();   
                System.out.println("Desea realizar otra accion?");
                String validacion=sc.nextLine();
                while (!listaValsino.contains(validacion)){
                    System.out.println("Dato incorrecto, ingrese si o no");
                }
                if (validacion.equalsIgnoreCase("si")){
                    opcion=true;
                }else if(validacion.equalsIgnoreCase("no")){
                    opcion=false;
                }
            }
        }
            System.out.println("Gracias por preferirnos!!");
    Scanner sc=new Scanner(System.in);
    }
    
    public void realizarReserva(String usuario1){
        System.out.println("hola");
        Ciudad c1=validarPorCiudad(usuario1);
        if(c1!=null){
            System.out.println("Desea solicitar un rango de precio?");
            String respu=sc.nextLine();
            if(Pattern.matches(".*SI.*",respu.toUpperCase())){
                System.out.println("Digame el valor inicial de su intervalo porfavor");
                String rangoIn=sc.nextLine();
                System.out.println("Digame el valor final de su intervalo porfavor");
                String rangoFin=sc.nextLine();
                String rango=rangoIn+" a "+rangoFin;
                mostrarInformacion(c1.getNombre(), rango, Data.habitaciones, Data.ciudades);
                System.out.println("Desea algun servicio en especifico?");
                String rsp=sc.nextLine();
                if(Pattern.matches(".*SI.*",rsp.toUpperCase())){
                    System.out.println("Indique el servicio que desea");
                }
                else{
                    System.out.println("Indiqueme que lugar desea reservar");
                    String opcion=sc.nextLine();
                }
            }
            else{
                //mostrarInformacion(c1);
                System.out.println("Indiqueme que lugar desea reservar");
            }
        }
    }
    
    public Ciudad validarPorCiudad(String usuario1){
        for(Ciudad c:Data.ciudades){
            if(Pattern.matches(".*"+c.getNombre().toUpperCase()+".*",usuario1.toUpperCase()))
                return c;
        }
        return null;
    }
    
    public void registrarReserva(String nombre){
        Hotel hotel=null;
        Cliente cli=null;
        System.out.println("Ha realizado alguna reservacion en otra ocasión?");
        String resp=sc.nextLine();
        if(Pattern.matches("SI", resp.toUpperCase())){
            System.out.println("Digame su identificacion");
            String ident=sc.nextLine();
            for(Cliente c:clientes){
                if(c.getIdentificacion().equalsIgnoreCase(ident)){
                    cli=c;
                }
            }
        }
        else{
            System.out.println("Procederemos a registrarlo");
            cli=registrarCliente();
        }
        for(Hotel h:hoteles){
            if(h.getNombre().equalsIgnoreCase(nombre)){
                hotel=h;
            }
        }
        System.out.println("Indiqueme la fecha de check In");
        String fechCkeIn=sc.nextLine();
        System.out.println("Indiqueme la fecha de check Out");
        String fechCkeOut=sc.nextLine();
        System.out.println("Cuanto dejara de abonado?");
        int monto=sc.nextInt();
        sc.nextLine();
        reservas.add(new Reserva(fechCkeIn, fechCkeIn, hotel,cli,monto));
    }
    
    public Cliente registrarCliente(){
        System.out.println("Indiqueme su identificacion");
        String identificacion=sc.nextLine();
        System.out.println("Indiqueme su ciudad de residencia");
        String ciudadResi=sc.nextLine();
        System.out.println("Indiqueme su nombre");
        String nombre=sc.nextLine();
        System.out.println("Indiqueme email");
        String email=sc.nextLine();
        System.out.println("Indiqueme su numero de telefono o celular");
        String celular=sc.nextLine();
        System.out.println("Indiqueme su numero de tarjeta");
        String numeroTarjeta=sc.nextLine();
        Cliente client=new Cliente(identificacion, ciudadResi,nombre, email, celular, numeroTarjeta);
        clientes.add(client);
        return client;
    }
    
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
            System.out.println("Indiqueme la ciudad en la que desea recidir");
            String ciudad=sc.nextLine();
            realizarReserva(ciudad);
        }
    }

   
}