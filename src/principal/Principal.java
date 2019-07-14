/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import java.text.ParseException;
import java.util.ArrayList;
import data.ProcesamientoData;
import java.io.IOException;
/**
 *
 * @author Cloja
 */
public class Principal {
/**
 * Metodo en donde se llama al programa
 * @param args
 * @throws ParseException 
 */
    public static void main(String[] args) throws ParseException, IOException{
        ProcesamientoData.escribirArchivoClientesRegistrados(new Cliente("0951690148","Guayaquil","Carlos Andres Loja Guevara","clojaguevara1@hotmail.com","0969648359","0"));
        Agencia agen=new Agencia();
    }
}    