/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelisii;

import java.util.LinkedList;

/**
 *
 * @author Hiplce
 */
public class ManagerHabitacion {
    private Habitacion hb;
    private LinkedList<Habitacion> hd = new LinkedList<>();
    
    public ManagerHabitacion(){
    
    }
    
   public void ModificarEstadoHabitacion(int num,int est){
       //this.hb =retorno de base de datos habitacion con este numero
       this.hb.setEstado(est);
       
   }
   public LinkedList<Habitacion> getHabitacionesDisponibles(){
       //obtener lista de disponibles de base de datos
       return hd;
   }
}
