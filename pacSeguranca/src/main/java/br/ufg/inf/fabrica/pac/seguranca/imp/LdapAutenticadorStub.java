package br.ufg.inf.fabrica.pac.seguranca.imp;

import br.ufg.inf.fabrica.pac.negocio.dominio.Usuario;
import br.ufg.inf.fabrica.pac.seguranca.ILdapAutenticador;

/**
 *
 * @author Danillo
 */
public class LdapAutenticadorStub implements ILdapAutenticador{

    @Override
    public Usuario autenticar(Usuario usuario) {
        if(usuario.getLogin().equals("membro") &&
                usuario.getSenha().equals("senha")){
            usuario.setNome("Membro de projeto");
            usuario.setIdProjeto(1);
            return usuario;
        }
        return null;
    }
    
}
