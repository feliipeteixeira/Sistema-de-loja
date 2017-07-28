/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Modelo.ModeloUsuarioSistema;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class UsuarioSistemaDAO {

	private final String INSERT = "insert into dbo.usuario (usuario, senha, email,dataCriacao,admin) values (?,?,?,?,?)";	 
        private final String LIST = "select * from dbo.usuario";
        private final String UPDATE = "update dbo.usuario set usuario=?, email=?, DataAlteracao=?,  senha=?, admin=? where usuario=?";
        private final String BUSARNOME = "select * from dbo.usuario where usuario like ?";
        
       
	private final String DELETE = "delete from dbo.contato where id =?";
        private final String BuscarNome = "select * from dbo.contato where nome =?";
        private final String PEQUISANOME = "select * from dbo.contato where nome like ?";
        private final String LISTBYID = "select * from dbo.contato where id=?";

	public void inserir(ModeloUsuarioSistema modeloUsuarioSistema) throws InstantiationException {
		if (modeloUsuarioSistema != null) {
			
		 Connection conexao = BancoDeDados.getConexao();
		 
		 PreparedStatement pstmt = null;
		 ResultSet rs = null;
		 
			try {
                            
                            System.err.println("entrou");
                            pstmt =  conexao.prepareStatement(INSERT);
                            
                            pstmt.setString(1, modeloUsuarioSistema.getUsuario());
                            pstmt.setString(2, modeloUsuarioSistema.getSenha());
                            pstmt.setString(3, modeloUsuarioSistema.getEmail());
                            pstmt.setString(4, modeloUsuarioSistema.getDataCriacao());
                            pstmt.setInt(5,modeloUsuarioSistema.isAdm());
                            
                            pstmt.executeUpdate();				

                                JOptionPane.showMessageDialog(null, " Cadastrado com sucesso");
				
                                BancoDeDados.preparedStatmentClose(pstmt);
                                BancoDeDados.connectionClose(conexao);
                                BancoDeDados.resultSetClose(rs);
                                

			} catch (SQLException | HeadlessException e) {
                            System.out.println(e.getMessage());
				JOptionPane.showMessageDialog(null, "Erro ao inserir contato no banco de"
						+ "dados " + e.getMessage());
			}
		} else {
			System.out.println("Parâmetro está vazio");
		}
	}
        
        public List<ModeloUsuarioSistema> getModeloUsuarioSistema() throws InstantiationException {
                Connection conexao = BancoDeDados.getConexao();

		 PreparedStatement pstmt = null;
		 ResultSet rs = null;
                 
                 ArrayList<ModeloUsuarioSistema> modeloUsuarioSistemaLista = new ArrayList<ModeloUsuarioSistema>();
             
		try {
			pstmt =  conexao.prepareStatement(LIST);
			rs = pstmt.executeQuery();
                        
              
			
                                     
                        while (rs.next()) {
                          
                            
				ModeloUsuarioSistema modeloUsuarioSistema = new ModeloUsuarioSistema();

				modeloUsuarioSistema.setUsuario(rs.getString("usuario"));
                                modeloUsuarioSistema.setDataCriacao(rs.getString("dataCriacao"));
                                modeloUsuarioSistema.setAdmin(rs.getBoolean("admin"));
                                modeloUsuarioSistema.setSenha(rs.getString("senha"));
                                modeloUsuarioSistema.setEmail(rs.getString("email"));
                                
				modeloUsuarioSistemaLista.add(modeloUsuarioSistema);
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao listar contatos ESTE" +  e.getMessage());
		}
		return modeloUsuarioSistemaLista;
	}

	public ModeloUsuarioSistema atualizar(ModeloUsuarioSistema modeloUsuarioSistema) {
		
                if (modeloUsuarioSistema != null) {
		
			try {
				  Connection conexao = BancoDeDados.getConexao();
                                  PreparedStatement pstmt = null;
                                  
				pstmt = conexao.prepareStatement(UPDATE);

				pstmt.setString(1, modeloUsuarioSistema.getUsuario());
				pstmt.setString(2, modeloUsuarioSistema.getEmail());
				pstmt.setString(3, modeloUsuarioSistema.getDataAlateracao());
				pstmt.setString(4, modeloUsuarioSistema.getSenha());
                                pstmt.setBoolean(5, modeloUsuarioSistema.isAdmin());
                                pstmt.setString(6, modeloUsuarioSistema.getUsuario());

				pstmt.executeUpdate();
				JOptionPane.showMessageDialog(null, "Usuario alterado com sucesso");
				

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Erro ao atualizar Usuario no banco de"
						+ "dados " + e.getMessage());
			}
		} else {
			JOptionPane.showMessageDialog(null, "O Usuario enviado por parâmetro está vazio");
		}
                return modeloUsuarioSistema;


	}
        
        public List<ModeloUsuarioSistema> BuscarNome(String pesquisa) throws InstantiationException{
                  
            Connection conexao = BancoDeDados.getConexao();	
            
		 PreparedStatement pstmt = null;
		 ResultSet rs = null;
                 
                 ArrayList<ModeloUsuarioSistema> modeloUsuarioSistemasList = new ArrayList<ModeloUsuarioSistema>();
             
		try {
			pstmt =  conexao.prepareStatement(BUSARNOME);
                        pstmt.setString(1, "%" + pesquisa + "%");
                        
			rs = pstmt.executeQuery();
                        System.out.println(BUSARNOME);
                        
			   
	
                                     
                        while (rs.next()) {
                            
                            	 ModeloUsuarioSistema modeloUsuarioSistema = new ModeloUsuarioSistema();		
                                System.out.println("CGEVIY");
                                
                                modeloUsuarioSistema.setUsuario(rs.getString("usuario"));
                                modeloUsuarioSistema.setDataCriacao(rs.getString("dataCriacao"));
                                modeloUsuarioSistema.setDataAlateracao(rs.getString("DataAlteracao"));
                                modeloUsuarioSistema.setAdmin(rs.getBoolean("admin"));
                                modeloUsuarioSistema.setEmail(rs.getString("email"));
                     
                                modeloUsuarioSistemasList.add(modeloUsuarioSistema);
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao listar: " +  e.getMessage());
		}
		return modeloUsuarioSistemasList;
	}
        
        
/*
	public void remover(int id) throws InstantiationException {
		  Connection conexao = BancoDeDados.getConexao();
		 
		 PreparedStatement pstmt = null;
		 ResultSet rs = null;
                 
		try {
			
			pstmt =  conexao.prepareStatement(DELETE);

			pstmt.setInt(1, id);

			pstmt.execute();
			

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao excluir contato do banco de"
					+ "dados " + e.getMessage());
		}
	}

	public List<Contato> getContatos() throws InstantiationException {
                Connection conexao = BancoDeDados.getConexao();
		 
		 PreparedStatement pstmt = null;
		 ResultSet rs = null;
                 
                 ArrayList<Contato> contatos = new ArrayList<Contato>();
             
		try {
			pstmt =  conexao.prepareStatement(LIST);
			rs = pstmt.executeQuery();
                        
                        System.err.println("ENTROU NO TRY");
			
                                     
                        while (rs.next()) {
                            System.err.println("ENTROU NO WHILE");
                            
				Contato contato = new Contato();

				contato.setId(rs.getInt("id"));
                                System.err.println("id_do_medodo_list" + rs.getInt("id"));
                                
                                
				contato.setNome(rs.getString("nome"));
				contato.setTelefone(rs.getString("telefone"));
				contato.setEmail(rs.getString("email"));
                                
                                
				contatos.add(contato);
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao listar contatos ESTE" +  e.getMessage());
		}
		return contatos;
	}

	public Contato getContatoById(int id) throws InstantiationException {
		  Connection conexao = BancoDeDados.getConexao();
		 
		 PreparedStatement pstmt = null;
		 ResultSet rs = null;
            
            
		Contato contato = new Contato();
                
		try {
			
			pstmt =  conexao.prepareStatement(LISTBYID);
                        
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
                        
			while (rs.next()) {
				contato.setId(rs.getInt("id"));
				contato.setNome(rs.getString("nome"));
				contato.setTelefone(rs.getString("telefone"));
				contato.setEmail(rs.getString("email"));
			}
		
                        
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao listar contatos" + e.getMessage());
		}
		return contato;
	}
        
        public List<Contato> getNomeContato(String nome) throws InstantiationException{
              Connection conexao = BancoDeDados.getConexao();
		 
		 PreparedStatement pstmt = null;
		 ResultSet rs = null;
                 
                 ArrayList<Contato> contatos = new ArrayList<Contato>();
                 
                 try {
			pstmt =  conexao.prepareStatement(PEQUISANOME);
                        System.out.println(PEQUISANOME);
                        //pstmt.setString(1, nome);
                        pstmt.setString(1, "%" + nome + "%");
                        System.out.println(PEQUISANOME);
			rs = pstmt.executeQuery();
                      
                        
                        while (rs.next()) {
                          
				Contato contato = new Contato();
                                
				contato.setId(rs.getInt("id"));                               
				contato.setNome(rs.getString("nome"));
				contato.setTelefone(rs.getString("telefone"));
				contato.setEmail(rs.getString("email"));
                                
                                System.out.println("Achou nome: " + contato.getNome());
                                
				contatos.add(contato);
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao listar contatos ESTE" +  e.getMessage());
		}
		return contatos;
                 
                 
        }
        
        
        
        
  */      
}
