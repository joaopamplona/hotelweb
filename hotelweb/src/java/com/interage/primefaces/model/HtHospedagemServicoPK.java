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
public class HtHospedagemServicoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "COD_HOSPEDAGEM")
    private int codHospedagem;
    @Basic(optional = false)
    @Column(name = "NRITEM")
    private int nritem;

    public HtHospedagemServicoPK() {
    }

    public HtHospedagemServicoPK(int codHospedagem, int nritem) {
        this.codHospedagem = codHospedagem;
        this.nritem = nritem;
    }

    public int getCodHospedagem() {
        return codHospedagem;
    }

    public void setCodHospedagem(int codHospedagem) {
        this.codHospedagem = codHospedagem;
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
        hash += (int) codHospedagem;
        hash += (int) nritem;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HtHospedagemServicoPK)) {
            return false;
        }
        HtHospedagemServicoPK other = (HtHospedagemServicoPK) object;
        if (this.codHospedagem != other.codHospedagem) {
            return false;
        }
        if (this.nritem != other.nritem) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.integare.bincontrole.HtHospedagemServicoPK[ codHospedagem=" + codHospedagem + ", nritem=" + nritem + " ]";
    }
    
}
