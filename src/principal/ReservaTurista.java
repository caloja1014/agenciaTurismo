/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Freddy
 */
public class ReservaTurista extends Reserva{
    private Habitacion habitacion;

    public ReservaTurista(Habitacion habitacion, String fechaCheckIn, String fechaCheckOut, Hotel hotel, Cliente cliente) {
        super(fechaCheckIn, fechaCheckOut, hotel, cliente);
        this.habitacion = habitacion;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
}
