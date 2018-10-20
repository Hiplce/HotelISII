/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelisii;

/**
 *
 * @author Hiplce
 */
public class Habitacion {
    private int estado;
    private Tipo tipo;
    private boolean matrimonial;
    private float precio;
    private int numHabitacion;
    public Habitacion(int est, Tipo tip,boolean mat,float preci, int num){
     this.estado = est;
     this.tipo = tip;
     this.matrimonial = mat;
     this.precio = preci;
     this.numHabitacion = num;
    }

    /**
     * @return the estado
     */
    public int getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }

    /**
     * @return the matrimonial
     */
    public boolean isMatrimonial() {
        return matrimonial;
    }

    /**
     * @param matrimonial the matrimonial to set
     */
    public void setMatrimonial(boolean matrimonial) {
        this.matrimonial = matrimonial;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @return the numHabitacion
     */
    public int getNumHabitacion() {
        return numHabitacion;
    }

    /**
     * @param numHabitacion the numHabitacion to set
     */
    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    /**
     * @return the tipo
     */
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
            
            
    
}
