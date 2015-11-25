package br.ufg.inf.fabrica.persistencia;

import br.ufg.inf.fabrica.negocio.dominio.Pacote;
import br.ufg.inf.fabrica.negocio.dominio.Usuario;
import java.util.Set;

/**
 *
 * @author danilloguimaraes
 */
public interface IDaoPacote {
    
    /**
     * Dado um colaborador, retornar os pacotes atribuídos ao mesmo.
     * Se colaborador é null, ou sem o nome, o método deve retornar uma 
     * Collection Set vazia.
     * 
     * @param colaborador
     * @return 
     */
    public Set<Pacote> pacotesAtribuidosAUsuario(Usuario colaborador);
    
    /**
     * Persiste o pacote informado.
     * Se o pacote for null, null deverá ser informado. Qualquer erro nas 
     * restrições do banco, as excessões serão passadas ao solicitante.
     * @param pacote
     * @return 
     */
    public Pacote salvar(Pacote pacote);
            
}
