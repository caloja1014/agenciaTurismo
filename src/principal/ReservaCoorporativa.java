/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;

/**
 *
 * @author Freddy
 */
public class ReservaCoorporativa extends Reserva{
    private ArrayList<Habitacion> habitacionesEmpleados;
    private ArrayList<String> ocupantes;

    public ReservaCoorporativa(ArrayList<Habitacion> habitacionesEmpleados, ArrayList<String> ocupantes, String fechaCheckIn, String fechaCheckOut, Hotel hotel, Cliente cliente) {
        super(fechaCheckIn, fechaCheckOut, hotel, cliente);
        this.habitacionesEmpleados = habitacionesEmpleados;
        this.ocupantes = ocupantes;
    }
    
}
