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

    private ArrayList<Provincia> provincia=ProcesamientoData.crearListaProvincias(Data.archivoProvincias);
    private ArrayList<Ciudad> ciudades=ProcesamientoData.crearListaCiudades(Data.archivoCiudades);
    private ArrayList<Hotel> hoteles=ProcesamientoData.crearListaHoteles(Data.archivoHoteles);
    private ArrayList<Habitacion> habitaciones=ProcesamientoData.crearListaHabitaciones(Data.archivoHabitaciones);
    private ArrayList<Catalogo> catalogos=ProcesamientoData.crearListaCatalogos(Data.archivoCatalogo);
    private ArrayList<Servicio> servicios=ProcesamientoData.crearListaServicios(Data.archivoServicios);
    
    private ArrayList<Reserva> reservas;
    private ArrayList<Cliente> clientes;

}