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
public class ManagerCliente {
        private Cliente cl;
        
    public ManagerCliente(){
        this.cl = null;
    }
    public void CrearCiente (String nom,String ape, int doc, String dom,String proce){
        this.cl = new Cliente(nom,ape,doc,dom,proce);
        //mandarlo a la base de datos 
        this.cl = null;
        }
    public void ModificarCliente(String nom,String ape, int doc, String dom,String proce){
        //this.cl = retorno del cliente con ese nombre y apellido de la base de datos
        //modificar lo que se le cante el culo al usuario
        //devolverlo a la base de datos
    }
    public Cliente ObtenerCliente(String nom,String ape){
            
        //this.cl = la consulta de la base de datos con ese nombre
        return cl;
    }
}
