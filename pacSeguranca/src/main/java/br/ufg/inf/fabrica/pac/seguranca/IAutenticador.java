package br.ufg.inf.fabrica.pac.seguranca;


/**
 *
 * @author danilloguimaraes
 */
public interface IAutenticador {

    /**
     * Responsável por realizar a autenticação do usuário
     * @param usuario
     * @param senha
     */
    public void autenticar(String usuario, String senha);
}
