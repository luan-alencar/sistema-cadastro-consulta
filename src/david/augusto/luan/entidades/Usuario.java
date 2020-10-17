package david.augusto.luan.entidades;

public abstract class Usuario {
	private int id;
	private boolean ativo;
	private String email;
	private String senha;

	public Usuario(int id, boolean ativo, String email, String senha) {
		this.id = id;
		this.ativo = ativo;
		this.email = email;
		this.senha = senha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
