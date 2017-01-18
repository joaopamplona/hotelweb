/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interage.primefaces.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author vplayer
 */

public class Tabusu{
    
    private static Integer codigo = 0;
    private static String nome = "";
    private static String senha;
    private static Character tipousu;
    private int sistema;
    private Integer codven;  
    private Double vlautoriza;
    private Integer rgcodusu;
    private String rgusuario; 
    private Date rgdata;
    private String rgevento;
    private byte[] template1;
    private byte[] template2;
    private byte[] template3;
    private byte[] template4;
    private byte[] template5;
    private Double percdescav;
    private Double percdesccc;
    private Double percdescap;
    private Double percdesccoav;
    private Double percdescatav;
    private Double percdesccocc;
    private Double percdescatcc;
    private Double percdesccoap;
    private Double percdescatap;
    private Double percdescjur;
    private Double percdescmul;
    private Double percdesctit;
    private Character visualizardebitos;
    private Integer codconta;
    

    public Tabusu() {
    
    }

    public Tabusu(Integer codigo) {
        this.codigo = codigo;
    }

    public Tabusu(Integer codigo, int sistema) {
        this.codigo = codigo;
        this.sistema = sistema;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        Tabusu.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Tabusu.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        Tabusu.senha = senha;
    }

    public Character getTipousu() {
        return tipousu;
    }

    public void setTipousu(Character tipousu) {
        this.tipousu = tipousu;
    }

    public int getSistema() {
        return sistema;
    }

    public void setSistema(int sistema) {
        this.sistema = sistema;
    }

    public Integer getCodven() {
        return codven;
    }

    public void setCodven(Integer codven) {
        this.codven = codven;
    }

    public Double getVlautoriza() {
        return vlautoriza;
    }

    public void setVlautoriza(Double vlautoriza) {
        this.vlautoriza = vlautoriza;
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

    public byte[] getTemplate1() {
        return template1;
    }

    public void setTemplate1(byte[] template1) {
        this.template1 = template1;
    }

    public byte[] getTemplate2() {
        return template2;
    }

    public void setTemplate2(byte[] template2) {
        this.template2 = template2;
    }
    
    public byte[] getTemplate3() {
        return template3;
    }
    
    public void setTemplate3(byte[] template3) {
        this.template3 = template3;
    }

    public byte[] getTemplate4() {
        return template4;
    }

    public void setTemplate4(byte[] template4) {
        this.template4 = template4;
    }

    public byte[] getTemplate5() {
        return template5;
    }

    public void setTemplate5(byte[] template5) {
        this.template5 = template5;
    }

    public Double getPercdescav() {
        return percdescav;
    }

    public void setPercdescav(Double percdescav) {
        this.percdescav = percdescav;
    }

    public Double getPercdesccc() {
        return percdesccc;
    }

    public void setPercdesccc(Double percdesccc) {
        this.percdesccc = percdesccc;
    }

    public Double getPercdescap() {
        return percdescap;
    }

    public void setPercdescap(Double percdescap) {
        this.percdescap = percdescap;
    }

    public Double getPercdesccoav() {
        return percdesccoav;
    }

    public void setPercdesccoav(Double percdesccoav) {
        this.percdesccoav = percdesccoav;
    }

    public Double getPercdescatav() {
        return percdescatav;
    }

    public void setPercdescatav(Double percdescatav) {
        this.percdescatav = percdescatav;
    }

    public Double getPercdesccocc() {
        return percdesccocc;
    }

    public void setPercdesccocc(Double percdesccocc) {
        this.percdesccocc = percdesccocc;
    }

    public Double getPercdescatcc() {
        return percdescatcc;
    }

    public void setPercdescatcc(Double percdescatcc) {
        this.percdescatcc = percdescatcc;
    }

    public Double getPercdesccoap() {
        return percdesccoap;
    }

    public void setPercdesccoap(Double percdesccoap) {
        this.percdesccoap = percdesccoap;
    }

    public Double getPercdescatap() {
        return percdescatap;
    }

    public void setPercdescatap(Double percdescatap) {
        this.percdescatap = percdescatap;
    }

    public Double getPercdescjur() {
        return percdescjur;
    }

    public void setPercdescjur(Double percdescjur) {
        this.percdescjur = percdescjur;
    }

    public Double getPercdescmul() {
        return percdescmul;
    }

    public void setPercdescmul(Double percdescmul) {
        this.percdescmul = percdescmul;
    }

    public Double getPercdesctit() {
        return percdesctit;
    }

    public void setPercdesctit(Double percdesctit) {
        this.percdesctit = percdesctit;
    }

    public Character getVisualizardebitos() {
        return visualizardebitos;
    }

    public void setVisualizardebitos(Character visualizardebitos) {
        this.visualizardebitos = visualizardebitos;
    }

    public Integer getCodconta() {
        return codconta;
    }

    public void setCodconta(Integer codconta) {
        this.codconta = codconta;
    }

    
}
