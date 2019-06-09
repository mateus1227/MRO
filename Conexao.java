package mro.informática;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexao {
    public Connection conexao;
    public Statement sentenca;
    
    
    public Conexao(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastros", "root", "energetic");
            sentenca = conexao.createStatement();
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver não encontrado!");
        } catch (SQLException ex) {
            System.out.println("Erro de conexão com banco de dados!");
        }
        
    }
    
   
   }

