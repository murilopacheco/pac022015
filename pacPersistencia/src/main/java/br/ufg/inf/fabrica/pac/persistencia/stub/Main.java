package br.ufg.inf.fabrica.pac.persistencia.stub;

import br.ufg.inf.fabrica.pac.negocio.dominio.Estado;
import br.ufg.inf.fabrica.pac.persistencia.IDao;
import br.ufg.inf.fabrica.pac.persistencia.IDaoEstado;
import br.ufg.inf.fabrica.pac.persistencia.imp.DaoEstado;
import java.sql.SQLException;

/**
 *
 * @author Danillo
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        Estado estado = new Estado();
        estado.setNome("Novo");
        estado.setDescricao("Pacote criado");
        estado.setEstadoFinal(false);
        
        IDaoEstado daoEstado = new DaoEstado();
        estado = daoEstado.salvar(estado);
    }
}
