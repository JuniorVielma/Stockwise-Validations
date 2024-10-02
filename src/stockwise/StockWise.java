/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stockwise;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jvielmav
 */
public class StockWise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String user = "root";
        String password = "Vielm@vides99";
        String url= "jdbc:mysql://localhost:3305/StockWise";
        
        Connection cnx;
        Statement st;
        ResultSet rs;
        
        try {
            cnx = DriverManager.getConnection(url,user,password);
            st = cnx.createStatement();
            rs = st.executeQuery("SELECT * FROM user"); 
          
           /* while(rs.next()){
                System.out.println(rs.getInt("idPersona")+ " " + rs.getString("Nombre") + " "+ rs.getString("Apellido")
                + " " + rs.getString("Email") + " " + rs.getString("TipoUser") + " " + rs.getString("Contraseña"));
            }
            
           st.executeUpdate("INSERT INTO persona VALUES(3,'Ana','Vides','anacontreras.70vides@gmail.com','super','7894')"); 
            rs = st.executeQuery("SELECT * FROM persona"); 
            while(rs.next()){
                System.out.println(rs.getInt("idPersona")+ " " + rs.getString("Nombre") + " "+ rs.getString("Apellido")
                + " " + rs.getString("Email") + " " + rs.getString("TipoUser") + " " + rs.getString("Contraseña"));
            }
            
           st.executeUpdate("UPDATE persona set Apellido = 'contreras' WHERE IdPersona = '3'");
            rs = st.executeQuery("SELECT * FROM persona"); 
             while(rs.next()){
                System.out.println(rs.getInt("idPersona")+ " " + rs.getString("Nombre") + " "+ rs.getString("Apellido")
                + " " + rs.getString("Email") + " " + rs.getString("TipoUser") + " " + rs.getString("Contraseña"));
            }*/
            
              st.executeUpdate("Delete from persona where idPersona=3");
            rs = st.executeQuery("SELECT * FROM persona"); 
             while(rs.next()){
                System.out.println(rs.getInt("idPersona")+ " " + rs.getString("Nombre") + " "+ rs.getString("Apellido")
                + " " + rs.getString("Email") + " " + rs.getString("TipoUser") + " " + rs.getString("Contraseña"));
            }
             
             System.out.println("\nThis is related to bills \n");
             
             rs = st.executeQuery("SELECT * FROM factura"); 
              while(rs.next()){
                System.out.println(rs.getInt("idFactura")+ " " + rs.getString("NameClientfact") + " " + 
                        rs.getString("Valor"));
            }
              ////////////////////////////////////////////////////////////////
              System.out.println("\n Entering a new bill \n");
              
              st.executeUpdate("INSERT INTO factura VALUES('7854','Marcela','75.454')");
              rs = st.executeQuery("SELECT * FROM factura"); 
              while(rs.next()){
                System.out.println(rs.getInt("idFactura")+ " " + rs.getString("NameClientfact") + " " + 
                        rs.getString("Valor"));
            }
              
              ///////////////////////////////////////////////////////////////////////////
               System.out.println("\n Updating a bill \n");
              
              st.executeUpdate("UPDATE factura SET Valor='7845.254' WHERE NameClientFact='Junior Vielma'");
              rs = st.executeQuery("SELECT * FROM factura"); 
              while(rs.next()){
                System.out.println(rs.getInt("idFactura")+ " " + rs.getString("NameClientfact") + " " + 
                        rs.getString("Valor"));
            }
              
                 ///////////////////////////////////////////////////////////////////////////
               System.out.println("\n Removing a bill \n");
              
              st.executeUpdate("Delete from factura where idfactura=7854");
              rs = st.executeQuery("SELECT * FROM factura"); 
              while(rs.next()){
                System.out.println(rs.getInt("idFactura")+ " " + rs.getString("NameClientfact") + " " + 
                        rs.getString("Valor"));
            }
              
             
        } catch (SQLException ex) {
            Logger.getLogger(StockWise.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            // TODO code application logic here
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StockWise.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
