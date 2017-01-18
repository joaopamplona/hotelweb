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
@Table(name = "HT_ADIANTAMENTO_CLIENTE")
@NamedQueries({
    @NamedQuery(name = "HtAdiantamentoCliente.findAll", query = "SELECT h FROM HtAdiantamentoCliente h")})
public class HtAdiantamentoCliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HtAdiantamentoClientePK htAdiantamentoClientePK;
    @Column(name = "COD_QUARTO")
    private String codQuarto;
    @Column(name = "DESC_QUARTO")
    private String descQuarto;
    @Column(name = "CODCLI")
    private String codcli;
    @Column(name = "NOMCLI")
    private String nomcli;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_ADIANTADO")
    private Double vlAdiantado;
    @Column(name = "QTD_DIARIA")
    private Integer qtdDiaria;
    @Column(name = "RGCODUSU")
    private Integer rgcodusu;
    @Column(name = "RGUSUARIO")
    private String rgusuario;
    @Column(name = "RGDATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rgdata;
    @Column(name = "RGEVENTO")
    private String rgevento;
    @Column(name = "ADIANT_RESERVA")
    private String adiantReserva;
    @JoinColumn(name = "NR_RESERVA", referencedColumnName = "COD_HOSPEDAGEM", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private HtDadosHospedagem htDadosHospedagem;

    public HtAdiantamentoCliente() {
    }

    public HtAdiantamentoCliente(HtAdiantamentoClientePK htAdiantamentoClientePK) {
        this.htAdiantamentoClientePK = htAdiantamentoClientePK;
    }

    public HtAdiantamentoCliente(int nrReserva, int nritem) {
        this.htAdiantamentoClientePK = new HtAdiantamentoClientePK(nrReserva, nritem);
    }

    public HtAdiantamentoClientePK getHtAdiantamentoClientePK() {
        return htAdiantamentoClientePK;
    }

    public void setHtAdiantamentoClientePK(HtAdiantamentoClientePK htAdiantamentoClientePK) {
        this.htAdiantamentoClientePK = htAdiantamentoClientePK;
    }

    public String getCodQuarto() {
        return codQuarto;
    }

    public void setCodQuarto(String codQuarto) {
        this.codQuarto = codQuarto;
    }

    public String getDescQuarto() {
        return descQuarto;
    }

    public void setDescQuarto(String descQuarto) {
        this.descQuarto = descQuarto;
    }

    public String getCodcli() {
        return codcli;
    }

    public void setCodcli(String codcli) {
        this.codcli = codcli;
    }

    public String getNomcli() {
        return nomcli;
    }

    public void setNomcli(String nomcli) {
        this.nomcli = nomcli;
    }

    public Double getVlAdiantado() {
        return vlAdiantado;
    }

    public void setVlAdiantado(Double vlAdiantado) {
        this.vlAdiantado = vlAdiantado;
    }

    public Integer getQtdDiaria() {
        return qtdDiaria;
    }

    public void setQtdDiaria(Integer qtdDiaria) {
        this.qtdDiaria = qtdDiaria;
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

    public String getAdiantReserva() {
        return adiantReserva;
    }

    public void setAdiantReserva(String adiantReserva) {
        this.adiantReserva = adiantReserva;
    }

    public HtDadosHospedagem getHtDadosHospedagem() {
        return htDadosHospedagem;
    }

    public void setHtDadosHospedagem(HtDadosHospedagem htDadosHospedagem) {
        this.htDadosHospedagem = htDadosHospedagem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (htAdiantamentoClientePK != null ? htAdiantamentoClientePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HtAdiantamentoCliente)) {
            return false;
        }
        HtAdiantamentoCliente other = (HtAdiantamentoCliente) object;
        if ((this.htAdiantamentoClientePK == null && other.htAdiantamentoClientePK != null) || (this.htAdiantamentoClientePK != null && !this.htAdiantamentoClientePK.equals(other.htAdiantamentoClientePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.integare.bincontrole.HtAdiantamentoCliente[ htAdiantamentoClientePK=" + htAdiantamentoClientePK + " ]";
    }
    
}
