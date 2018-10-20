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
public class Usuario {
    private String nombre;
    private String pass;
    private int cat;
    
    public Usuario(String nom, String pass,int cat){
        this.nombre = nom;
        this.pass = pass;
        this.cat = cat;
        
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
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @return the cat
     */
    public int getCat() {
        return cat;
    }

    /**
     * @param cat the cat to set
     */
    public void setCat(int cat) {
        this.cat = cat;
    }
}
