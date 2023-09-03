/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_coneccion;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos Torres Manuel
 */
public class cConexion {
    Connection conectar = null;
    
    String usuario= "postgres";
    String contrasenia="Marcos1";
    String bd= "Prueba1";
    String ip = "localhost";
    String puerto="5432";
    String cadena="jdbc:postgresql://"+ip+":"+puerto+"/"+bd;
    
    public Connection establecerConecxion(){
        
        try {
            Class.forName("org.postgresql.Driver");
            conectar= DriverManager.getConnection(cadena,usuario,contrasenia);
            JOptionPane.showMessageDialog(null, "Se conecto correctamente a la Base de Datos");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al conectar a la base de datos");
        }
        return conectar;
    }
         
    }
    

