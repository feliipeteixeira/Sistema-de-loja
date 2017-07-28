package Controle.Geral;

import Controle.*;
import javax.swing.JOptionPane;

import BD.bd_LoginDAO;
import Modelo.ModeloLogin;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ValidacaoSenhaLogin {

	
        public static boolean CampoVazio(String usuarioCampoVazio,String senhaCampoVazio){
            
             if( usuarioCampoVazio.trim().equals("") == true || senhaCampoVazio.trim().equals("") == true){
               JOptionPane.showMessageDialog(null,"Campo vazio");
               //caso esteja vazio o campo do usuario retornar falso 
               return false;
     }else{ 
         boolean retornoLogin = validaSenha(usuarioCampoVazio,senhaCampoVazio);
         
         if (retornoLogin == false){
         JOptionPane.showMessageDialog(null," Usuario ou senha nao esta cadastrado no banco de dados");
         return false;
         }
       
     }
             
     // caso encontre o usuario dentro do banco de dados   
     return true;
      }
    
    
	public static boolean validaSenha(String usuario,String senha){
		
		// converte String em double
		double SenhaConvertida =  Double.parseDouble(senha); 
		
		// chama classe modelo para setar os valores
		ModeloLogin modelo = new ModeloLogin(usuario,SenhaConvertida);
		
                // classe banco para saber oque esta sendo retornado
		bd_LoginDAO banco = new bd_LoginDAO(); 		
	
		
		// caso o login seja verdadeiro 
		// mostra mensagem e autoriza a classe
                
                System.out.println("modelo " + modelo.getUsuario());
            try {
                    return banco.LoginUsuario(modelo.getUsuario(),modelo.getSenha()) == true; // caso o banco retorn e verdadeiro para usuario
                    // caso nao existe o usuario no sistema, retorna falso para metodo campo fazio
            } catch (InstantiationException ex) {
                Logger.getLogger(ValidacaoSenhaLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
                
	}
        
}
