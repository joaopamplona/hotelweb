/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interage.primefaces.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
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
@Table(name = "HT_HOSPEDAGEM_SERVICO")
@NamedQueries({
    @NamedQuery(name = "HtHospedagemServico.findAll", query = "SELECT h FROM HtHospedagemServico h")})
public class HtHospedagemServico implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HtHospedagemServicoPK htHospedagemServicoPK;
    @Basic(optional = false)
    @Column(name = "COD_QUARTO")
    private int codQuarto;
    @Column(name = "CODPRO")
    private String codpro;
    @Column(name = "DESCPRO")
    private String descpro;
    @Column(name = "UNIDADE")
    private String unidade;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QTDVEND")
    private Double qtdvend;
    @Column(name = "VLUNIT")
    private Double vlunit;
    @Column(name = "VLCUSTO")
    private Double vlcusto;
    @Column(name = "VLTOTAL")
    private Double vltotal;
    @Column(name = "QTDUND")
    private Double qtdund;
    @Column(name = "VLUND")
    private Double vlund;
    @Column(name = "CODFAB")
    private Integer codfab;
    @Column(name = "CODVEN")
    private Integer codven;
    @Column(name = "CODGRU")
    private String codgru;
    @Column(name = "QTDEMB")
    private Double qtdemb;
    @Column(name = "UNUNIT")
    private String ununit;
    @Column(name = "UNEMB")
    private String unemb;
    @Column(name = "RGCODUSU")
    private Integer rgcodusu;
    @Column(name = "RGUSUARIO")
    private String rgusuario;
    @Column(name = "RGDATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rgdata;
    @Column(name = "RGEVENTO")
    private String rgevento;
    @JoinColumn(name = "COD_HOSPEDAGEM", referencedColumnName = "COD_HOSPEDAGEM", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private HtDadosHospedagem htDadosHospedagem;

    public HtHospedagemServico() {
    }

    public HtHospedagemServico(HtHospedagemServicoPK htHospedagemServicoPK) {
        this.htHospedagemServicoPK = htHospedagemServicoPK;
    }

    public HtHospedagemServico(HtHospedagemServicoPK htHospedagemServicoPK, int codQuarto) {
        this.htHospedagemServicoPK = htHospedagemServicoPK;
        this.codQuarto = codQuarto;
    }

    public HtHospedagemServico(int codHospedagem, int nritem) {
        this.htHospedagemServicoPK = new HtHospedagemServicoPK(codHospedagem, nritem);
    }

    public HtHospedagemServicoPK getHtHospedagemServicoPK() {
        return htHospedagemServicoPK;
    }

    public void setHtHospedagemServicoPK(HtHospedagemServicoPK htHospedagemServicoPK) {
        this.htHospedagemServicoPK = htHospedagemServicoPK;
    }

    public int getCodQuarto() {
        return codQuarto;
    }

    public void setCodQuarto(int codQuarto) {
        this.codQuarto = codQuarto;
    }

    public String getCodpro() {
        return codpro;
    }

    public void setCodpro(String codpro) {
        this.codpro = codpro;
    }

    public String getDescpro() {
        return descpro;
    }

    public void setDescpro(String descpro) {
        this.descpro = descpro;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Double getQtdvend() {
        return qtdvend;
    }

    public void setQtdvend(Double qtdvend) {
        this.qtdvend = qtdvend;
    }

    public Double getVlunit() {
        return vlunit;
    }

    public void setVlunit(Double vlunit) {
        this.vlunit = vlunit;
    }

    public Double getVlcusto() {
        return vlcusto;
    }

    public void setVlcusto(Double vlcusto) {
        this.vlcusto = vlcusto;
    }

    public Double getVltotal() {
        return vltotal;
    }

    public void setVltotal(Double vltotal) {
        this.vltotal = vltotal;
    }

    public Double getQtdund() {
        return qtdund;
    }

    public void setQtdund(Double qtdund) {
        this.qtdund = qtdund;
    }

    public Double getVlund() {
        return vlund;
    }

    public void setVlund(Double vlund) {
        this.vlund = vlund;
    }

    public Integer getCodfab() {
        return codfab;
    }

    public void setCodfab(Integer codfab) {
        this.codfab = codfab;
    }

    public Integer getCodven() {
        return codven;
    }

    public void setCodven(Integer codven) {
        this.codven = codven;
    }

    public String getCodgru() {
        return codgru;
    }

    public void setCodgru(String codgru) {
        this.codgru = codgru;
    }

    public Double getQtdemb() {
        return qtdemb;
    }

    public void setQtdemb(Double qtdemb) {
        this.qtdemb = qtdemb;
    }

    public String getUnunit() {
        return ununit;
    }

    public void setUnunit(String ununit) {
        this.ununit = ununit;
    }

    public String getUnemb() {
        return unemb;
    }

    public void setUnemb(String unemb) {
        this.unemb = unemb;
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

    public HtDadosHospedagem getHtDadosHospedagem() {
        return htDadosHospedagem;
    }

    public void setHtDadosHospedagem(HtDadosHospedagem htDadosHospedagem) {
        this.htDadosHospedagem = htDadosHospedagem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (htHospedagemServicoPK != null ? htHospedagemServicoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HtHospedagemServico)) {
            return false;
        }
        HtHospedagemServico other = (HtHospedagemServico) object;
        if ((this.htHospedagemServicoPK == null && other.htHospedagemServicoPK != null) || (this.htHospedagemServicoPK != null && !this.htHospedagemServicoPK.equals(other.htHospedagemServicoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.integare.bincontrole.HtHospedagemServico[ htHospedagemServicoPK=" + htHospedagemServicoPK + " ]";
    }
    
}
