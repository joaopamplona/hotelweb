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
public class HtHospedagemPessoasExtraPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "COD_RESERVA_EXTRA")
    private int codReservaExtra;
    @Basic(optional = false)
    @Column(name = "NRITEM")
    private int nritem;

    public HtHospedagemPessoasExtraPK() {
    }

    public HtHospedagemPessoasExtraPK(int codReservaExtra, int nritem) {
        this.codReservaExtra = codReservaExtra;
        this.nritem = nritem;
    }

    public int getCodReservaExtra() {
        return codReservaExtra;
    }

    public void setCodReservaExtra(int codReservaExtra) {
        this.codReservaExtra = codReservaExtra;
    }

    public int getNritem() {
        return nritem;
    }

    public void setNritem(int nritem) {
        this.nritem = nritem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codReservaExtra;
        hash += (int) nritem;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HtHospedagemPessoasExtraPK)) {
            return false;
        }
        HtHospedagemPessoasExtraPK other = (HtHospedagemPessoasExtraPK) object;
        if (this.codReservaExtra != other.codReservaExtra) {
            return false;
        }
        if (this.nritem != other.nritem) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.integare.bincontrole.HtHospedagemPessoasExtraPK[ codReservaExtra=" + codReservaExtra + ", nritem=" + nritem + " ]";
    }
    
}
