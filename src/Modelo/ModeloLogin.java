package Modelo;

public class ModeloLogin {

	private String usuario;
	private  double senha;
	
	public ModeloLogin(String usuario2, double senhaConvertida) {
		this.setUsuario(usuario2);
		this.setSenha(senhaConvertida);
	}
	
	
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	
	
	public double getSenha() {
		return senha;
	}
	public void setSenha(double senha) {
		this.senha = senha;
	}
	
	
}
