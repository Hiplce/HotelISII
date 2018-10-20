/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelisii;

import java.util.Date;

/**
 *
 * @author Hiplce
 */
public class ManagerReserva {
    
    private Reserva re;
    public void GenerarReserva(Date fi,Date fo,int num){
        this.re = new Reserva(fi,fo,num);
        //lo mete en la base de datos
    }
}
