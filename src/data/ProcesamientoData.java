/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import principal.*;

/**
 *
 * @author Cloja
 */
public class ProcesamientoData {
    /**
     * Metodo encrgado de leer archivos
     * @param direccion
     * @return Retorna una lista con las lineas de cada archivo que se le envia
     */
    public static ArrayList<String> lecturaArchivo(String direccion) {
        ArrayList<String> listaElementos= new ArrayList ();
        File archivo = new File(direccion);
        try{
        BufferedReader entrada = new BufferedReader(new FileReader(archivo));
        String lectura;
        lectura= entrada.readLine();
        while(lectura!=null){
            lectura=entrada.readLine();
            listaElementos.add(lectura);
        }
        entrada.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return listaElementos;
    }
    
    /**
     * Metodo que crea la lista de catalogos del archivo catalogos
     * @param lista
     * @return  Retorna lista de catalogos
     */
    public static  ArrayList<Catalogo> crearListaCatalogos(ArrayList<String> lista ){
        ArrayList<Catalogo> listaObjeto=new ArrayList();
        try{
            for (String catalogo:lista){
                String[] cata= catalogo.split("\\|");
                listaObjeto.add(new Catalogo(cata[0],cata[1]));
        }
        }catch(NullPointerException  ex){
        
        }
        return listaObjeto;
    }
    
    /**
     * Metodo que crea la lista de ciudades del archivo ciudades
     * @param lista
     * @return  Retorna lista de ciudades
     */
    public static ArrayList<Ciudad> crearListaCiudades(ArrayList<String> lista ){
        ArrayList<Ciudad> listaObjeto=new ArrayList();
        try{
               for (String ciudad:lista){
                   String[] ciu=ciudad.split("\\|");
                   listaObjeto.add(new Ciudad(ciu[0],ciu[1],ciu[2]));
               }
        }catch(NullPointerException  ex){
        }
               return listaObjeto;
    }

    /**
     * Metodo que crea la lista de habitaciones del archivo habitaciones
     * @param lista
     * @return  Retorna lista de habitaciones
     */
    public static ArrayList<Habitacion> crearListaHabitaciones(ArrayList<String> lista ){
        ArrayList<Habitacion> listaObjeto=new ArrayList();        
        try{
            for (String habitacion:lista){
                String[] hab=habitacion.split("\\|");
                listaObjeto.add(new Habitacion(hab[0],hab[1],hab[2],Double.parseDouble(hab[3]),Double.parseDouble(hab[4]),Double.parseDouble(hab[5])));
            }
        }catch (NullPointerException  ex){}
            return listaObjeto;
    }

    /**
     * Metodo que crea la lista de hoteles del archivo hoteles
     * @param lista
     * @return  Retorna lista de Hoteles
     */
    public static ArrayList<Hotel> crearListaHoteles(ArrayList<String> lista ){
        ArrayList<Hotel> listaObjeto=new ArrayList();
        try{
            for (String hotel:lista){
                String[] ho=hotel.split("\\|");
                listaObjeto.add(new Hotel(ho[0],ho[1],ho[2],ho[3],ho[4],ho[5],ho[6],ho[7],ho[8],ho[9],ho[10],ho[11]));
            }
        }catch(NullPointerException  ex){}
        return listaObjeto;

    }

    /**
     * Metodo que crea la lista de provincias del archivo provincias
     * @param lista
     * @return  Retorna lista de provincias
     */
    public static ArrayList<Provincia> crearListaProvincias(ArrayList<String> lista ){
        ArrayList<Provincia> listaObjeto=new ArrayList();
        try{
        for (String provincia:lista){
            String[] prov=provincia.split("\\|");
            listaObjeto.add(new Provincia(prov[0],prov[1],prov[2],prov[3],prov[4]));
        }
        }catch(NullPointerException  ex){}
                return listaObjeto;
    }
    /**
     * Metodo que crea la lista de servicios del archivo servicios
     * @param lista
     * @return Retorna lista de servicios
     */
    
    public static ArrayList<Servicio> crearListaServicios(ArrayList<String> lista ){
        ArrayList<Servicio> listaObjeto=new ArrayList();
        try{
        for (String servicio:lista){
            String[] ser=servicio.split("\\|");
            listaObjeto.add(new Servicio(ser[0],ser[1],ser[2],Boolean.parseBoolean(ser[3])));
        }
        }catch (NullPointerException  ex){}
        return listaObjeto;
    }
    /**
     * Metodo encargado de crear el archivo de clientes y ademas agregarlos
     * @param cliente
     * @throws IOException 
     */
    
    public static void escribirArchivoClientesRegistrados(Cliente cliente) throws IOException{
        String ruta = "src/Archivos/clientes.csv";
        File archivo = new File(ruta);
        BufferedWriter bw;
        
        String cadena=cliente.getIdentificacion()+"|"+cliente.getCiudadResi()+"|"+cliente.getNombre()+"|"+cliente.getEmail()+"|"+cliente.getNumerosContacto()+"|"+cliente.getNumeroTarjeta();
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo,true));
            bw.write(cadena+"\n");
        } else {
            bw = new BufferedWriter(new FileWriter(archivo,true));
            bw.write("identificacion|ciudadResi|nombre|email|celular|numeroTarjeta\n");
            bw.write(cadena+"\n");
        }
        bw.close();
    }
    /**
     * Metodo encargado de crear la lista clientes del archivo de clientes
     * @param lista
     * @return retorna lista de clientes
     */
    
    public static ArrayList<Cliente> crearListaClientes(ArrayList<String> lista ){
        ArrayList<Cliente> listaObjeto=new ArrayList();
        try{
        for (String cliente:lista){
            String[] cl=cliente.split("\\|");
            listaObjeto.add(new Cliente(cl[0], cl[1],cl[2], cl[3], cl[4], cl[5]));
        }
        }catch (NullPointerException  ex){}
        return listaObjeto;
    }
}
