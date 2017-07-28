package BD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class bd_LoginDAO {
	
	
	public boolean LoginUsuario(String usuario, double senha) throws InstantiationException{
		
		 Connection conexao = BancoDeDados.getConexao();
		 
		 PreparedStatement stmt = null;
		 ResultSet rs = null;
		 
		 
		 try {
			
			String sql = "select login,senha from dbo.login_sistema where login = ? and senha = ?"; 
			stmt =  conexao.prepareStatement(sql);
			stmt.setString(1,usuario);
			stmt.setDouble(2,senha);
			rs = stmt.executeQuery();// executa o camando sql
		
		
		// percorre toda a tabela
		while(rs.next()){
				
			//String auxiliar 
			String usuarioAUX;
			double senhaAUX;
			
			
			// nome da tabela
			senhaAUX = rs.getDouble("senha");
			usuarioAUX = rs.getString("login");			
		
			
			//System.out.println("tabela usuario academia: " + usuarioAUX);
			//System.out.println("tabela senha academia: " + senhaAUX);	
			return true;
		  }
		//Fechando banco de dados
               
		BancoDeDados.preparedStatmentClose(stmt);
		BancoDeDados.connectionClose(conexao);
		BancoDeDados.resultSetClose(rs);
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;			
	}       
   
        
        
}
