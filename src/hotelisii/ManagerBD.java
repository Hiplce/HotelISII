/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelisii;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Hiplce
 */
public class ManagerBD {
    Statement consulta;
    private static String ruta;
    private static Connection connect = null;
    

    public static Connection connect(){
        if(connect == null){
        try {
            ruta = "C:\\Users\\Hiplce\\Documents\\NetBeansProjects\\HotelISII\\datos\\hotel.db";
            connect = DriverManager.getConnection("jdbc:sqlite:"+ruta);
            if (connect!=null) {
                System.out.println("Conectado");
            }
        }catch (SQLException ex) {
            System.err.println("No se ha podido conectar a la base de datos\n"+ex.getMessage());
        }
       }
        return connect;
    }
        public void close(){
               try {
                   connect.close();
               } catch (SQLException ex) {
                   Logger.getLogger(ManagerBD.class.getName()).log(Level.SEVERE, null, ex);
               }
        }
}
