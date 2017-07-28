
package Controle;

import BD.FornecedorDAO;
import Modelo.ModeloFornecedor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felipe
 */
public class ControleFornecedor {
    public FornecedorDAO fornecedorDAO;
    
    
    public ArrayList<ModeloFornecedor> ContrucaoModelo(
    String razaoSocial,
    String nomeFantasia, 
    String cnpjCpf,
    String dataCriacao,
    String dataAlteracao,
    String endereco,
    String complemento,
    String bairro,
    String cep,
    String cidadeFornecedor,
    String Obs,
    String representante,
    String cargo,
    String tel01,
    String tel02,
    String what01,
    String what02,
    String email) throws InstantiationException{
        
        ArrayList<ModeloFornecedor> modeloFornecedorsList = new ArrayList<ModeloFornecedor>();
        ModeloFornecedor modeloFornecedor = new ModeloFornecedor();
        
        
        //NOME
        modeloFornecedor.setNomeFantasia(nomeFantasia);
        modeloFornecedor.setRepresentante(representante);
        modeloFornecedor.setNomeEmpresa(razaoSocial);
  
        //ENDEREÇO
        modeloFornecedor.setUf(cidadeFornecedor);
        modeloFornecedor.setCnpj(cnpjCpf);
        modeloFornecedor.setEndereco(endereco);
        modeloFornecedor.setBairro(bairro);
        modeloFornecedor.setComplemento(complemento);
        modeloFornecedor.setCep(cep);
        modeloFornecedor.setObs(Obs);
        
        //CONTATO
        modeloFornecedor.setCargo(cargo);
        modeloFornecedor.setTel01(tel01);
        modeloFornecedor.setTel02(tel02);
        modeloFornecedor.setWhat01(what01);
        modeloFornecedor.setWhat02(what02);
        modeloFornecedor.setEmailPricipal(email);
        
        modeloFornecedor.setDataAlteracao(dataAlteracao);
        modeloFornecedor.setDataAlteracao(dataCriacao);
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        fornecedorDAO.inserir(modeloFornecedor);
        
        for (ModeloFornecedor modeloFornecedorsList1 : modeloFornecedorsList) {
               System.out.println(modeloFornecedorsList1.getBairro().isEmpty());
            }
        
        modeloFornecedorsList.add(modeloFornecedor);
        
    return modeloFornecedorsList; 
    
    }
    
    
    public List<ModeloFornecedor>  ListarFornecedor(){
    fornecedorDAO = new FornecedorDAO();
    return fornecedorDAO.getModeloFornecedors();
    
    }
}
