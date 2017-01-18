/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interage.primefaces.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "HT_DADOS_HOSPEDAGEM")
@NamedQueries({
    @NamedQuery(name = "HtDadosHospedagem.findAll", query = "SELECT h FROM HtDadosHospedagem h")})
public class HtDadosHospedagem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "NR_RESERVA")
    private int nrReserva;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_HOSPEDAGEM")
    private Integer codHospedagem;
    @Basic(optional = false)
    @Column(name = "COD_QUARTO")
    private int codQuarto;
    @Column(name = "DESC_QUARTO")
    private String descQuarto;
    @Column(name = "CODCLI")
    private String codcli;
    @Column(name = "NOMCLI")
    private String nomcli;
    @Column(name = "DATA_ENTRADA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataEntrada;
    @Column(name = "HR_ENTRADA")
    private String hrEntrada;
    @Column(name = "DATA_PREV_SAIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataPrevSaida;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QTD_PESSOAS_ADD")
    private Double qtdPessoasAdd;
    @Column(name = "TIPO_HOSPEDAGEM")
    private String tipoHospedagem;
    @Column(name = "VALOR_HOSPEDAGEM")
    private Double valorHospedagem;
    @Column(name = "PLACA")
    private String placa;
    @Column(name = "DATA_SAIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataSaida;
    @Column(name = "HR_SAIDA")
    private String hrSaida;
    @Column(name = "VALOR_SAIDA")
    private Double valorSaida;
    @Column(name = "QTD_DIARIAS")
    private Integer qtdDiarias;
    @Column(name = "QTD_HORAS")
    private String qtdHoras;
    @Column(name = "QTD_PERNOITE")
    private String qtdPernoite;
    @Column(name = "DT_INTERMEDIARIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtIntermediaria;
    @Column(name = "SITUACAO")
    private String situacao;
    @Column(name = "RGCODUSU")
    private Integer rgcodusu;
    @Column(name = "RGUSUARIO")
    private String rgusuario;
    @Column(name = "RGDATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rgdata;
    @Column(name = "RGEVENTO")
    private String rgevento;
    @Column(name = "CODFORMA")
    private Integer codforma;
    @Column(name = "TOTALHORAS")
    private String totalhoras;
    @Column(name = "NOMEFORMA")
    private String nomeforma;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "htDadosHospedagem")
    private Collection<HtHospedagemItens> htHospedagemItensCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "htDadosHospedagem")
    private Collection<HtHospedagemServico> htHospedagemServicoCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "htDadosHospedagem")
    private HtDadosHospedagemTroca htDadosHospedagemTroca;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "htDadosHospedagem")
    private Collection<HtAdiantamentoCliente> htAdiantamentoClienteCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "htDadosHospedagem")
    private Collection<HtHospedagemExtraTroca> htHospedagemExtraTrocaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "htDadosHospedagem")
    private Collection<HtHospedagemPessoasExtra> htHospedagemPessoasExtraCollection;

    public HtDadosHospedagem() {
    }

    public HtDadosHospedagem(Integer codHospedagem) {
        this.codHospedagem = codHospedagem;
    }

    public HtDadosHospedagem(Integer codHospedagem, int nrReserva, int codQuarto) {
        this.codHospedagem = codHospedagem;
        this.nrReserva = nrReserva;
        this.codQuarto = codQuarto;
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

    public Collection<HtHospedagemItens> getHtHospedagemItensCollection() {
        return htHospedagemItensCollection;
    }

    public void setHtHospedagemItensCollection(Collection<HtHospedagemItens> htHospedagemItensCollection) {
        this.htHospedagemItensCollection = htHospedagemItensCollection;
    }

    public Collection<HtHospedagemServico> getHtHospedagemServicoCollection() {
        return htHospedagemServicoCollection;
    }

    public void setHtHospedagemServicoCollection(Collection<HtHospedagemServico> htHospedagemServicoCollection) {
        this.htHospedagemServicoCollection = htHospedagemServicoCollection;
    }

    public HtDadosHospedagemTroca getHtDadosHospedagemTroca() {
        return htDadosHospedagemTroca;
    }

    public void setHtDadosHospedagemTroca(HtDadosHospedagemTroca htDadosHospedagemTroca) {
        this.htDadosHospedagemTroca = htDadosHospedagemTroca;
    }

    public Collection<HtAdiantamentoCliente> getHtAdiantamentoClienteCollection() {
        return htAdiantamentoClienteCollection;
    }

    public void setHtAdiantamentoClienteCollection(Collection<HtAdiantamentoCliente> htAdiantamentoClienteCollection) {
        this.htAdiantamentoClienteCollection = htAdiantamentoClienteCollection;
    }

    public Collection<HtHospedagemExtraTroca> getHtHospedagemExtraTrocaCollection() {
        return htHospedagemExtraTrocaCollection;
    }

    public void setHtHospedagemExtraTrocaCollection(Collection<HtHospedagemExtraTroca> htHospedagemExtraTrocaCollection) {
        this.htHospedagemExtraTrocaCollection = htHospedagemExtraTrocaCollection;
    }

    public Collection<HtHospedagemPessoasExtra> getHtHospedagemPessoasExtraCollection() {
        return htHospedagemPessoasExtraCollection;
    }

    public void setHtHospedagemPessoasExtraCollection(Collection<HtHospedagemPessoasExtra> htHospedagemPessoasExtraCollection) {
        this.htHospedagemPessoasExtraCollection = htHospedagemPessoasExtraCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codHospedagem != null ? codHospedagem.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HtDadosHospedagem)) {
            return false;
        }
        HtDadosHospedagem other = (HtDadosHospedagem) object;
        if ((this.codHospedagem == null && other.codHospedagem != null) || (this.codHospedagem != null && !this.codHospedagem.equals(other.codHospedagem))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.integare.bincontrole.HtDadosHospedagem[ codHospedagem=" + codHospedagem + " ]";
    }
    
}
