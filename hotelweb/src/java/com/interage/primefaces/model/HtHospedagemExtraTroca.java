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
@Table(name = "HT_HOSPEDAGEM_EXTRA_TROCA")
@NamedQueries({
    @NamedQuery(name = "HtHospedagemExtraTroca.findAll", query = "SELECT h FROM HtHospedagemExtraTroca h")})
public class HtHospedagemExtraTroca implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HtHospedagemExtraTrocaPK htHospedagemExtraTrocaPK;
    @Basic(optional = false)
    @Column(name = "COD_QUARTO")
    private int codQuarto;
    @Column(name = "DESC_QUARTO")
    private String descQuarto;
    @Basic(optional = false)
    @Column(name = "COD_RESERVA_EXTRA_OLD")
    private int codReservaExtraOld;
    @Basic(optional = false)
    @Column(name = "COD_QUARTO_OLD")
    private int codQuartoOld;
    @Column(name = "DESC_QUARTO_OLD")
    private String descQuartoOld;
    @Column(name = "NOMCLI_EXTRA")
    private String nomcliExtra;
    @Column(name = "PLACA_EXTRA")
    private String placaExtra;
    @Column(name = "RG_EXTRA")
    private String rgExtra;
    @Column(name = "DATA_ENTRADA_EXTRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataEntradaExtra;
    @Column(name = "HR_ENTRADA_EXTRA")
    private String hrEntradaExtra;
    @Column(name = "DATA_SAIDA_EXTRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataSaidaExtra;
    @Column(name = "HR_SAIDA_EXTRA")
    private String hrSaidaExtra;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QTD_DIARIAS_EXTRA")
    private Double qtdDiariasExtra;
    @Column(name = "VL_DIARIAS_EXTRA")
    private Double vlDiariasExtra;
    @Column(name = "TOTAL_DIARIAS_EXTRA")
    private Double totalDiariasExtra;
    @Column(name = "OBS")
    private String obs;
    @Column(name = "RGCODUSU")
    private Integer rgcodusu;
    @Column(name = "RGUSUARIO")
    private String rgusuario;
    @Column(name = "RGDATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rgdata;
    @Column(name = "RGEVENTO")
    private String rgevento;
    @JoinColumn(name = "COD_RESERVA_EXTRA", referencedColumnName = "COD_HOSPEDAGEM", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private HtDadosHospedagem htDadosHospedagem;

    public HtHospedagemExtraTroca() {
    }

    public HtHospedagemExtraTroca(HtHospedagemExtraTrocaPK htHospedagemExtraTrocaPK) {
        this.htHospedagemExtraTrocaPK = htHospedagemExtraTrocaPK;
    }

    public HtHospedagemExtraTroca(HtHospedagemExtraTrocaPK htHospedagemExtraTrocaPK, int codQuarto, int codReservaExtraOld, int codQuartoOld) {
        this.htHospedagemExtraTrocaPK = htHospedagemExtraTrocaPK;
        this.codQuarto = codQuarto;
        this.codReservaExtraOld = codReservaExtraOld;
        this.codQuartoOld = codQuartoOld;
    }

    public HtHospedagemExtraTroca(int codReservaExtra, int nritem) {
        this.htHospedagemExtraTrocaPK = new HtHospedagemExtraTrocaPK(codReservaExtra, nritem);
    }

    public HtHospedagemExtraTrocaPK getHtHospedagemExtraTrocaPK() {
        return htHospedagemExtraTrocaPK;
    }

    public void setHtHospedagemExtraTrocaPK(HtHospedagemExtraTrocaPK htHospedagemExtraTrocaPK) {
        this.htHospedagemExtraTrocaPK = htHospedagemExtraTrocaPK;
    }

    public int getCodQuarto() {
        return codQuarto;
    }

    public void setCodQuarto(int codQuarto) {
        this.codQuarto = codQuarto;
    }

    public String getDescQuarto() {
        return descQuarto;
    }

    public void setDescQuarto(String descQuarto) {
        this.descQuarto = descQuarto;
    }

    public int getCodReservaExtraOld() {
        return codReservaExtraOld;
    }

    public void setCodReservaExtraOld(int codReservaExtraOld) {
        this.codReservaExtraOld = codReservaExtraOld;
    }

    public int getCodQuartoOld() {
        return codQuartoOld;
    }

    public void setCodQuartoOld(int codQuartoOld) {
        this.codQuartoOld = codQuartoOld;
    }

    public String getDescQuartoOld() {
        return descQuartoOld;
    }

    public void setDescQuartoOld(String descQuartoOld) {
        this.descQuartoOld = descQuartoOld;
    }

    public String getNomcliExtra() {
        return nomcliExtra;
    }

    public void setNomcliExtra(String nomcliExtra) {
        this.nomcliExtra = nomcliExtra;
    }

    public String getPlacaExtra() {
        return placaExtra;
    }

    public void setPlacaExtra(String placaExtra) {
        this.placaExtra = placaExtra;
    }

    public String getRgExtra() {
        return rgExtra;
    }

    public void setRgExtra(String rgExtra) {
        this.rgExtra = rgExtra;
    }

    public Date getDataEntradaExtra() {
        return dataEntradaExtra;
    }

    public void setDataEntradaExtra(Date dataEntradaExtra) {
        this.dataEntradaExtra = dataEntradaExtra;
    }

    public String getHrEntradaExtra() {
        return hrEntradaExtra;
    }

    public void setHrEntradaExtra(String hrEntradaExtra) {
        this.hrEntradaExtra = hrEntradaExtra;
    }

    public Date getDataSaidaExtra() {
        return dataSaidaExtra;
    }

    public void setDataSaidaExtra(Date dataSaidaExtra) {
        this.dataSaidaExtra = dataSaidaExtra;
    }

    public String getHrSaidaExtra() {
        return hrSaidaExtra;
    }

    public void setHrSaidaExtra(String hrSaidaExtra) {
        this.hrSaidaExtra = hrSaidaExtra;
    }

    public Double getQtdDiariasExtra() {
        return qtdDiariasExtra;
    }

    public void setQtdDiariasExtra(Double qtdDiariasExtra) {
        this.qtdDiariasExtra = qtdDiariasExtra;
    }

    public Double getVlDiariasExtra() {
        return vlDiariasExtra;
    }

    public void setVlDiariasExtra(Double vlDiariasExtra) {
        this.vlDiariasExtra = vlDiariasExtra;
    }

    public Double getTotalDiariasExtra() {
        return totalDiariasExtra;
    }

    public void setTotalDiariasExtra(Double totalDiariasExtra) {
        this.totalDiariasExtra = totalDiariasExtra;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
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
        hash += (htHospedagemExtraTrocaPK != null ? htHospedagemExtraTrocaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HtHospedagemExtraTroca)) {
            return false;
        }
        HtHospedagemExtraTroca other = (HtHospedagemExtraTroca) object;
        if ((this.htHospedagemExtraTrocaPK == null && other.htHospedagemExtraTrocaPK != null) || (this.htHospedagemExtraTrocaPK != null && !this.htHospedagemExtraTrocaPK.equals(other.htHospedagemExtraTrocaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.integare.bincontrole.HtHospedagemExtraTroca[ htHospedagemExtraTrocaPK=" + htHospedagemExtraTrocaPK + " ]";
    }
    
}
