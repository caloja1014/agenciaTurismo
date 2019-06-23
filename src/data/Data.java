/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import principal.Agencia;
import principal.Catalogo;
import principal.Ciudad;
import principal.Cliente;
import principal.Habitacion;
import principal.Hotel;
import principal.Provincia;
import principal.Reserva;
import principal.Servicio;

/**
 *
 * @author Cloja
 */
public class Data {
    public static ArrayList<String> archivoHabitaciones=ProcesamientoData.lecturaArchivo("C:\\Users\\Cloja\\Documents\\NetBeansProjects\\Proyecto\\src\\bdatos\\habitaciones.csv");
    public static ArrayList<String> archivoCiudades=ProcesamientoData.lecturaArchivo("C:\\Users\\Cloja\\Documents\\NetBeansProjects\\Proyecto\\src\\bdatos\\ciudades.csv");
    public static ArrayList<String> archivoCatalogo=ProcesamientoData.lecturaArchivo("C:\\Users\\Cloja\\Documents\\NetBeansProjects\\Proyecto\\src\\bdatos\\catalogo.csv");
    public static ArrayList<String> archivoHoteles=ProcesamientoData.lecturaArchivo("C:\\Users\\Cloja\\Documents\\NetBeansProjects\\Proyecto\\src\\bdatos\\hoteles1.csv");
    public static ArrayList<String> archivoProvincias=ProcesamientoData.lecturaArchivo("C:\\Users\\Cloja\\Documents\\NetBeansProjects\\Proyecto\\src\\bdatos\\provincias.csv");
    public static ArrayList<String> archivoServicios=ProcesamientoData.lecturaArchivo("C:\\Users\\Cloja\\Documents\\NetBeansProjects\\Proyecto\\src\\bdatos\\servicios.csv");

    static ArrayList<Provincia> provincias=ProcesamientoData.crearListaProvincias(Data.archivoProvincias);
    static ArrayList<Ciudad> ciudades=ProcesamientoData.crearListaCiudades(Data.archivoCiudades);
    static ArrayList<Hotel> hoteles=ProcesamientoData.crearListaHoteles(Data.archivoHoteles);
    static ArrayList<Habitacion> habitaciones=ProcesamientoData.crearListaHabitaciones(Data.archivoHabitaciones);
    static ArrayList<Catalogo> catalogos=ProcesamientoData.crearListaCatalogos(Data.archivoCatalogo);
    static ArrayList<Servicio> servicios=ProcesamientoData.crearListaServicios(Data.archivoServicios);
}
