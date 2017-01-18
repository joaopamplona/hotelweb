/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interage.primefaces.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "HT_PRECO_HORA")
@NamedQueries({
    @NamedQuery(name = "HtPrecoHora.findAll", query = "SELECT h FROM HtPrecoHora h")})
public class HtPrecoHora implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HtPrecoHoraPK htPrecoHoraPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_HORA")
    private Double vlHora;
    @Column(name = "RGCODUSU")
    private Integer rgcodusu;
    @Column(name = "RGUSUARIO")
    private String rgusuario;
    @Column(name = "RGDATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rgdata;
    @Column(name = "RGEVENTO")
    private String rgevento;
    @JoinColumn(name = "COD_TIPO_QUARTO", referencedColumnName = "COD_TIPO_QUARTO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private HtTipoQuarto htTipoQuarto;

    public HtPrecoHora() {
    }

    public HtPrecoHora(HtPrecoHoraPK htPrecoHoraPK) {
        this.htPrecoHoraPK = htPrecoHoraPK;
    }

    public HtPrecoHora(int codTipoQuarto, int qtdHoras) {
        this.htPrecoHoraPK = new HtPrecoHoraPK(codTipoQuarto, qtdHoras);
    }

    public HtPrecoHoraPK getHtPrecoHoraPK() {
        return htPrecoHoraPK;
    }

    public void setHtPrecoHoraPK(HtPrecoHoraPK htPrecoHoraPK) {
        this.htPrecoHoraPK = htPrecoHoraPK;
    }

    public Double getVlHora() {
        return vlHora;
    }

    public void setVlHora(Double vlHora) {
        this.vlHora = vlHora;
    }

    public Integer getRgcodusu() {
        return rgcodusu;
    }

    public void setRgcodusu(Integer rgcodusu) {
        this.rgcodusu = rgcodusu;
    }

    public String getRgusuario() {
        return rgusuario;
    }

    public void setRgusuario(String rgusuario) {
        this.rgusuario = rgusuario;
    }

    public Date getRgdata() {
        return rgdata;
    }

    public void setRgdata(Date rgdata) {
        this.rgdata = rgdata;
    }

    public String getRgevento() {
        return rgevento;
    }

    public void setRgevento(String rgevento) {
        this.rgevento = rgevento;
    }

    public HtTipoQuarto getHtTipoQuarto() {
        return htTipoQuarto;
    }

    public void setHtTipoQuarto(HtTipoQuarto htTipoQuarto) {
        this.htTipoQuarto = htTipoQuarto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (htPrecoHoraPK != null ? htPrecoHoraPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HtPrecoHora)) {
            return false;
        }
        HtPrecoHora other = (HtPrecoHora) object;
        if ((this.htPrecoHoraPK == null && other.htPrecoHoraPK != null) || (this.htPrecoHoraPK != null && !this.htPrecoHoraPK.equals(other.htPrecoHoraPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.integare.bincontrole.HtPrecoHora[ htPrecoHoraPK=" + htPrecoHoraPK + " ]";
    }
    
}
