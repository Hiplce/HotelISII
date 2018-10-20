/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelisii;

import java.awt.List;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author Hiplce
 */
public class Reserva {
    private Date fechaIn;
    private Date fechaOut;
    private int formaPago;
    private float bono;
    private LinkedList<Extra> extras =  new LinkedList<>();
    private Date checkIn;
    private Date chackOut;
    private float precio;
    private int numh;
    

    public Reserva(Date fi, Date fo, int num) {
         this.fechaIn = fi;
         this.fechaOut = fo;
         this.numh = num;
         
    }

    /**
     * @return the fechaIn
     */
    public Date getFechaIn() {
        return fechaIn;
    }

    /**
     * @param fechaIn the fechaIn to set
     */
    public void setFechaIn(Date fechaIn) {
        this.fechaIn = fechaIn;
    }

    /**
     * @return the fechaOut
     */
    public Date getFechaOut() {
        return fechaOut;
    }

    /**
     * @param fechaOut the fechaOut to set
     */
    public void setFechaOut(Date fechaOut) {
        this.fechaOut = fechaOut;
    }

    /**
     * @return the formaPago
     */
    public int getFormaPago() {
        return formaPago;
    }

    /**
     * @param formaPago the formaPago to set
     */
    public void setFormaPago(int formaPago) {
        this.formaPago = formaPago;
    }

    /**
     * @return the bono
     */
    public float getBono() {
        return bono;
    }

    /**
     * @param bono the bono to set
     */
    public void setBono(float bono) {
        this.bono = bono;
    }

    /**
     * @return the extras
     */
    public LinkedList<Extra> getExtras() {
        return extras;
    }

    /**
     * @param extras the extras to set
     */
    public void setExtras(LinkedList<Extra> extras) {
        this.extras = extras;
    }

    /**
     * @return the checkIn
     */
    public Date getCheckIn() {
        return checkIn;
    }

    /**
     * @param checkIn the checkIn to set
     */
    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    /**
     * @return the chackOut
     */
    public Date getChackOut() {
        return chackOut;
    }

    /**
     * @param chackOut the chackOut to set
     */
    public void setChackOut(Date chackOut) {
        this.chackOut = chackOut;
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
     * @return the numh
     */
    public int getNumh() {
        return numh;
    }

    /**
     * @param numh the numh to set
     */
    public void setNumh(int numh) {
        this.numh = numh;
    }
    
}
