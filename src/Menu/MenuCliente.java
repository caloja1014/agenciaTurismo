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
import principal.Coorporativo;
import principal.Habitacion;
import principal.Hotel;
import principal.Reserva;
import data.Data;

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
    
    /**
     * Se crea el constructor de la clase que presentara el menu para el cliente
     */
    public MenuCliente(){
        presentarInterfazCliente();
    }
    
    /**
     * Se crea el metodo presentar interfaz cliente que se refiere al bot de asistencia para el usuario
     */
    public void presentarInterfazCliente(){
        listaValsino.add("si");
        listaValsino.add("no");
        System.out.println("Hola! Soy Buzz tu agente asignado! En que puedo ayudarte?");
        String usuario1=sc.nextLine();
        /**
         * Se define las diferentes acciones que asistira nuestro bot que son reservar, elimnar y consultar
         */
        boolean reservacion= Pattern.matches(".*reservacion.*|.*reserva.*|.*reservar.*",usuario1.toLowerCase()); 
        boolean eliminacion= Pattern.matches(".*cancelar.*|.*eliminar.*|.*cancelacion.*|.*anular.*|.*eliminacion.*|.*anulacion.*",usuario1.toLowerCase()); 
        boolean consultar= Pattern.matches(".*informacion.*&&.*eliminar.*|.*informacion.*&&.*anular.*",usuario1.toLowerCase());
        boolean opcion=true;
        /**
         * Se realiza las respectivas comparaciones con lo que solicite el usuario para realizar una determinada accion
         */
        while (opcion){
            /**
             * Caso reservacion que muestra las opciones segun especificaciones para luego reservar el lugar de preferencia
             */
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
            /**
             * Caso eliminacion que permite eliminar una reservaacion solicitando un codigo
             */
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
            /**
             * Caso consultar que muestra por pantalla las respectivas opciones de hoteles
             */
            else if(consultar){
                String ciu=sc.nextLine();
                String cod=sc.nextLine();
                String serv=sc.nextLine();
                mostrarInformacion( ciu,  cod, data.Data.habitaciones,serv, data.Data.ciudades);  
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
            /**
             * Caso nada que ocurre en caso de que no se entienda lo solicitado por el usuario
             */
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
    }
    
    /**
     * 
     * @param usuario1 Se crea el metodo realizar reserva que muestra opciones segun lo especificado para diferentes casos
     */
    public void realizarReserva(String usuario1){
        Ciudad c1=validarPorCiudad(usuario1);
        if(c1!=null){
            reservaPorCiudad(c1);
        }else{
            System.out.println("Indiqueme una ciudad de preferencia");
            String ciud=sc.nextLine();
            Ciudad c2=validarPorCiudad(ciud);
            if(c2!=null){
                reservaPorCiudad(c2);
            }
        }
    }
    
    /**
     * 
     * @param usuario1 se crea el metodo para validarPorCiudad que verifica que exista la ciudad ingresada
     * @return 
     */
    public Ciudad validarPorCiudad(String usuario1){
        for(Ciudad c:Data.ciudades){
            if(Pattern.matches(".*"+c.getNombre().toUpperCase()+".*",usuario1.toUpperCase()))
                return c;
        }
        return null;
    }
    
    /**
     * 
     * @param c1 Se crea el metodo reservarPorCiudad que procede a solicitar especificaciones de hoteles, ingresado previamente la ciudad de alojamiento
     */
    public void reservaPorCiudad(Ciudad c1){
        ArrayList<Hotel> hotelesOp;
        System.out.println("Desea solicitar un rango de precio?");
        String respu=sc.nextLine();
        if(Pattern.matches(".*SI.*",respu.toUpperCase())){
            System.out.println("Digame el valor inicial de su intervalo porfavor");
            String rangoIn=sc.nextLine();
            System.out.println("Digame el valor final de su intervalo porfavor");
            String rangoFin=sc.nextLine();
            String rango=rangoIn+" a "+rangoFin;
            hotelesOp=mostrarInformacion(c1.getNombre(), rango, Data.habitaciones, Data.ciudades);
            System.out.println("Desea algun servicio en especifico?");
            String rsp=sc.nextLine();
            if(Pattern.matches(".*SI.*",rsp.toUpperCase())){
                hotelesOp.clear();
                System.out.println("Indique el servicio que desea");
                String servicio=sc.nextLine();
                hotelesOp=mostrarInformacion(c1.getNombre(), rango, Data.habitaciones, servicio, Data.ciudades);
                this.mostrarHoteles(hotelesOp);
                System.out.println("Indiqueme el nombre del hotel que desea reservar");
                
                String nombre=sc.nextLine();
                Hotel hotel=hotelesOp.get(Integer.parseInt(nombre)-1);
                System.out.println(hotelesOp.get(Integer.parseInt(nombre)-1));
                MenuCliente.mostrarHabitaciones(hotel, Data.habitaciones);
                registrarReserva(nombre);
            }
            else{
                this.mostrarHoteles(hotelesOp);
                System.out.println("Indiqueme el nombre del hotel que desea reservar");
                String nombre=sc.nextLine();
                Hotel hotel=hotelesOp.get(Integer.parseInt(nombre)-1);
                System.out.println(hotelesOp.get(Integer.parseInt(nombre)-1));
                MenuCliente.mostrarHabitaciones(hotel, Data.habitaciones);
                registrarReserva(nombre);
            }
        }
        else{
            hotelesOp=mostrarInformacion(c1.getNombre(),data.Data.habitaciones,data.Data.ciudades);
            System.out.println("Desea algun servicio en especifico?");
            String rsp=sc.nextLine();
            if(Pattern.matches(".*SI.*",rsp.toUpperCase())){
                hotelesOp.clear();
                System.out.println("Indique el servicio que desea");
                String servicio=sc.nextLine();
                hotelesOp=mostrarInformacion(c1.getNombre(), Data.habitaciones, Data.ciudades,servicio);
                this.mostrarHoteles(hotelesOp);
                System.out.println("Indiqueme el nombre del hotel que desea reservar");
                String nombre=sc.nextLine();
                Hotel hotel=hotelesOp.get(Integer.parseInt(nombre)-1);
                System.out.println(hotelesOp.get(Integer.parseInt(nombre)-1));
                MenuCliente.mostrarHabitaciones(hotel, Data.habitaciones);
                registrarReserva(nombre);
            }
            else{
                this.mostrarHoteles(hotelesOp);
                System.out.println("Indiqueme el nombre del hotel que desea reservar");
                String nombre=sc.nextLine();
                Hotel hotel=hotelesOp.get(Integer.parseInt(nombre)-1);
                System.out.println(hotelesOp.get(Integer.parseInt(nombre)-1));
                MenuCliente.mostrarHabitaciones(hotel, Data.habitaciones);
                registrarReserva(nombre);
            }
        }
    }
    
    /**
     * 
     * @param nombre Se crea el metodo registrarReserva que procede a solicitar los datos del tiempo de reserva luego de haber seleccionado el hotel
     */
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
        System.out.println("Indiqueme la fecha de check In (formato yyyy-MM-dd)");
        String fechCkeIn=sc.nextLine();
        System.out.println("Indiqueme la fecha de check Out (formato yyyy-MM-dd)");
        String fechCkeOut=sc.nextLine();
        System.out.println("Cuanto dejara de abonado?");
        int monto=sc.nextInt();
        sc.nextLine();
        reservas.add(new Reserva(fechCkeIn, fechCkeIn, hotel,cli,monto));
    }
    
    /**
     * 
     * @return Metodo registrarCliente que pide la informacion del cliente para poder realizar la reservacion
     */
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
        System.out.println("Viene como turista o como coorporativo?");
        String estado=sc.nextLine();
        if(Pattern.matches(".*coorporativo.*",estado.toLowerCase())){
            System.out.println("Indiqueme la informacion de contacto?");
            String infoContacto=sc.nextLine();
            System.out.println("Indiqueme su cargo");
            String cargo=sc.nextLine();
            System.out.println("Indiqueme el nombre del gerente");
            String nombreGerente=sc.nextLine();
            Cliente client=new Coorporativo(identificacion, ciudadResi,nombre, email, celular, numeroTarjeta, infoContacto, cargo, nombreGerente);
            clientes.add(client);
            return client;
        }
        Cliente client=new Cliente(identificacion, ciudadResi,nombre, email, celular, numeroTarjeta);
        clientes.add(client);
        return client;
    }
    /**
     * Este metodo filtra la lista de habitaciones por ciudad
     * @param ciudad
     * @param habitaciones
     * @param ciudades
     * @return Retorna una lista de habitaciones filtrada por ciudades
     */
    public ArrayList<Hotel> mostrarInformacion(String ciudad,ArrayList<Habitacion> habitaciones,ArrayList<Ciudad> ciudades){
        ArrayList<Habitacion> habitacionesEscogidas=new ArrayList();
        ArrayList<Hotel> hoteles= new ArrayList();
        for (Habitacion habitacion: habitaciones ){
            int indiceHotel=Integer.parseInt(habitacion.getIdHotel())-1;
            Hotel hotel=data.Data.hoteles.get(indiceHotel);            
            String ciu= ciudades.get(Integer.parseInt(hotel.getIdCiudad())-1).getNombre();
            if (ciu.equalsIgnoreCase(ciudad)){
                if (!hoteles.contains(hotel)){
                    hoteles.add(hotel);
                    habitacionesEscogidas.add(habitacion);
                }
            }
        }
        if (hoteles.size()>0){
            return hoteles;
        }
        else{
            return null;
        }
    }
    /**
     * Este metodo filtra la lista de habitaciones por ciudad y servicio
     * @param ciudad
     * @param habitaciones
     * @param ciudades
     * @param servicio
     * @return Retorna una lista de habitaciones filtrada por ciudades y servicio
     */
    public ArrayList<Hotel> mostrarInformacion(String ciudad,ArrayList<Habitacion> habitaciones,ArrayList<Ciudad> ciudades,String servicio){
        ArrayList<Hotel>hotelesEscogidos=this.mostrarInformacion(ciudad, habitaciones,ciudades);
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
    
    /**
     * Este metodo filtra la lista de habitaciones por ciudad, servicio y precios
     * @param ciudad
     * @param rango
     * @param habitaciones
     * @param ciudades
     * @return Retorna una lista de habitaciones filtrada por ciudades, servicio y un rango de precios
     */
    public ArrayList<Hotel> mostrarInformacion(String ciudad,String rango,ArrayList<Habitacion> habitaciones,ArrayList<Ciudad> ciudades){
        String[] rangoPrecio=rango.split("a");
        Double rangoSuperior=Double.parseDouble(rangoPrecio[0].trim());
        Double rangoInferior=Double.parseDouble(rangoPrecio[1].trim());
        Scanner s= new Scanner(System.in);
        ArrayList<Habitacion> habitacionesEscogidas=new ArrayList();
        ArrayList<Hotel> hoteles= new ArrayList();
        ArrayList<Hotel> hotelesPorCiudad= this.mostrarInformacion(ciudad, habitaciones, ciudades);
        for (Habitacion habitacion: habitaciones ){
            if (habitacion.getTarifaSencilla()>=rangoInferior && (habitacion.getTarifaDoble()<=rangoSuperior || habitacion.getTarifaDoble()==0.0||habitacion.getTarifaTriple()<=rangoSuperior||habitacion.getTarifaTriple()==0.00 )){
                int indiceHotel=Integer.parseInt(habitacion.getIdHotel())-1;
                Hotel hotel=data.Data.hoteles.get(indiceHotel);
                for (Hotel h:hotelesPorCiudad){
                    if(hotel.getIdHotel()==h.getIdHotel()){
                        if (!hoteles.contains(h)){
                            hoteles.add(h);
                            habitacionesEscogidas.add(habitacion);
                        }
                    }
                }
            }
        }
        if (hoteles.size()>0){
            return hoteles;
        }
        else{
            return null;
        }
    }
    /**
     * Este metodo filtra la lista de habitaciones por ciudad y precios
     * @param ciudad
     * @param rango
     * @param habitaciones
     * @param servicio
     * @param ciudades
     * @return Retorna una lista de habitaciones filtrada por ciudades y un rango de precios
     */
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

    /**
     * metodo eliminarReserva que solicita el codigo de la reservacion para posteriormente eliminarla del sistema
     */
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

    /**
     * metodorealizarNada le recalca la opcion de reservar en el caso de que no se entienda lo que desea el cliente
     */
    public void realizarNada(){
    System.out.println("No entiendo, desea reservar un hotel? ");
    String reserva=sc.nextLine();
        if (reserva.equalsIgnoreCase("si")){
            System.out.println("Indiqueme la ciudad en la que desea recidir");
            String ciudad=sc.nextLine();
            realizarReserva(ciudad);
        }
    }
/**
 * Imprime los hoteles de una determinada lista de hoteles
 * @param hoteles 
 */
    public void mostrarHoteles(ArrayList<Hotel> hoteles){
        int num=0;
        try{
        for (Hotel hotel :hoteles){
            if(hotel==null){
                System.out.println("No hay informacion para presentar ");
            }
            else{
                num++;
                System.out.println(num+". "+hotel.getNombre());
            }    
        }
        }catch(NullPointerException n){
            System.out.println(n);
        }
    }
    public static void mostrarHabitaciones(Hotel hotel,ArrayList<Habitacion> habitaciones){
        String idHotel= hotel.getIdHotel();
        habitaciones.forEach((h) -> {
            String hotelHab=h.getIdHotel();
            if (idHotel.equals(hotelHab)) {
                System.out.println(h);
            }
        });
    
    }
    
}