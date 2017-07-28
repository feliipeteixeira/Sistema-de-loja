/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author felipe
 */
public class ModeloFornecedor {
    
    private int id;
    
    // NOME EMPRESA
    private String nomeEmpresa;
    private String nomeFantasia;
    private String nome;
    private String cnpj;
    private String cpf;
    
    //ENDERECO
    private String representante;
    private String cargo;
    private String telPrincipal;
    
    private String tel01;
    private String tel02;
    private String what01;
    private String what02;
    private String whatsapp;
    
    private String emailPricipal;
    private String email01;
    
    private String obs;
    
    private String criacaoFornecedor;
    private String dataModificao;
    private String siteFornecedor;
    
    // endereco
    private String endereco;
    private String cep;
    private String complemento;
    private String cidade;
    private String bairro;
    private String uf; 
    
    //datas
    private String dataCriacao;
    private String dataAlteracao;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nomeEmpresa
     */
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    /**
     * @param nomeEmpresa the nomeEmpresa to set
     */
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    /**
     * @return the nomeFantasia
     */
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    /**
     * @param nomeFantasia the nomeFantasia to set
     */
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the representante
     */
    public String getRepresentante() {
        return representante;
    }

    /**
     * @param representante the representante to set
     */
    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    /**
     * @return the telPrincipal
     */
    public String getTelPrincipal() {
        return telPrincipal;
    }

    /**
     * @param telPrincipal the telPrincipal to set
     */
    public void setTelPrincipal(String telPrincipal) {
        this.telPrincipal = telPrincipal;
    }

    /**
     * @return the tel01
     */
    public String getTel01() {
        return tel01;
    }

    /**
     * @param tel01 the tel01 to set
     */
    public void setTel01(String tel01) {
        this.tel01 = tel01;
    }

    /**
     * @return the whatsapp
     */
    public String getWhatsapp() {
        return whatsapp;
    }

    /**
     * @param whatsapp the whatsapp to set
     */
    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    /**
     * @return the emailPricipal
     */
    public String getEmailPricipal() {
        return emailPricipal;
    }

    /**
     * @param emailPricipal the emailPricipal to set
     */
    public void setEmailPricipal(String emailPricipal) {
        this.emailPricipal = emailPricipal;
    }

    /**
     * @return the email01
     */
    public String getEmail01() {
        return email01;
    }

    /**
     * @param email01 the email01 to set
     */
    public void setEmail01(String email01) {
        this.email01 = email01;
    }

    /**
     * @return the criacaoFornecedor
     */
    public String getCriacaoFornecedor() {
        return criacaoFornecedor;
    }

    /**
     * @param criacaoFornecedor the criacaoFornecedor to set
     */
    public void setCriacaoFornecedor(String criacaoFornecedor) {
        this.criacaoFornecedor = criacaoFornecedor;
    }

    /**
     * @return the dataModificao
     */
    public String getDataModificao() {
        return dataModificao;
    }

    /**
     * @param dataModificao the dataModificao to set
     */
    public void setDataModificao(String dataModificao) {
        this.dataModificao = dataModificao;
    }

    /**
     * @return the siteFornecedor
     */
    public String getSiteFornecedor() {
        return siteFornecedor;
    }

    /**
     * @param siteFornecedor the siteFornecedor to set
     */
    public void setSiteFornecedor(String siteFornecedor) {
        this.siteFornecedor = siteFornecedor;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the uf
     */
    public String getUf() {
        return uf;
    }

    /**
     * @param uf the uf to set
     */
    public void setUf(String uf) {
        this.uf = uf;
    }

    /**
     * @return the dataCriacao
     */
    public String getDataCriacao() {
        return dataCriacao;
    }

    /**
     * @param dataCriacao the dataCriacao to set
     */
    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    /**
     * @return the dataAlteracao
     */
    public String getDataAlteracao() {
        return dataAlteracao;
    }

    /**
     * @param dataAlteracao the dataAlteracao to set
     */
    public void setDataAlteracao(String dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    /**
     * @return the tel02
     */
    public String getTel02() {
        return tel02;
    }

    /**
     * @param tel02 the tel02 to set
     */
    public void setTel02(String tel02) {
        this.tel02 = tel02;
    }

    /**
     * @return the what01
     */
    public String getWhat01() {
        return what01;
    }

    /**
     * @param what01 the what01 to set
     */
    public void setWhat01(String what01) {
        this.what01 = what01;
    }

    /**
     * @return the what02
     */
    public String getWhat02() {
        return what02;
    }

    /**
     * @param what02 the what02 to set
     */
    public void setWhat02(String what02) {
        this.what02 = what02;
    }

    /**
     * @return the obs
     */
    public String getObs() {
        return obs;
    }

    /**
     * @param obs the obs to set
     */
    public void setObs(String obs) {
        this.obs = obs;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}
