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
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author PC
 */

public class HtDadosHospedagemTroca{

    
    private int nrReserva;
    
    private Integer codHospedagem;
    
    private int codQuarto;
    
    private String descQuarto;
    
    private int nrReservaOld;
    
    private int codHospedagemOld;
    
    private int codQuartoOld;
    
    private String descQuartoOld;
    
    private String codcli;
    
    private String nomcli;
    
    private Date dataEntrada;
    
    private String hrEntrada;
    
    private Date dataPrevSaida;
    
    private Double qtdPessoasAdd;
    
    private String tipoHospedagem;
    
    private Double valorHospedagem;
    
    private String placa;
    
    private Date dataSaida;
    
    private String hrSaida;
    
    private Double valorSaida;
    
    private Integer qtdDiarias;
    
    private String qtdHoras;
    
    private String qtdPernoite;
    
    private Date dtIntermediaria;
    
    private String situacao;
    
    private Integer rgcodusu;
    
    private String rgusuario;
    
    private Date rgdata;
    
    private String rgevento;
    
    private Integer codforma;
    
    private String totalhoras;
    
    private String nomeforma;
    
    private HtDadosHospedagem htDadosHospedagem;

    public HtDadosHospedagemTroca() {
    }

    public HtDadosHospedagemTroca(Integer codHospedagem) {
        this.codHospedagem = codHospedagem;
    }

    public HtDadosHospedagemTroca(Integer codHospedagem, int nrReserva, int codQuarto, int nrReservaOld, int codHospedagemOld, int codQuartoOld) {
        this.codHospedagem = codHospedagem;
        this.nrReserva = nrReserva;
        this.codQuarto = codQuarto;
        this.nrReservaOld = nrReservaOld;
        this.codHospedagemOld = codHospedagemOld;
        this.codQuartoOld = codQuartoOld;
    }

    public int getNrReserva() {
        return nrReserva;
    }

    public void setNrReserva(int nrReserva) {
        this.nrReserva = nrReserva;
    }

    public Integer getCodHospedagem() {
        return codHospedagem;
    }

    public void setCodHospedagem(Integer codHospedagem) {
        this.codHospedagem = codHospedagem;
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

    public int getNrReservaOld() {
        return nrReservaOld;
    }

    public void setNrReservaOld(int nrReservaOld) {
        this.nrReservaOld = nrReservaOld;
    }

    public int getCodHospedagemOld() {
        return codHospedagemOld;
    }

    public void setCodHospedagemOld(int codHospedagemOld) {
        this.codHospedagemOld = codHospedagemOld;
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

    public String getHrEntrada() {
        return hrEntrada;
    }

    public void setHrEntrada(String hrEntrada) {
        this.hrEntrada = hrEntrada;
    }

    public Date getDataPrevSaida() {
        return dataPrevSaida;
    }

    public void setDataPrevSaida(Date dataPrevSaida) {
        this.dataPrevSaida = dataPrevSaida;
    }

    public Double getQtdPessoasAdd() {
        return qtdPessoasAdd;
    }

    public void setQtdPessoasAdd(Double qtdPessoasAdd) {
        this.qtdPessoasAdd = qtdPessoasAdd;
    }

    public String getTipoHospedagem() {
        return tipoHospedagem;
    }

    public void setTipoHospedagem(String tipoHospedagem) {
        this.tipoHospedagem = tipoHospedagem;
    }

    public Double getValorHospedagem() {
        return valorHospedagem;
    }

    public void setValorHospedagem(Double valorHospedagem) {
        this.valorHospedagem = valorHospedagem;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getHrSaida() {
       
        return hrSaida;
    }

    public void setHrSaida(String hrSaida) {
        this.hrSaida = hrSaida;
    }

    public Double getValorSaida() {
        return valorSaida;
    }

    public void setValorSaida(Double valorSaida) {
        this.valorSaida = valorSaida;
    }

    public Integer getQtdDiarias() {
        return qtdDiarias;
    }

    public void setQtdDiarias(Integer qtdDiarias) {
        this.qtdDiarias = qtdDiarias;
    }

    public String getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(String qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public String getQtdPernoite() {
        return qtdPernoite;
    }

    public void setQtdPernoite(String qtdPernoite) {
        this.qtdPernoite = qtdPernoite;
    }

    public Date getDtIntermediaria() {
        return dtIntermediaria;
    }

    public void setDtIntermediaria(Date dtIntermediaria) {
        this.dtIntermediaria = dtIntermediaria;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
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

    public Integer getCodforma() {
        return codforma;
    }

    public void setCodforma(Integer codforma) {
        this.codforma = codforma;
    }

    public String getTotalhoras() {
        return totalhoras;
    }

    public void setTotalhoras(String totalhoras) {
        this.totalhoras = totalhoras;
    }

    public String getNomeforma() {
        return nomeforma;
    }

    public void setNomeforma(String nomeforma) {
        this.nomeforma = nomeforma;
    }

    public HtDadosHospedagem getHtDadosHospedagem() {
        return htDadosHospedagem;
    }

    public void setHtDadosHospedagem(HtDadosHospedagem htDadosHospedagem) {
        this.htDadosHospedagem = htDadosHospedagem;
    }

    
}
