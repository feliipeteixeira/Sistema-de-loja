/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.AbstractTabel;

import Modelo.ModeloFornecedor;
import Modelo.ModeloUsuarioSistema;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author felipe
 */
public class ModeloAbstractFornecedor extends AbstractTableModel{

    private final int coluna_Codigo =0;
    private final int coluna_NomeFantasia =1;
    private final int coluna_UF =5;
    private final int coluna_Cnpj =3;
    private final int coluna_Telefone =4;
    private final int coluna_representante=2;
    
    List<ModeloFornecedor> linhas;
    private  String[] colunas = new String[]{"Codigo","Nome fantasia","Representante","Telefone","Cnpj","UF"};
    
    public ModeloAbstractFornecedor(List<ModeloFornecedor> modeloFornecedors){
        this.linhas = new ArrayList<>(modeloFornecedors);
    }
        
        //LINHA 
        @Override
	public int getRowCount() {
		return linhas.size();
	}
        // coluna
        @Override
	public int getColumnCount() {
		return colunas.length;
	}
        // NOMES DA COLUNAS
        @Override
	public String getColumnName(int columnIndex) {
		return colunas[columnIndex];
	}
   
        

        @Override	
        public  Class getColumnClass(int columnIndex){

             switch(columnIndex){
                     case coluna_Codigo:
                         return int.class;
                     case coluna_NomeFantasia:
                         return String.class;
                     case coluna_representante: 
                         return String.class;
                     case coluna_Telefone: 
                         return String.class;
                     case coluna_Cnpj: 
                         return String.class;
                     case coluna_UF: 
                         return String.class;
                     default:
                         throw new IndexOutOfBoundsException("Coluna não existe, fora dos indice1!");
             }
         }

        @Override	
        public void setValueAt(Object aValue, int row, int column) {
                               ModeloFornecedor modeloFornecedor = linhas.get(row);
                     switch (column) {

                         case coluna_Codigo:
                             modeloFornecedor.setId((int) aValue);
                             break;		

                         case coluna_NomeFantasia:
                             modeloFornecedor.setNomeEmpresa((String) aValue); 
                             break;            
                         case coluna_representante: 
                             modeloFornecedor.setRepresentante((String) aValue);
                             break;
                         case coluna_Telefone:
                             modeloFornecedor.setTelPrincipal((String) aValue);
                             break;                        
                         case coluna_Cnpj:
                             modeloFornecedor.setCnpj((String) aValue);
                             break;
                         case coluna_UF: 
                             modeloFornecedor.setUf((String) aValue);
                             break;
                         default:
                                     throw new IndexOutOfBoundsException("Coluna não existe, fora dos indice!");
                     }
                     fireTableCellUpdated(row, column); // Notifica a atualização da célula

             } 

        @Override
        public Object getValueAt(int row, int column) {

             ModeloFornecedor modeloFornecedor = linhas.get(row);
                     switch (column) {
                             case coluna_Codigo:
                                   return modeloFornecedor.getId();	
                             case coluna_NomeFantasia:
                                     return modeloFornecedor.getNomeFantasia();
                             case coluna_representante:
                                     return modeloFornecedor.getRepresentante();
                             case coluna_Telefone:
                                     return modeloFornecedor.getTelPrincipal();
                             case coluna_Cnpj:
                                 return modeloFornecedor.getCnpj();
                             case coluna_UF:
                                     return modeloFornecedor.getUf();

                             default:
                                     throw new IndexOutOfBoundsException("Coluna não existe, fora dos indice!");
                     }

             }


    
}
