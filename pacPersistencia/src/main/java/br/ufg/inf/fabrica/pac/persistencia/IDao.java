package br.ufg.inf.fabrica.pac.persistencia;

/**
 *
 * @author Danillo
 * @param <T>
 */
public interface IDao<T> {
    
    public T salvar(T entity);
    
    public T excluir(T entity);
    
    public T buscar(long id);
}
