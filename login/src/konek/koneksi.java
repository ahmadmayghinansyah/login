/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konek;

/**
 *
 * @author User
 */
import java.sql.Connection;
import java.sql.DriverManager;


public class koneksi {
    private static Connection koneksi;
    
    public static Connection getKoneksi(){
        if (koneksi == null){
            try{
                String url ="jdbc:mysql://localhost/login";
                String user="root";
                String pass="";
                koneksi = DriverManager.getConnection(url, user, pass);             
                System.out.println("Koneksi berhasil;");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        return koneksi;
    }
    
    public static void main(String args[]){
        getKoneksi();
    }

}
