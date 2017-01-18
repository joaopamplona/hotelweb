
package com.integare.bincontrole;


import com.interage.primefaces.model.Tabusu;
import conexao.Conectar;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.swing.JOptionPane;

@ManagedBean(name = "TabUsuBean")
public class TabUsuBean {
    
    Tabusu tabusu = new Tabusu();
    
    public TabUsuBean(){
        Conectar.ConectarBD();
    }

    public Tabusu getTabusu() {
        return tabusu;
    }

    public void setTabusu(Tabusu tabusu) {
        this.tabusu = tabusu;
    }
    
    
    //Método para fazer o Login do Usuário
    public String BtnLogarUsuario(Tabusu tabusu) {
        
        String caminho = "";
        
        try {
            
            Conectar.result = Conectar.stam.executeQuery("select * from TABUSU where ((RGEVENTO <> '3') or (RGEVENTO IS NULL)) and (SISTEMA = 10)"
                    + "and (NOME = '" + tabusu.getNome() + "')  and (SENHA = '" + tabusu.getSenha() + "') order by NOME");
            
            
            while (Conectar.result.next()) {
                tabusu.setCodigo(Conectar.result.getInt("CODIGO"));          //Pega o codigo do usuário
                tabusu.setNome(Conectar.result.getString("NOME"));        //Pega o nome do usuario     
                tabusu.setSenha(Conectar.result.getString("SENHA"));      //Pega a senha do usuario 

                System.out.println("Código do Usuário: " + tabusu.getCodigo());
                System.out.println("Usuário: " + tabusu.getNome());
                System.out.println("Senha: " + tabusu.getSenha());
            }
            
            if(Conectar.result.last() == true){
                System.out.println("Usuário Logado");
                FacesContext.getCurrentInstance().addMessage("myform:frmlogin", new FacesMessage("Usuário Logado!"));
                caminho = "/views/paginaprincipal.xhtml?faces-redirect=true";
                
            }else{
                System.out.println("Usuário não existe.");
                FacesContext.getCurrentInstance().addMessage("myform:frmlogin", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Senha errada!", "Digite uma senha válida."));
                caminho = null;
            }
            
           
        } catch (Exception e) {
            e.printStackTrace();
           // JOptionPane.showMessageDialog(null, "Error Login \n" + e.getLocalizedMessage());
        }
        
        return caminho;
    }
    
}
