/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import principal.*;

/**
 *
 * @author Cloja
 */
public class ProcesamientoData {
    
    
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
}
