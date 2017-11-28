/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;
import java.sql.*;

public class ProbarConexion {

    
    public static void main(String[] args) {
        Connection con=null; //se declara con un valor de defecto "!null"
        try{
      con= Conexion.conectarse("root", "");
            System.out.println("te conectaste");
            //aqui vienen queries de MYSQL
            
        }catch(ClassNotFoundException e){
            System.out.println("No se cargo bien el driver");
            
        }catch(SQLException e){
            System.out.println("Un error de sql"+e.getMessage());
        }finally{
            try {
                if(con!=null)con.close();
          
                System.out.println("ya se cerro todo");
            } catch (SQLException ex) {
               
            }
        }
            
        
    }
}
