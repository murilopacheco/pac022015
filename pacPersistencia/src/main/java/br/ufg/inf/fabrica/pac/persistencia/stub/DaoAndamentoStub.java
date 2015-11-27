package br.ufg.inf.fabrica.pac.persistencia.stub;

import br.ufg.inf.fabrica.pac.negocio.dominio.Andamento;
import br.ufg.inf.fabrica.pac.negocio.dominio.Pacote;
import br.ufg.inf.fabrica.pac.persistencia.IDaoAndamento;
import java.util.List;

/**
 *
 * @author Danillo
 */
public class DaoAndamentoStub implements IDaoAndamento{

    @Override
    public Andamento salvar(Andamento andamento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Andamento> andamentosPorPacote(Pacote pacote) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
