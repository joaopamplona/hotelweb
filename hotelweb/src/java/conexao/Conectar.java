
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conectar {
    
    public static Connection con ;
    public static Statement stam;
    public static ResultSet result;
    
    private static String URL = "jdbc:firebirdsql:localhost/3050:C:/InterageSE/Dados/INTEGRADO.GDB";
    private static String usuario = "SYSDBA";  
    private static String password = "masterkey";
    private static String DRIVER = "org.firebirdsql.jdbc.FBDriver";
    
    public static void ConectarBD(){
        try{
            if(con == null){
                Class.forName(DRIVER);
                con = DriverManager.getConnection(URL, usuario, password);              
            }
            stam = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println("Sucesso! BD Conectado!");   
            
        }catch(Exception se){
            JOptionPane.showMessageDialog(null, "Problemas na conexão com a fonte de dados.\n" + se.getLocalizedMessage());
        }
        
    }
    
    public static void CloseBD(){
        try{
            con.close();
            System.out.println("BD Desconectado!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexão.\n" + e.getLocalizedMessage());
        }
    }
    
    
   
    
    
}
