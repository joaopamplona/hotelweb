/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.integare.bincontrole;

import com.interage.primefaces.model.Tabcli;
import conexao.Conectar;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author RenatoMachado
 */
@ManagedBean
@RequestScoped
public class TabCliBean {

    private List<Tabcli> tabcli;

    /** Creates a new instance of NewJSFManagedBean */
    public TabCliBean() {
        tabcli = new ArrayList<Tabcli>();
    }

    public List<Tabcli> getTabCli() throws SQLException {
   
       Conectar.ConectarBD();
       
       String query    = "SELECT codcli,nomcli,fancli FROM TABCLI ";
       
       Conectar.result = Conectar.stam.executeQuery(query);
       
       while (Conectar.result.next()){
            tabcli.add(new  Tabcli(Conectar.result.getString("codcli"), Conectar.result.getString("nomcli"), Conectar.result.getString("fancli")));   
       }
        
        return tabcli;
    }

    public void setTabCli(List<Tabcli> tabcli) {
        this.tabcli = tabcli;
    }
}
