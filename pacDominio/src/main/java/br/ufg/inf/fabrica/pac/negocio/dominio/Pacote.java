package br.ufg.inf.fabrica.pac.negocio.dominio;

/**
 * Foi definido que:
 * 1 - Toda entidade possui um único atributo identificador, ficando vetado a 
 *     identificação por composição de atributos.
 * 2 - Toda referência ao objeto associado deve ser realizada feita 
 *     identificando o atributo como: "id" + nome da entidade (capitular).
 * 3 - Todo objeto no módulo de negócios que não deve ser persistido, deve ser 
 *     comentado acima com a palavra "Transient"
 */

import java.util.Date;
import java.util.List;

/**
 *
 * @author danilloguimaraes
 */
public class Pacote {
    
    private String nome;
    private String descricao;
    private Date dataCriacao;
    private boolean abandonado;
    private String documento;
    private Date dataPrevistaRealizacao;
    private String idEstado;
    private String idUsuario;
    private String idProjeto;
    //transient
    private List<Long> andamentos;

    public String getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(String idEstado) {
        this.idEstado = idEstado;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(String idProjeto) {
        this.idProjeto = idProjeto;
    }

    public List<Long> getAndamentos() {
        return andamentos;
    }

    public void setAndamentos(List<Long> andamentos) {
        this.andamentos = andamentos;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public boolean isAbandonado() {
        return abandonado;
    }

    public void setAbandonado(boolean abandonado) {
        this.abandonado = abandonado;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Date getDataPrevistaRealizacao() {
        return dataPrevistaRealizacao;
    }

    public void setDataPrevistaRealizacao(Date dataPrevistaRealizacao) {
        this.dataPrevistaRealizacao = dataPrevistaRealizacao;
    }

}
