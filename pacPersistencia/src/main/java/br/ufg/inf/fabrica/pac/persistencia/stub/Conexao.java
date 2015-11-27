package br.ufg.inf.fabrica.pac.persistencia.stub;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Danillo
 */
public class Conexao {

    public Connection getConnection() throws SQLException{
        String dbUrl = "jdbc:derby://localhost:1527/pac2015";
        String user  = "pac";
        String senha = "pac";
        
        return DriverManager.getConnection(dbUrl, user, senha);
    }
    
    public static void main(String[] args) throws SQLException {
        Conexao c = new Conexao();
        Connection con = c.getConnection();
        System.out.println(con);
    }
}