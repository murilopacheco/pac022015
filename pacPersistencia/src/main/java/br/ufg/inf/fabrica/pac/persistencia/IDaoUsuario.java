package br.ufg.inf.fabrica.pac.persistencia;

import br.ufg.inf.fabrica.pac.negocio.dominio.Usuario;

/**
 *
 * @author Danillo
 */
public interface IDaoUsuario extends IDao{
    
    public Usuario buscar(Usuario usuario);
    
    public Usuario salvar(Usuario usuario);
}
