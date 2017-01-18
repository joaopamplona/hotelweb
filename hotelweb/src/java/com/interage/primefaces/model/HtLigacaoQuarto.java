/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interage.primefaces.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "HT_LIGACAO_QUARTO")
@NamedQueries({
    @NamedQuery(name = "HtLigacaoQuarto.findAll", query = "SELECT h FROM HtLigacaoQuarto h")})
public class HtLigacaoQuarto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_QUARTO")
    private Integer codQuarto;
    @Column(name = "NUMERO")
    private String numero;
    @Column(name = "TEMPO")
    private String tempo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private Double valor;

    public HtLigacaoQuarto() {
    }

    public HtLigacaoQuarto(Integer codQuarto) {
        this.codQuarto = codQuarto;
    }

    public Integer getCodQuarto() {
        return codQuarto;
    }

    public void setCodQuarto(Integer codQuarto) {
        this.codQuarto = codQuarto;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codQuarto != null ? codQuarto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HtLigacaoQuarto)) {
            return false;
        }
        HtLigacaoQuarto other = (HtLigacaoQuarto) object;
        if ((this.codQuarto == null && other.codQuarto != null) || (this.codQuarto != null && !this.codQuarto.equals(other.codQuarto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.integare.bincontrole.HtLigacaoQuarto[ codQuarto=" + codQuarto + " ]";
    }
    
}
