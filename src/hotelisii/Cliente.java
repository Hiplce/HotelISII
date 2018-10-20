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
public class Cliente {
    private String nombre;
    private String apellido;
    private int doc;
    private String domicilio;
    private String proce;

    public Cliente (String nom,String ape, int doc,String dom,String pro){
        this.nombre = nom;
        this.apellido = ape;
        this.doc = doc;
        this.domicilio = dom;
        this.proce = pro;
        
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the doc
     */
    public int getDoc() {
        return doc;
    }

    /**
     * @param doc the doc to set
     */
    public void setDoc(int doc) {
        this.doc = doc;
    }

    /**
     * @return the domicilio
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * @param domicilio the domicilio to set
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * @return the proce
     */
    public String getProce() {
        return proce;
    }

    /**
     * @param proce the proce to set
     */
    public void setProce(String proce) {
        this.proce = proce;
    }
    
}
