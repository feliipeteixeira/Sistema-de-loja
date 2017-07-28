/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Modelo.ModeloFornecedor;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author felipe
 */
public class FornecedorDAO {
    
    private final String listar="select * from dbo.fornecedor"; 
    private final String insert ="insert into dbo.fornecedor"
            + " (razaoSocial,nomeFantasia,cnpjCpf,"
            + "DataCriacao,dataAlteracao,endereco,obs,"
            + "completo,bairro,cep,representante,cargo,"
            + "tel01,tel02,what01,what02,email)"
            + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
   
  // INSERIR OS FORNECEDORES
  public void inserir(ModeloFornecedor modeloFornecedor) throws InstantiationException {
  if(modeloFornecedor != null){
    Connection conexao = BancoDeDados.getConexao();
    PreparedStatement pstmt = null;
    ResultSet rs = null;
 
      try {
          pstmt = conexao.prepareCall(insert);
          pstmt.setString(1, modeloFornecedor.getNomeEmpresa());
          pstmt.setString(2, modeloFornecedor.getNomeFantasia());
          pstmt.setString(3, modeloFornecedor.getCnpj());
          pstmt.setString(4, modeloFornecedor.getDataCriacao());
          pstmt.setString(5, modeloFornecedor.getDataAlteracao());
          pstmt.setString(6, modeloFornecedor.getEndereco());
          pstmt.setString(7, modeloFornecedor.getObs());
          pstmt.setString(8, modeloFornecedor.getComplemento());
          pstmt.setString(9, modeloFornecedor.getBairro());
          pstmt.setString(10, modeloFornecedor.getCep());
          pstmt.setString(11, modeloFornecedor.getRepresentante());
          pstmt.setString(12, modeloFornecedor.getCargo());
          pstmt.setString(13, modeloFornecedor.getTel01());
          pstmt.setString(14, modeloFornecedor.getTel02());
          pstmt.setString(15, modeloFornecedor.getWhat01());
          pstmt.setString(16, modeloFornecedor.getWhat02());
          pstmt.setString(17, modeloFornecedor.getEmailPricipal());
          pstmt.executeUpdate();
          
          JOptionPane.showMessageDialog(null, "Fornecedor cadastrado com sucesso");
          
          BancoDeDados.connectionClose(conexao);
          BancoDeDados.preparedStatmentClose(pstmt);
          BancoDeDados.resultSetClose(rs);
          
          } catch (SQLException | HeadlessException e) {
                   System.out.println(e.getMessage());
		JOptionPane.showMessageDialog(null, "Erro ao inserir Fornecedor no banco de"
						+ "dados " + e.getMessage());
			}
		} else {
			System.out.println("O Fornecedor enviado por parâmetro está vazio");
		}
  }
  
  public List<ModeloFornecedor> getModeloFornecedors() throws InstantiationException{
        Connection conexao = BancoDeDados.getConexao();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
         ArrayList<ModeloFornecedor> modeloFornecedorLista = new ArrayList<ModeloFornecedor>(); 
        
        try {
            pstmt = conexao.prepareStatement(listar);
            rs = pstmt.executeQuery();
            
            while(rs.next()){
            ModeloFornecedor modeloFornecedor  = new ModeloFornecedor();
            modeloFornecedor.setNomeEmpresa(rs.getString("razaoSocial"));
            modeloFornecedor.setNome(rs.getString("nomeFantasia"));
            modeloFornecedor.setCnpj(rs.getString("cnpjCpf"));
            modeloFornecedor.setDataCriacao(rs.getString("DataCriacao"));
            modeloFornecedor.setDataModificao(rs.getString("dataAlteracao"));
            modeloFornecedor.setEndereco(rs.getString("endereco"));
            modeloFornecedor.setObs(rs.getString("obs"));
            modeloFornecedor.setBairro(rs.getString("bairro"));
            modeloFornecedor.setCep(rs.getString("cep"));
            modeloFornecedor.setRepresentante(rs.getString("representante"));
            modeloFornecedor.setCargo(rs.getString("cargo"));
            modeloFornecedor.setTel01(rs.getString("tel01"));
            modeloFornecedor.setTel02(rs.getString("tel02"));   
            modeloFornecedor.setWhat01(rs.getString("what01"));
            modeloFornecedor.setWhat02(rs.getString("what02"));
            modeloFornecedor.setEmailPricipal(rs.getString("email"));
            
            modeloFornecedorLista.add(modeloFornecedor);
          
            
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return modeloFornecedorLista;
  
  }      
}
