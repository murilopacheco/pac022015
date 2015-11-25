package br.ufg.inf.fabrica.pac.seguranca;

import br.ufg.inf.fabrica.negocio.dominio.Usuario;

/**
 *
 * @author danilloguimaraes
 */
public interface IAutenticador {

    /**
     * Responsável por realizar a autenticação do usuário
     * @param usuario
     */
    public void autenticar(Usuario usuario);
}
