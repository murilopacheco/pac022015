package br.ufg.inf.fabrica.pac.persistencia;

import br.ufg.inf.fabrica.pac.negocio.dominio.Andamento;
import br.ufg.inf.fabrica.pac.negocio.dominio.Pacote;
import java.util.List;

/**
 *
 * @author Danillo
 */
public interface IDaoAndamento extends IDao<Andamento>{
    
    /**
     * Retorna lista de andamentos de um respectivo pacote. Se o pacote não for 
     * encontrado, ele retorna uma lista vazia
     * @param pacote
     * @return 
     */
    public List<Andamento> andamentosPorPacote(Pacote pacote);
            
}
