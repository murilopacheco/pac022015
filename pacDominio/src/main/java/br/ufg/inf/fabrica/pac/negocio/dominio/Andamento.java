package br.ufg.inf.fabrica.pac.negocio.dominio;

import java.util.Date;

/**
 *
 * @author danilloguimaraes
 */
public class Andamento {
    private long id;
    private Date dataModificacao;
    private Date dataPrevistaConclusao;
    private String descricao;
    
    private long idPacote;
    private long idEstado;
    private long idUsuario;

    public long getIdPacote() {
        return idPacote;
    }

    public void setIdPacote(long idPacote) {
        this.idPacote = idPacote;
    }

    public long getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(long idEstado) {
        this.idEstado = idEstado;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getDataModificacao() {
        return dataModificacao;
    }

    public void setDataModificacao(Date dataModificacao) {
        this.dataModificacao = dataModificacao;
    }

    public Date getDataPrevistaConclusao() {
        return dataPrevistaConclusao;
    }

    public void setDataPrevistaConclusao(Date dataPrevistaConclusao) {
        this.dataPrevistaConclusao = dataPrevistaConclusao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void setId(long id){
        this.id = id;
    }
    
    public long getId(){
        return this.id;
    }
    
}
