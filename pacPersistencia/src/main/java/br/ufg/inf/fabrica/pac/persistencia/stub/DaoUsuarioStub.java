package br.ufg.inf.fabrica.pac.persistencia.stub;

import br.ufg.inf.fabrica.pac.negocio.dominio.Usuario;
import br.ufg.inf.fabrica.pac.persistencia.IDaoUsuario;

/**
 *
 * @author Danillo
 */
public class DaoUsuarioStub implements IDaoUsuario{

    @Override
    public Usuario buscar(Usuario usuario) {
        if(usuario.getLogin().equals("membro")){
            usuario.setAtivo(true);
            return usuario;
        }
        return null;
    }

    @Override
    
    public Usuario salvar(Usuario usuario) {
        usuario.setAtivo(true);
        return usuario;
    }

    
}
