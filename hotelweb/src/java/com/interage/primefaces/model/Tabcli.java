/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interage.primefaces.model;


import java.util.Date;


public class Tabcli{
    public Tabcli() {
    }
    
  
    private String codcli;
    private String codcard;
    private String nomcli;
    private String fancli;
    private Short codpreco;
    private Short codsetor;
    private Short codrec;
    private Short codrede;
    private Short codramo;
    private Short fpgcli;
    private Short vencli;
    private Date dtcadastro;
    private Date dtpricomp;
    private Date dtultcomp;
    private Date dtfundcli;
    private Date dtnasc;
    private Date dtnasconj;
    private String endcli;
    private String baicli;
    private String cep;
    private String cidade;
    private String uf;
    private String fone1;
    private String fone2;
    private String fax;
    private String email;
    private String contato;
    private String inscsuf;
    private String cgc;
    private String inscest;
    private String cartprof;
    private String pontoref;
    private Character tpcliente;
    private Character restringir;
    private Character fisjur;
    private Character estcivil;
    private Character sexo;
    private Character tpresid;
    private Character propria;
    private Character possuibens;
    private Character posoutcart;
    private Character passspc;
    private String st;
    private String endcobcli;
    private String autoriza;
    private String motivorest;
    private String naturalidade;
    private String nmpai;
    private String nmmae;
    private String lctrab;
    private String tpserv;
    private String teltrab;
    private String endtrab;
    private String cargotrab;
    private String quaisbens;
    private String quaiscartoes;
    private String nmconjuge;
    private String paiconj;
    private String maeconj;
    private String identconj;
    private String cpfconj;
    private String lctraconj;
    private String tpserconj;
    private String teltraconj;
    private String nmfiador;
    private String rgfiador;
    private String cpffiador;
    private String endfiador;
    private String telfiador;
    private String nmref1;
    private String telref1;
    private String endref1;
    private String nmref2;
    private String telref2;
    private String endref2;
    private Integer icmsatc;
    private Integer diaspag;
    private Short diascli;
    private Short nrdepend;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double vlmtcli;
    private Double credsuple;
    private Double vlaluguel;
    private Double rendasal;
    private Double outrenda;
    private Double rensalconj;
    private Double outrenconj;
    private Double vlmeta;
    private Double percdescav;
    private Double percdescap;
    private String obs;
    private Character tpdiacli;
    private Double limcheque;
    private Integer quantpontos;
    private Character cobrtaxa;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private String rgevento;
    private String nrcdl;
    private Double percdesccc;
    private Double cresuplmen;
    private Integer medcompra;
    private Short codrota;
    private Short ordemvis;
    private Short ordemrot;
    private String senha;
    private Double txjuros;
    private Double txmulta;
    private Character negociacao;
    private Date dtvisita;
    private Integer codcobr;
    private String nrendcli;
    private Integer codplve;
    private Double vlmtmensal;
    private Character tpdesconto;
    private String codpais;
    private Integer codfil;
    private String codcrt;
    private Double redbsicms;
    private Double redbasest;
    private String suframado;
    private String cfops;
    private String codcst;
    private String codcaemt;
    
    public Tabcli(String codcli, String nomcli, String fancli) {     
        this.codcli  = codcli; 
        this.nomcli = nomcli;
        this.fancli = fancli;          
    }
    
    

    public Tabcli(String codcli) {
        this.codcli = codcli;
    }

    public String getCodcli() {
        return codcli;
    }

    public void setCodcli(String codcli) {
        this.codcli = codcli;
    }

    public String getCodcard() {
        return codcard;
    }

    public void setCodcard(String codcard) {
        this.codcard = codcard;
    }

    public String getNomcli() {
        return nomcli;
    }

    public void setNomcli(String nomcli) {
        this.nomcli = nomcli;
    }

    public String getFancli() {
        return fancli;
    }

    public void setFancli(String fancli) {
        this.fancli = fancli;
    }

    public Short getCodpreco() {
        return codpreco;
    }

    public void setCodpreco(Short codpreco) {
        this.codpreco = codpreco;
    }

    public Short getCodsetor() {
        return codsetor;
    }

    public void setCodsetor(Short codsetor) {
        this.codsetor = codsetor;
    }

    public Short getCodrec() {
        return codrec;
    }

    public void setCodrec(Short codrec) {
        this.codrec = codrec;
    }

    public Short getCodrede() {
        return codrede;
    }

    public void setCodrede(Short codrede) {
        this.codrede = codrede;
    }

    public Short getCodramo() {
        return codramo;
    }

    public void setCodramo(Short codramo) {
        this.codramo = codramo;
    }

    public Short getFpgcli() {
        return fpgcli;
    }

    public void setFpgcli(Short fpgcli) {
        this.fpgcli = fpgcli;
    }

    public Short getVencli() {
        return vencli;
    }

    public void setVencli(Short vencli) {
        this.vencli = vencli;
    }

    public Date getDtcadastro() {
        return dtcadastro;
    }

    public void setDtcadastro(Date dtcadastro) {
        this.dtcadastro = dtcadastro;
    }

    public Date getDtpricomp() {
        return dtpricomp;
    }

    public void setDtpricomp(Date dtpricomp) {
        this.dtpricomp = dtpricomp;
    }

    public Date getDtultcomp() {
        return dtultcomp;
    }

    public void setDtultcomp(Date dtultcomp) {
        this.dtultcomp = dtultcomp;
    }

    public Date getDtfundcli() {
        return dtfundcli;
    }

    public void setDtfundcli(Date dtfundcli) {
        this.dtfundcli = dtfundcli;
    }

    public Date getDtnasc() {
        return dtnasc;
    }

    public void setDtnasc(Date dtnasc) {
        this.dtnasc = dtnasc;
    }

    public Date getDtnasconj() {
        return dtnasconj;
    }

    public void setDtnasconj(Date dtnasconj) {
        this.dtnasconj = dtnasconj;
    }

    public String getEndcli() {
        return endcli;
    }

    public void setEndcli(String endcli) {
        this.endcli = endcli;
    }

    public String getBaicli() {
        return baicli;
    }

    public void setBaicli(String baicli) {
        this.baicli = baicli;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getFone1() {
        return fone1;
    }

    public void setFone1(String fone1) {
        this.fone1 = fone1;
    }

    public String getFone2() {
        return fone2;
    }

    public void setFone2(String fone2) {
        this.fone2 = fone2;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getInscsuf() {
        return inscsuf;
    }

    public void setInscsuf(String inscsuf) {
        this.inscsuf = inscsuf;
    }

    public String getCgc() {
        return cgc;
    }

    public void setCgc(String cgc) {
        this.cgc = cgc;
    }

    public String getInscest() {
        return inscest;
    }

    public void setInscest(String inscest) {
        this.inscest = inscest;
    }

    public String getCartprof() {
        return cartprof;
    }

    public void setCartprof(String cartprof) {
        this.cartprof = cartprof;
    }

    public String getPontoref() {
        return pontoref;
    }

    public void setPontoref(String pontoref) {
        this.pontoref = pontoref;
    }

    public Character getTpcliente() {
        return tpcliente;
    }

    public void setTpcliente(Character tpcliente) {
        this.tpcliente = tpcliente;
    }

    public Character getRestringir() {
        return restringir;
    }

    public void setRestringir(Character restringir) {
        this.restringir = restringir;
    }

    public Character getFisjur() {
        return fisjur;
    }

    public void setFisjur(Character fisjur) {
        this.fisjur = fisjur;
    }

    public Character getEstcivil() {
        return estcivil;
    }

    public void setEstcivil(Character estcivil) {
        this.estcivil = estcivil;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Character getTpresid() {
        return tpresid;
    }

    public void setTpresid(Character tpresid) {
        this.tpresid = tpresid;
    }

    public Character getPropria() {
        return propria;
    }

    public void setPropria(Character propria) {
        this.propria = propria;
    }

    public Character getPossuibens() {
        return possuibens;
    }

    public void setPossuibens(Character possuibens) {
        this.possuibens = possuibens;
    }

    public Character getPosoutcart() {
        return posoutcart;
    }

    public void setPosoutcart(Character posoutcart) {
        this.posoutcart = posoutcart;
    }

    public Character getPassspc() {
        return passspc;
    }

    public void setPassspc(Character passspc) {
        this.passspc = passspc;
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public String getEndcobcli() {
        return endcobcli;
    }

    public void setEndcobcli(String endcobcli) {
        this.endcobcli = endcobcli;
    }

    public String getAutoriza() {
        return autoriza;
    }

    public void setAutoriza(String autoriza) {
        this.autoriza = autoriza;
    }

    public String getMotivorest() {
        return motivorest;
    }

    public void setMotivorest(String motivorest) {
        this.motivorest = motivorest;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getNmpai() {
        return nmpai;
    }

    public void setNmpai(String nmpai) {
        this.nmpai = nmpai;
    }

    public String getNmmae() {
        return nmmae;
    }

    public void setNmmae(String nmmae) {
        this.nmmae = nmmae;
    }

    public String getLctrab() {
        return lctrab;
    }

    public void setLctrab(String lctrab) {
        this.lctrab = lctrab;
    }

    public String getTpserv() {
        return tpserv;
    }

    public void setTpserv(String tpserv) {
        this.tpserv = tpserv;
    }

    public String getTeltrab() {
        return teltrab;
    }

    public void setTeltrab(String teltrab) {
        this.teltrab = teltrab;
    }

    public String getEndtrab() {
        return endtrab;
    }

    public void setEndtrab(String endtrab) {
        this.endtrab = endtrab;
    }

    public String getCargotrab() {
        return cargotrab;
    }

    public void setCargotrab(String cargotrab) {
        this.cargotrab = cargotrab;
    }

    public String getQuaisbens() {
        return quaisbens;
    }

    public void setQuaisbens(String quaisbens) {
        this.quaisbens = quaisbens;
    }

    public String getQuaiscartoes() {
        return quaiscartoes;
    }

    public void setQuaiscartoes(String quaiscartoes) {
        this.quaiscartoes = quaiscartoes;
    }

    public String getNmconjuge() {
        return nmconjuge;
    }

    public void setNmconjuge(String nmconjuge) {
        this.nmconjuge = nmconjuge;
    }

    public String getPaiconj() {
        return paiconj;
    }

    public void setPaiconj(String paiconj) {
        this.paiconj = paiconj;
    }

    public String getMaeconj() {
        return maeconj;
    }

    public void setMaeconj(String maeconj) {
        this.maeconj = maeconj;
    }

    public String getIdentconj() {
        return identconj;
    }

    public void setIdentconj(String identconj) {
        this.identconj = identconj;
    }

    public String getCpfconj() {
        return cpfconj;
    }

    public void setCpfconj(String cpfconj) {
        this.cpfconj = cpfconj;
    }

    public String getLctraconj() {
        return lctraconj;
    }

    public void setLctraconj(String lctraconj) {
        this.lctraconj = lctraconj;
    }

    public String getTpserconj() {
        return tpserconj;
    }

    public void setTpserconj(String tpserconj) {
        this.tpserconj = tpserconj;
    }

    public String getTeltraconj() {
        return teltraconj;
    }

    public void setTeltraconj(String teltraconj) {
        this.teltraconj = teltraconj;
    }

    public String getNmfiador() {
        return nmfiador;
    }

    public void setNmfiador(String nmfiador) {
        this.nmfiador = nmfiador;
    }

    public String getRgfiador() {
        return rgfiador;
    }

    public void setRgfiador(String rgfiador) {
        this.rgfiador = rgfiador;
    }

    public String getCpffiador() {
        return cpffiador;
    }

    public void setCpffiador(String cpffiador) {
        this.cpffiador = cpffiador;
    }

    public String getEndfiador() {
        return endfiador;
    }

    public void setEndfiador(String endfiador) {
        this.endfiador = endfiador;
    }

    public String getTelfiador() {
        return telfiador;
    }

    public void setTelfiador(String telfiador) {
        this.telfiador = telfiador;
    }

    public String getNmref1() {
        return nmref1;
    }

    public void setNmref1(String nmref1) {
        this.nmref1 = nmref1;
    }

    public String getTelref1() {
        return telref1;
    }

    public void setTelref1(String telref1) {
        this.telref1 = telref1;
    }

    public String getEndref1() {
        return endref1;
    }

    public void setEndref1(String endref1) {
        this.endref1 = endref1;
    }

    public String getNmref2() {
        return nmref2;
    }

    public void setNmref2(String nmref2) {
        this.nmref2 = nmref2;
    }

    public String getTelref2() {
        return telref2;
    }

    public void setTelref2(String telref2) {
        this.telref2 = telref2;
    }

    public String getEndref2() {
        return endref2;
    }

    public void setEndref2(String endref2) {
        this.endref2 = endref2;
    }

    public Integer getIcmsatc() {
        return icmsatc;
    }

    public void setIcmsatc(Integer icmsatc) {
        this.icmsatc = icmsatc;
    }

    public Integer getDiaspag() {
        return diaspag;
    }

    public void setDiaspag(Integer diaspag) {
        this.diaspag = diaspag;
    }

    public Short getDiascli() {
        return diascli;
    }

    public void setDiascli(Short diascli) {
        this.diascli = diascli;
    }

    public Short getNrdepend() {
        return nrdepend;
    }

    public void setNrdepend(Short nrdepend) {
        this.nrdepend = nrdepend;
    }

    public Double getVlmtcli() {
        return vlmtcli;
    }

    public void setVlmtcli(Double vlmtcli) {
        this.vlmtcli = vlmtcli;
    }

    public Double getCredsuple() {
        return credsuple;
    }

    public void setCredsuple(Double credsuple) {
        this.credsuple = credsuple;
    }

    public Double getVlaluguel() {
        return vlaluguel;
    }

    public void setVlaluguel(Double vlaluguel) {
        this.vlaluguel = vlaluguel;
    }

    public Double getRendasal() {
        return rendasal;
    }

    public void setRendasal(Double rendasal) {
        this.rendasal = rendasal;
    }

    public Double getOutrenda() {
        return outrenda;
    }

    public void setOutrenda(Double outrenda) {
        this.outrenda = outrenda;
    }

    public Double getRensalconj() {
        return rensalconj;
    }

    public void setRensalconj(Double rensalconj) {
        this.rensalconj = rensalconj;
    }

    public Double getOutrenconj() {
        return outrenconj;
    }

    public void setOutrenconj(Double outrenconj) {
        this.outrenconj = outrenconj;
    }

    public Double getVlmeta() {
        return vlmeta;
    }

    public void setVlmeta(Double vlmeta) {
        this.vlmeta = vlmeta;
    }

    public Double getPercdescav() {
        return percdescav;
    }

    public void setPercdescav(Double percdescav) {
        this.percdescav = percdescav;
    }

    public Double getPercdescap() {
        return percdescap;
    }

    public void setPercdescap(Double percdescap) {
        this.percdescap = percdescap;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Character getTpdiacli() {
        return tpdiacli;
    }

    public void setTpdiacli(Character tpdiacli) {
        this.tpdiacli = tpdiacli;
    }

    public Double getLimcheque() {
        return limcheque;
    }

    public void setLimcheque(Double limcheque) {
        this.limcheque = limcheque;
    }

    public Integer getQuantpontos() {
        return quantpontos;
    }

    public void setQuantpontos(Integer quantpontos) {
        this.quantpontos = quantpontos;
    }

    public Character getCobrtaxa() {
        return cobrtaxa;
    }

    public void setCobrtaxa(Character cobrtaxa) {
        this.cobrtaxa = cobrtaxa;
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

    public String getNrcdl() {
        return nrcdl;
    }

    public void setNrcdl(String nrcdl) {
        this.nrcdl = nrcdl;
    }

    public Double getPercdesccc() {
        return percdesccc;
    }

    public void setPercdesccc(Double percdesccc) {
        this.percdesccc = percdesccc;
    }

    public Double getCresuplmen() {
        return cresuplmen;
    }

    public void setCresuplmen(Double cresuplmen) {
        this.cresuplmen = cresuplmen;
    }

    public Integer getMedcompra() {
        return medcompra;
    }

    public void setMedcompra(Integer medcompra) {
        this.medcompra = medcompra;
    }

    public Short getCodrota() {
        return codrota;
    }

    public void setCodrota(Short codrota) {
        this.codrota = codrota;
    }

    public Short getOrdemvis() {
        return ordemvis;
    }

    public void setOrdemvis(Short ordemvis) {
        this.ordemvis = ordemvis;
    }

    public Short getOrdemrot() {
        return ordemrot;
    }

    public void setOrdemrot(Short ordemrot) {
        this.ordemrot = ordemrot;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Double getTxjuros() {
        return txjuros;
    }

    public void setTxjuros(Double txjuros) {
        this.txjuros = txjuros;
    }

    public Double getTxmulta() {
        return txmulta;
    }

    public void setTxmulta(Double txmulta) {
        this.txmulta = txmulta;
    }

    public Character getNegociacao() {
        return negociacao;
    }

    public void setNegociacao(Character negociacao) {
        this.negociacao = negociacao;
    }

    public Date getDtvisita() {
        return dtvisita;
    }

    public void setDtvisita(Date dtvisita) {
        this.dtvisita = dtvisita;
    }

    public Integer getCodcobr() {
        return codcobr;
    }

    public void setCodcobr(Integer codcobr) {
        this.codcobr = codcobr;
    }

    public String getNrendcli() {
        return nrendcli;
    }

    public void setNrendcli(String nrendcli) {
        this.nrendcli = nrendcli;
    }

    public Integer getCodplve() {
        return codplve;
    }

    public void setCodplve(Integer codplve) {
        this.codplve = codplve;
    }

    public Double getVlmtmensal() {
        return vlmtmensal;
    }

    public void setVlmtmensal(Double vlmtmensal) {
        this.vlmtmensal = vlmtmensal;
    }

    public Character getTpdesconto() {
        return tpdesconto;
    }

    public void setTpdesconto(Character tpdesconto) {
        this.tpdesconto = tpdesconto;
    }

    public String getCodpais() {
        return codpais;
    }

    public void setCodpais(String codpais) {
        this.codpais = codpais;
    }

    public Integer getCodfil() {
        return codfil;
    }

    public void setCodfil(Integer codfil) {
        this.codfil = codfil;
    }

    public String getCodcrt() {
        return codcrt;
    }

    public void setCodcrt(String codcrt) {
        this.codcrt = codcrt;
    }

    public Double getRedbsicms() {
        return redbsicms;
    }

    public void setRedbsicms(Double redbsicms) {
        this.redbsicms = redbsicms;
    }

    public Double getRedbasest() {
        return redbasest;
    }

    public void setRedbasest(Double redbasest) {
        this.redbasest = redbasest;
    }

    public String getSuframado() {
        return suframado;
    }

    public void setSuframado(String suframado) {
        this.suframado = suframado;
    }

    public String getCfops() {
        return cfops;
    }

    public void setCfops(String cfops) {
        this.cfops = cfops;
    }

    public String getCodcst() {
        return codcst;
    }

    public void setCodcst(String codcst) {
        this.codcst = codcst;
    }

    public String getCodcaemt() {
        return codcaemt;
    }

    public void setCodcaemt(String codcaemt) {
        this.codcaemt = codcaemt;
    }

    
   
    
}
