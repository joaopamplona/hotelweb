/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interage.primefaces.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author PC
 */
@Embeddable
public class HtPrecoHoraPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "COD_TIPO_QUARTO")
    private int codTipoQuarto;
    @Basic(optional = false)
    @Column(name = "QTD_HORAS")
    private int qtdHoras;

    public HtPrecoHoraPK() {
    }

    public HtPrecoHoraPK(int codTipoQuarto, int qtdHoras) {
        this.codTipoQuarto = codTipoQuarto;
        this.qtdHoras = qtdHoras;
    }

    public int getCodTipoQuarto() {
        return codTipoQuarto;
    }

    public void setCodTipoQuarto(int codTipoQuarto) {
        this.codTipoQuarto = codTipoQuarto;
    }

    public int getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(int qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codTipoQuarto;
        hash += (int) qtdHoras;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HtPrecoHoraPK)) {
            return false;
        }
        HtPrecoHoraPK other = (HtPrecoHoraPK) object;
        if (this.codTipoQuarto != other.codTipoQuarto) {
            return false;
        }
        if (this.qtdHoras != other.qtdHoras) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.integare.bincontrole.HtPrecoHoraPK[ codTipoQuarto=" + codTipoQuarto + ", qtdHoras=" + qtdHoras + " ]";
    }
    
}
