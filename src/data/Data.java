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
    public static ArrayList<String> archivoHabitaciones=ProcesamientoData.lecturaArchivo("src/Archivos/habitaciones.csv");
    public static ArrayList<String> archivoCiudades=ProcesamientoData.lecturaArchivo("src/Archivos/ciudades.csv");
    public static ArrayList<String> archivoCatalogo=ProcesamientoData.lecturaArchivo("src/Archivos/catalogo.csv");
    public static ArrayList<String> archivoHoteles=ProcesamientoData.lecturaArchivo("src/Archivos/hoteles1.csv");
    public static ArrayList<String> archivoProvincias=ProcesamientoData.lecturaArchivo("src/Archivos/provincias.csv");
    public static ArrayList<String> archivoServicios=ProcesamientoData.lecturaArchivo("src/Archivos/servicios.csv");

    public static ArrayList<Provincia> provincias=ProcesamientoData.crearListaProvincias(Data.archivoProvincias);
    public static ArrayList<Ciudad> ciudades=ProcesamientoData.crearListaCiudades(Data.archivoCiudades);
    public static ArrayList<Hotel> hoteles=ProcesamientoData.crearListaHoteles(Data.archivoHoteles);
    public static ArrayList<Habitacion> habitaciones=ProcesamientoData.crearListaHabitaciones(Data.archivoHabitaciones);
    public static ArrayList<Catalogo> catalogos=ProcesamientoData.crearListaCatalogos(Data.archivoCatalogo);
    public static ArrayList<Servicio> servicios=ProcesamientoData.crearListaServicios(Data.archivoServicios);
}
