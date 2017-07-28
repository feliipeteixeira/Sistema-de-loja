/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import BD.UsuarioSistemaDAO;
import Controle.Geral.ControleDataSistema;
import Controle.Geral.GeradorDeSenhA;
import Controle.Geral.MascaraGeral;
import Modelo.ModeloUsuarioSistema;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author felipe
 */
public class ControleUsuarioSistema {
    
 
    UsuarioSistemaDAO usuarioSistemaDAO;
    ControleDataSistema data;
    ControleDataSistema controleDataSistema;
    ModeloUsuarioSistema modeloUsuarioSistema;
    
   public List<ModeloUsuarioSistema> BuscarNome(String PesquisaControle) throws InstantiationException{
       controleDataSistema = new ControleDataSistema();
       usuarioSistemaDAO = new UsuarioSistemaDAO();
       
       List<ModeloUsuarioSistema> lista  = usuarioSistemaDAO.BuscarNome(PesquisaControle);
       
          //PERCORRE TODA A LISTA 
         for (ModeloUsuarioSistema Aux : lista) {
             Aux.setDataCriacao(controleDataSistema.Data(Aux.getDataCriacao()));     
            }
       return lista; 
    }
 
   
    //LISTAR TODOS OS REGISTRO NO BANCO
    public List<ModeloUsuarioSistema> ListarBanco() throws InstantiationException{
          // INSTANCIA 
          usuarioSistemaDAO = new UsuarioSistemaDAO();  
          controleDataSistema = new ControleDataSistema();
          List<ModeloUsuarioSistema> Lista = usuarioSistemaDAO.getModeloUsuarioSistema();
            // usuarioSistemaDAO.getModeloUsuarioSistema().size();
            // tamanho da lista
            //System.out.println("Tamanho: " +  usuarioSistemaDAO.getModeloUsuarioSistema().size());

            //PERCORRE TODA A LISTA 
            for(ModeloUsuarioSistema Aux : Lista){
               //System.out.println("Data e hora: " + Aux.getDataCriacao());

               //FORMATA DATA E HORA PARA MELHOR VIZULIZAÇÃO NA VIEW
               Aux.setDataCriacao(controleDataSistema.Data(Aux.getDataCriacao()));       
            }


          return Lista;
        }

    
    //METODO PRINCIPAL CONSTROI O OBJETO
    public ArrayList<ModeloUsuarioSistema> SemModelo(String nome,
                String senha, 
                String confirSenha,
                String email,
                Boolean admin) throws NoSuchAlgorithmException, UnsupportedEncodingException, InstantiationException{
        
      data = new ControleDataSistema();
      usuarioSistemaDAO = new UsuarioSistemaDAO();
    
      String ValidaSenha;
      boolean ValidaEmail;
      boolean adminStatus;
     
      ValidaSenha = ValidacaoSenha(senha,confirSenha);
      ValidaEmail = new MascaraGeral().MascaraEmail(email);

     
        if(!nome.equals("") && !senha.equals("")&& !confirSenha.equals("") && !email.equals("") ){
           
               
                ArrayList<ModeloUsuarioSistema> contatos = new ArrayList<ModeloUsuarioSistema>();
                ModeloUsuarioSistema modeloUsuarioSistema = new ModeloUsuarioSistema();
                
                // CRIANDO MODELO PARA CLASSSE  DAO
                modeloUsuarioSistema.setEmail(email);
                modeloUsuarioSistema.setUsuario(nome);
                modeloUsuarioSistema.setAdmin(admin);
                modeloUsuarioSistema.setDataCriacao(data.HoraFormatoBanco());
                modeloUsuarioSistema.setSenha(senha);
                
                usuarioSistemaDAO.inserir(modeloUsuarioSistema);
                
                // FORMATA DATAHORA LOGO DEPOIS DO BANCO DE DADOS
                modeloUsuarioSistema.setDataCriacao(data.FormatoOriginalDataHora(modeloUsuarioSistema.getDataCriacao()));
                
                contatos.add(modeloUsuarioSistema);
                
                return  contatos;
            
                  
        }else JOptionPane.showMessageDialog(null, "Campo vazio");
        return null;
        
     
 
         }
    
    
    public ModeloUsuarioSistema AlteracaoUsuario(
            String nome,
            String email,
            String senha,
            String confirmaSenha,
            boolean admin){
        
        data = new ControleDataSistema();
        UsuarioSistemaDAO usuarioSistemaDAO = new UsuarioSistemaDAO();

        modeloUsuarioSistema = new ModeloUsuarioSistema();

        modeloUsuarioSistema.setAdmin(admin);
        modeloUsuarioSistema.setUsuario(nome);
        modeloUsuarioSistema.setEmail(email);
        modeloUsuarioSistema.setSenha(senha);
        modeloUsuarioSistema.setDataAlateracao(data.HoraFormatoBanco());



        
        return usuarioSistemaDAO.atualizar(modeloUsuarioSistema); 
    }
    


    //VERIFICA A SENHA DIGITADA E CONVERTE
    private String ValidacaoSenha(String senha, String confirSenha) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        if(senha.equals(confirSenha)){
             GeradorDeSenhA geradorDeSenhA = new GeradorDeSenhA();
             geradorDeSenhA.Criptografia(senha);
             return senha;
         }else
            {
            JOptionPane.showMessageDialog(null, "Senha não corresponde");
            return "";
            }
    }
   



      /*
    public ModeloUsuarioSistema teste(ModeloUsuarioSistema modeloUsuarioSistema){
      
      modeloUsuarioSistema.setEmail("email");
      modeloUsuarioSistema.setUsuario("email");
      //modeloUsuarioSistema.setAdm(true);
      
      LocalDateTime hoje = LocalDateTime.now();
      DateTimeFormatter formatador = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
   
      modeloUsuarioSistema.setDataCriacao(hoje.format(formatador));
      modeloUsuarioSistema.setSenha("1234");
      
      return modeloUsuarioSistema;
    }
    
    public ArrayList<ModeloUsuarioSistema> teste1(ModeloUsuarioSistema modeloUsuarioSistema){
           ArrayList<ModeloUsuarioSistema> contatos = new ArrayList<ModeloUsuarioSistema>();
      
      modeloUsuarioSistema.setEmail("email");
      modeloUsuarioSistema.setUsuario("email");
    //  modeloUsuarioSistema.setAdm(true);
   
      
      LocalDateTime hoje = LocalDateTime.now();
      DateTimeFormatter formatador = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
      System.out.println("data localformate: " + hoje.format(formatador)); 
      
      modeloUsuarioSistema.setDataCriacao(hoje.format(formatador));
      modeloUsuarioSistema.setSenha("1234");
      
      contatos.add(modeloUsuarioSistema);
      
       
        return  contatos;
 
         }
    
        //CONVERTERÇÃO BOOLEAN
    public int AdminConverteInt(boolean aux){
        if(aux == true)
        return 1;
        else return 0;
    }
    
    public boolean AdminConverteBoolean(int aux){
        if(aux == 1)
        return true;
        else return false;
    }

      */      


    
}
