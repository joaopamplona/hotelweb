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
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "HT_QUARTO")
@NamedQueries({
    @NamedQuery(name = "HtQuarto.findAll", query = "SELECT h FROM HtQuarto h")})
public class HtQuarto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_QUARTO")
    private Integer codQuarto;
    @Column(name = "DESC_QUARTO")
    private String descQuarto;
    @Column(name = "SITUACAO")
    private String situacao;
    @Column(name = "COD_TIPO_QUARTO")
    private String codTipoQuarto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QTD_CAMA_SOLTEIRO")
    private Double qtdCamaSolteiro;
    @Column(name = "QTD_CAMA_CASAL")
    private Double qtdCamaCasal;
    @Column(name = "TV")
    private String tv;
    @Column(name = "FRIGOBAR")
    private String frigobar;
    @Column(name = "COM_AR")
    private String comAr;
    @Column(name = "TELEFONE")
    private String telefone;
    @Column(name = "REDE")
    private String rede;
    @Column(name = "RGCODUSU")
    private Integer rgcodusu;
    @Column(name = "RGUSUARIO")
    private String rgusuario;
    @Column(name = "RGDATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rgdata;
    @Column(name = "RGEVENTO")
    private String rgevento;

    public HtQuarto() {
    }

    public HtQuarto(Integer codQuarto) {
        this.codQuarto = codQuarto;
    }

    public Integer getCodQuarto() {
        return codQuarto;
    }

    public void setCodQuarto(Integer codQuarto) {
        this.codQuarto = codQuarto;
    }

    public String getDescQuarto() {
        return descQuarto;
    }

    public void setDescQuarto(String descQuarto) {
        this.descQuarto = descQuarto;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getCodTipoQuarto() {
        return codTipoQuarto;
    }

    public void setCodTipoQuarto(String codTipoQuarto) {
        this.codTipoQuarto = codTipoQuarto;
    }

    public Double getQtdCamaSolteiro() {
        return qtdCamaSolteiro;
    }

    public void setQtdCamaSolteiro(Double qtdCamaSolteiro) {
        this.qtdCamaSolteiro = qtdCamaSolteiro;
    }

    public Double getQtdCamaCasal() {
        return qtdCamaCasal;
    }

    public void setQtdCamaCasal(Double qtdCamaCasal) {
        this.qtdCamaCasal = qtdCamaCasal;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public String getFrigobar() {
        return frigobar;
    }

    public void setFrigobar(String frigobar) {
        this.frigobar = frigobar;
    }

    public String getComAr() {
        return comAr;
    }

    public void setComAr(String comAr) {
        this.comAr = comAr;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRede() {
        return rede;
    }

    public void setRede(String rede) {
        this.rede = rede;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codQuarto != null ? codQuarto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HtQuarto)) {
            return false;
        }
        HtQuarto other = (HtQuarto) object;
        if ((this.codQuarto == null && other.codQuarto != null) || (this.codQuarto != null && !this.codQuarto.equals(other.codQuarto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.integare.bincontrole.HtQuarto[ codQuarto=" + codQuarto + " ]";
    }
    
}
