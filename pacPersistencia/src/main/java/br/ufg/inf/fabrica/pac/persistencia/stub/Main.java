package br.ufg.inf.fabrica.pac.persistencia.stub;

import java.sql.SQLException;

/**
 *
 * @author Danillo
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        RepositorioStub.inicializaRepositorio(); 
    }
}
