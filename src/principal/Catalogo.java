/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author gabrielapazmino
 */
public class Catalogo {
    private String idServicio;
    private String nombre;
    
    /**
     * Se crea el constructor de la clase catalogo
     * @param idServicio
     * @param nombre 
     */
    public Catalogo(String idServicio, String nombre) {
        this.idServicio = idServicio;
        this.nombre = nombre;
    }
    
    //getters
    /**
     * se crea el getter del idSservicio que sera usado para una busqueda
     * @return 
     */
    public String getIdServicio() {
        return idServicio;
    }

    /**
     * se crea el getter del nombre que sera usado para una busqueda
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    
    //setters
    /**
     * Se crea el ideServicio por si la agencia efectua alguna modificacion en este atributo
     * @param idServicio
     */
    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    /**
     * Se crea el nombre por si la agencia efectua alguna modificacion en este atributo
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
