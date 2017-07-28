
package Modelo;

import java.time.format.DateTimeFormatter;


public class ModeloUsuarioSistema {
   
    private String usuario;
    private String senha;
    private String email;
    private int adm;
    private boolean admin;
    private String DataCriacao;
    private String DataAlateracao;

    
  

    public ModeloUsuarioSistema() {
          }
    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

  

  

    /**
     * @return the adm
     */
    public int isAdm() {
        return adm;
    }

    /**
     * @param adm the adm to set
     */
    public void setAdm(int adm) {
        this.adm = adm;
    }

    /**
     * @return the DataCriacao
     */
    public String getDataCriacao() {
        return DataCriacao;
    }

    /**
     * @param DataCriacao the DataCriacao to set
     */
    public void setDataCriacao(String DataCriacao) {
        this.DataCriacao = DataCriacao;
    }

    /**
     * @return the admin
     */
    public boolean isAdmin() {
        return admin;
    }

    /**
     * @param admin the admin to set
     */
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    /**
     * @return the DataAlateracao
     */
    public String getDataAlateracao() {
        return DataAlateracao;
    }

    /**
     * @param DataAlateracao the DataAlateracao to set
     */
    public void setDataAlateracao(String DataAlateracao) {
        this.DataAlateracao = DataAlateracao;
    }

 
    
}
