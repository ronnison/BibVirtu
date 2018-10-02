/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ronnison
 */
public class ConnectionFactory {
    
    private Connection con;
    
    public Connection getConnection () {
        try {
//            con = DriverManager.getConnection("jdbc:sqlite:/home/ronnison/NetBeansProjects/BibVirtu/src/bibvirtubd", "ronnison", "12345");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bibvirtubd", "ronnison", "mysqlp4ssw0rd");                                
            System.out.println("Conectou");
//            con.close();
        } catch (Exception e) {
            new RuntimeException("Não conectou.");
        }
        
        return con;
    }
    
}
