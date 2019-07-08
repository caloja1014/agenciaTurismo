/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;

/**
 *
 * @author Cloja
 */
public class Habitacion {
    private String idHabitacion;
    private String idHotel;
    private String nombre;
    private double tarifaSencilla;
    private double tarifaDoble;
    private double tarifaTriple;

    public Habitacion(String idHabitacion, String idHotel, String nombre, double tarifaSencilla, double tarifaDoble, double tarifaTriple) {
        this.idHabitacion = idHabitacion;
        this.idHotel = idHotel;
        this.nombre = nombre;
        this.tarifaSencilla = tarifaSencilla;
        this.tarifaDoble = tarifaDoble;
        this.tarifaTriple = tarifaTriple;
    }

    /**
     * @return the idHabitacion
     */
    public String getIdHabitacion() {
        return idHabitacion;
    }

    /**
     * @return the idHotel
     */
    public String getIdHotel() {
        return idHotel;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the tarifaSencilla
     */
    public double getTarifaSencilla() {
        return tarifaSencilla;
    }

    /**
     * @return the tarifaDoble
     */
    public double getTarifaDoble() {
        return tarifaDoble;
    }

    /**
     * @return the tarifaTriple
     */
    public double getTarifaTriple() {
        return tarifaTriple;
    }
    
    public String toString() {
        ArrayList<Boolean> tarifasHotel=new ArrayList<>();
        String cadena="";
        tarifasHotel.add(this.tarifaSencilla>0.0);tarifasHotel.add(this.tarifaDoble>0.0);tarifasHotel.add(this.tarifaTriple>0.0);
        ArrayList<String> tarifas= new ArrayList<>();
        tarifas.add("Tarifa sencilla: "+"$"+this.tarifaSencilla+"c/noche, ");tarifas.add("Tarifa Doble: "+"$"+this.tarifaDoble+"c/noche, " );tarifas.add("Tarifa Triple: "+"$"+this.tarifaTriple+"c/noche ");
        for (Boolean b :tarifasHotel){
            int indice=0;
            if (b){
                cadena+=tarifas.get(indice);
            }
            indice++;
        }
        return cadena;
    }
    
}
