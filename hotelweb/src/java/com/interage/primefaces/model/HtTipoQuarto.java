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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "HT_TIPO_QUARTO")
@NamedQueries({
    @NamedQuery(name = "HtTipoQuarto.findAll", query = "SELECT h FROM HtTipoQuarto h")})
public class HtTipoQuarto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_TIPO_QUARTO")
    private Integer codTipoQuarto;
    @Column(name = "DESC_TIPO_QUARTO")
    private String descTipoQuarto;
    @Column(name = "NR_PESSOA_PADRAO")
    private Integer nrPessoaPadrao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_DIARIA")
    private Double vlDiaria;
    @Column(name = "ADD_PESSOA_DIARIA")
    private Double addPessoaDiaria;
    @Column(name = "VL_PERNOITE")
    private Double vlPernoite;
    @Column(name = "ADD_PESSOA_PERNOITE")
    private Double addPessoaPernoite;
    @Column(name = "VL_HORA")
    private Double vlHora;
    @Column(name = "ADD_PESSOA_HORA")
    private Double addPessoaHora;
    @Column(name = "RGCODUSU")
    private Integer rgcodusu;
    @Column(name = "RGUSUARIO")
    private String rgusuario;
    @Column(name = "RGDATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rgdata;
    @Column(name = "RGEVENTO")
    private String rgevento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "htTipoQuarto")
    private Collection<HtPrecoHora> htPrecoHoraCollection;

    public HtTipoQuarto() {
    }

    public HtTipoQuarto(Integer codTipoQuarto) {
        this.codTipoQuarto = codTipoQuarto;
    }

    public Integer getCodTipoQuarto() {
        return codTipoQuarto;
    }

    public void setCodTipoQuarto(Integer codTipoQuarto) {
        this.codTipoQuarto = codTipoQuarto;
    }

    public String getDescTipoQuarto() {
        return descTipoQuarto;
    }

    public void setDescTipoQuarto(String descTipoQuarto) {
        this.descTipoQuarto = descTipoQuarto;
    }

    public Integer getNrPessoaPadrao() {
        return nrPessoaPadrao;
    }

    public void setNrPessoaPadrao(Integer nrPessoaPadrao) {
        this.nrPessoaPadrao = nrPessoaPadrao;
    }

    public Double getVlDiaria() {
        return vlDiaria;
    }

    public void setVlDiaria(Double vlDiaria) {
        this.vlDiaria = vlDiaria;
    }

    public Double getAddPessoaDiaria() {
        return addPessoaDiaria;
    }

    public void setAddPessoaDiaria(Double addPessoaDiaria) {
        this.addPessoaDiaria = addPessoaDiaria;
    }

    public Double getVlPernoite() {
        return vlPernoite;
    }

    public void setVlPernoite(Double vlPernoite) {
        this.vlPernoite = vlPernoite;
    }

    public Double getAddPessoaPernoite() {
        return addPessoaPernoite;
    }

    public void setAddPessoaPernoite(Double addPessoaPernoite) {
        this.addPessoaPernoite = addPessoaPernoite;
    }

    public Double getVlHora() {
        return vlHora;
    }

    public void setVlHora(Double vlHora) {
        this.vlHora = vlHora;
    }

    public Double getAddPessoaHora() {
        return addPessoaHora;
    }

    public void setAddPessoaHora(Double addPessoaHora) {
        this.addPessoaHora = addPessoaHora;
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

    public Collection<HtPrecoHora> getHtPrecoHoraCollection() {
        return htPrecoHoraCollection;
    }

    public void setHtPrecoHoraCollection(Collection<HtPrecoHora> htPrecoHoraCollection) {
        this.htPrecoHoraCollection = htPrecoHoraCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codTipoQuarto != null ? codTipoQuarto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HtTipoQuarto)) {
            return false;
        }
        HtTipoQuarto other = (HtTipoQuarto) object;
        if ((this.codTipoQuarto == null && other.codTipoQuarto != null) || (this.codTipoQuarto != null && !this.codTipoQuarto.equals(other.codTipoQuarto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.integare.bincontrole.HtTipoQuarto[ codTipoQuarto=" + codTipoQuarto + " ]";
    }
    
}
