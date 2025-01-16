/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;
import java.sql.*;
/**
 *
 * @author Acer
 */
public class DBConnection implements DBConfig{
 static Connection con=null;
 
 public static Connection getConn(){
     try{
     Class.forName(Driver);
     con=DriverManager.getConnection(Conn,unm,pw);
     }
     catch(Exception ee){
     System.out.println(ee);
     }
     return con;
 }

  public static void main(String args[])
  {

    
    }
}
