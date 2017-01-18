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
@Table(name = "HT_RESERVA_QUARTO")
@NamedQueries({
    @NamedQuery(name = "HtReservaQuarto.findAll", query = "SELECT h FROM HtReservaQuarto h")})
public class HtReservaQuarto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NR_RESERVA")
    private Integer nrReserva;
    @Column(name = "COD_QUARTO")
    private String codQuarto;
    @Column(name = "DESC_QUARTO")
    private String descQuarto;
    @Column(name = "CODCLI")
    private String codcli;
    @Column(name = "NOMCLI")
    private String nomcli;
    @Column(name = "DATA_ENTRADA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataEntrada;
    @Column(name = "DATA_SAIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataSaida;
    @Column(name = "QTD_PESSOAS")
    private Integer qtdPessoas;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_DIARIA")
    private Double vlDiaria;
    @Column(name = "VL_ADDPESS")
    private Double vlAddpess;
    @Column(name = "VL_TOTAL")
    private Double vlTotal;
    @Column(name = "QTD_DIARIA")
    private Integer qtdDiaria;
    @Column(name = "TIPO_HOSPEDAGEM")
    private String tipoHospedagem;
    @Column(name = "RGCODUSU")
    private Integer rgcodusu;
    @Column(name = "RGUSUARIO")
    private String rgusuario;
    @Column(name = "RGDATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rgdata;
    @Column(name = "RGEVENTO")
    private String rgevento;
    @Column(name = "SITUACAO")
    private String situacao;

    public HtReservaQuarto() {
    }

    public HtReservaQuarto(Integer nrReserva) {
        this.nrReserva = nrReserva;
    }

    public Integer getNrReserva() {
        return nrReserva;
    }

    public void setNrReserva(Integer nrReserva) {
        this.nrReserva = nrReserva;
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

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Integer getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(Integer qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    public Double getVlDiaria() {
        return vlDiaria;
    }

    public void setVlDiaria(Double vlDiaria) {
        this.vlDiaria = vlDiaria;
    }

    public Double getVlAddpess() {
        return vlAddpess;
    }

    public void setVlAddpess(Double vlAddpess) {
        this.vlAddpess = vlAddpess;
    }

    public Double getVlTotal() {
        return vlTotal;
    }

    public void setVlTotal(Double vlTotal) {
        this.vlTotal = vlTotal;
    }

    public Integer getQtdDiaria() {
        return qtdDiaria;
    }

    public void setQtdDiaria(Integer qtdDiaria) {
        this.qtdDiaria = qtdDiaria;
    }

    public String getTipoHospedagem() {
        return tipoHospedagem;
    }

    public void setTipoHospedagem(String tipoHospedagem) {
        this.tipoHospedagem = tipoHospedagem;
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

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nrReserva != null ? nrReserva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HtReservaQuarto)) {
            return false;
        }
        HtReservaQuarto other = (HtReservaQuarto) object;
        if ((this.nrReserva == null && other.nrReserva != null) || (this.nrReserva != null && !this.nrReserva.equals(other.nrReserva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.integare.bincontrole.HtReservaQuarto[ nrReserva=" + nrReserva + " ]";
    }
    
}
