package BD;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;





public class BancoDeDados{
    

	

private static Connection con;
	
	/*************************************************** adquirindo conexao
     * @return 
     * @throws java.lang.InstantiationException *********************************************************/
		public static Connection getConexao() throws InstantiationException{
                    
               
                String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String url = "jdbc:sqlserver://localhost:1433;databaseName=Loja";
		String usuario = "sa";
		String senha = "alfa81";
                    
                    
		
		try {
               
         
			Class.forName(driver).newInstance();
			con = DriverManager.getConnection(url, usuario, senha);	
                        System.out.println("" +con);

		} catch (ClassNotFoundException e) {
			
                        JOptionPane.showMessageDialog(null,"DRIVER NÃO ENCONTRAR");
			//e.printStackTrace();
                           
                        

		} catch (SQLException e) {
			
                        JOptionPane.showMessageDialog(null,"ERRO EM OBTER CONEXÃO");
			//e.printStackTrace();
                      
                        
		} catch (IllegalAccessException ex) {
                Logger.getLogger(BancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
               
            }
		return con;
	}

        /*********** fim **************************************** adquirindo conexao *********************************************************/	
			
		
		
		
	/*************************************************** fechando conex�o *********************************************************/
    /*METODO PARA FECHAR O RESULTSET*/  
    static void resultSetClose(ResultSet rs){  
        try{   
                if (rs != null) rs.close();  
            }catch (Exception e){   
                //e.printStackTrace();  
               
            }  
    }  
    
    
    
    /*METODO PARA FECHAR O STATEMENT*/  
    static void statementClose(Statement stmt){  
    try{   
            if (stmt != null) stmt.close();  
        }catch (Exception e){   
           // e.printStackTrace();  
            
        }  
    }  
    
    
      
    /*METODO PARA FECHAR O PREPARED_STATEMENT*/  
    static void preparedStatmentClose(PreparedStatement pstm){  
    try{   
            if (pstm != null){ 
            	pstm.close();             	
            }
        }catch (Exception e){   
           // e.printStackTrace();
            
        }  
    }  
  
    
    
    
    /*METODO PARA FECHAR A CONEXAO*/  
    static void connectionClose(Connection con) {  
    try{   
            if (con != null)   
                con.close();
        }catch (Exception e){   
            e.printStackTrace();  
            
        }  
    }	  
    
    
    
    public static void main(String[] args) throws InstantiationException{
        getConexao();
    }
    
    
    
    
    /*************************************************** adquirindo conexao *********************************************************/
    
}  	// fechamento da classe

	
