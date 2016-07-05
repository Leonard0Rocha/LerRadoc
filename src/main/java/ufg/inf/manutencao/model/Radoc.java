/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.ufg.inf.manutencao.model;

import java.util.Date;

/**
 *
 * @author Leonardo
 */
public class Radoc {
    private Integer sequenciaAtividade;
    private String descricaoAtividade;
    private Float qtdeHorasAtividade;
    private Date dtInicioAtividade;
    private Date dtFimAtividade;

    /**
     * @return the sequenciaAtividade
     */
    public Integer getSequenciaAtividade() {
        return sequenciaAtividade;
    }

    /**
     * @param sequenciaAtividade the sequenciaAtividade to set
     */
    public void setSequenciaAtividade(Integer sequenciaAtividade) {
        this.sequenciaAtividade = sequenciaAtividade;
    }

    /**
     * @return the descricaoAtividade
     */
    public String getDescricaoAtividade() {
        return descricaoAtividade;
    }

    /**
     * @param descricaoAtividade the descricaoAtividade to set
     */
    public void setDescricaoAtividade(String descricaoAtividade) {
        this.descricaoAtividade = descricaoAtividade;
    }

    /**
     * @return the qtdeHorasAtividade
     */
    public Float getQtdeHorasAtividade() {
        return qtdeHorasAtividade;
    }

    /**
     * @param qtdeHorasAtividade the qtdeHorasAtividade to set
     */
    public void setQtdeHorasAtividade(Float qtdeHorasAtividade) {
        this.qtdeHorasAtividade = qtdeHorasAtividade;
    }

    /**
     * @return the dtInicioAtividade
     */
    public Date getDtInicioAtividade() {
        return dtInicioAtividade;
    }

    /**
     * @param dtInicioAtividade the dtInicioAtividade to set
     */
    public void setDtInicioAtividade(Date dtInicioAtividade) {
        this.dtInicioAtividade = dtInicioAtividade;
    }

    /**
     * @return the dtFimAtividade
     */
    public Date getDtFimAtividade() {
        return dtFimAtividade;
    }

    /**
     * @param dtFimAtividade the dtFimAtividade to set
     */
    public void setDtFimAtividade(Date dtFimAtividade) {
        this.dtFimAtividade = dtFimAtividade;
    }
}
