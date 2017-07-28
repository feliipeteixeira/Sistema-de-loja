

package Modelo.AbstractTabel;

import Modelo.ModeloUsuarioSistema;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author felipe
 */
public class ModeloAbstractUsuarioSistema extends AbstractTableModel {
                
                private final int coluna_Nome = 0; 
                private final int Coluna_ultima_alteracao = 1;
                private final int coluna_Admin = 2;
    
    List<ModeloUsuarioSistema> linhas;            
    private String[] colunas = new String[]{"Usuario","ultima alteração","Administrador"};
   
    public ModeloAbstractUsuarioSistema(List<ModeloUsuarioSistema> modeloUsuarioSistemas){
        this.linhas = new ArrayList<>(modeloUsuarioSistemas);
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
	public Class getColumnClass(int columnIndex) {
		
            switch(columnIndex){
                case coluna_Nome:
                    return String.class;
                case Coluna_ultima_alteracao:
                    return String.class;
                case coluna_Admin: 
                    return Boolean.class;
                default:
                    throw new IndexOutOfBoundsException("Coluna não existe, fora dos indice!");
            }
	}
        /*
                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                        // apenas o campo "ATIVO" será editável
                        return columnIndex == coluna_Admin;
                    }

         */       
        @Override
	public Object getValueAt(int row, int column) {

        ModeloUsuarioSistema modeloUsuarioSistema = linhas.get(row);
		switch (column) {
                        case coluna_Nome:
	        	      return modeloUsuarioSistema.getUsuario();		
			case Coluna_ultima_alteracao:
			      return modeloUsuarioSistema.getDataCriacao();
                        case coluna_Admin:
			      return modeloUsuarioSistema.isAdmin();		
			default:
				throw new IndexOutOfBoundsException("Coluna não existe, fora dos indice!");
	        }
 
	}

        @Override
	public void setValueAt(Object aValue, int row, int column) {
		          ModeloUsuarioSistema modeloUsuarioSistema = linhas.get(row);
		switch (column) {
	        case coluna_Nome:
	        	modeloUsuarioSistema.setUsuario((String) aValue);
				 break;		
			case Coluna_ultima_alteracao:
				modeloUsuarioSistema.setDataCriacao((String) aValue);                       
                                break;
                        case coluna_Admin:
				modeloUsuarioSistema.setAdmin((boolean) aValue);
				 break;    
			default:
				throw new IndexOutOfBoundsException("Coluna não existe, fora dos indice!");
	        }
	        fireTableCellUpdated(row, column); // Notifica a atualização da célula

	}

        
        // retorna linha selecionado
	public ModeloUsuarioSistema getContato(int indiceLinha) {
		return linhas.get(indiceLinha);
	} 
        
        public void addContato(ModeloUsuarioSistema contato) {
		linhas.add(contato);
		int ultimoIndice = getRowCount() - 1;
		fireTableRowsInserted(ultimoIndice, ultimoIndice);

	}
        
	public void update(int indiceLinha, ModeloUsuarioSistema modeloUsuarioSistema) {
		linhas.set(indiceLinha, modeloUsuarioSistema);
		fireTableRowsUpdated(indiceLinha, indiceLinha);
	}

	public void removeContato(int indiceLinha) {
		linhas.remove(indiceLinha);
		fireTableRowsDeleted(indiceLinha, indiceLinha);
	}
 
        public void onRemoveAll() {
        linhas.clear();
        fireTableDataChanged();
        }
        
        public int indexOf(ModeloUsuarioSistema empregado) {
        return linhas.indexOf(empregado);
        }
 
        public void onAdd(ModeloUsuarioSistema contato) {
        linhas.add(contato);
        fireTableRowsInserted(indexOf(contato), indexOf(contato));
        }

        public void onAddAll(List<ModeloUsuarioSistema> dadosIn) {
            linhas.addAll(dadosIn);
            fireTableDataChanged();
        }

        
}
