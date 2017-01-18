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
public class HtAdiantamentoClientePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "NR_RESERVA")
    private int nrReserva;
    @Basic(optional = false)
    @Column(name = "NRITEM")
    private int nritem;

    public HtAdiantamentoClientePK() {
    }

    public HtAdiantamentoClientePK(int nrReserva, int nritem) {
        this.nrReserva = nrReserva;
        this.nritem = nritem;
    }

    public int getNrReserva() {
        return nrReserva;
    }

    public void setNrReserva(int nrReserva) {
        this.nrReserva = nrReserva;
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
        hash += (int) nrReserva;
        hash += (int) nritem;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HtAdiantamentoClientePK)) {
            return false;
        }
        HtAdiantamentoClientePK other = (HtAdiantamentoClientePK) object;
        if (this.nrReserva != other.nrReserva) {
            return false;
        }
        if (this.nritem != other.nritem) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.integare.bincontrole.HtAdiantamentoClientePK[ nrReserva=" + nrReserva + ", nritem=" + nritem + " ]";
    }
    
}
