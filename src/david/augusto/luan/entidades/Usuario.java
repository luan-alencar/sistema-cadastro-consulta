package david.augusto.luan.entidades;

public abstract class Usuario {

	private String nome;
	private String cpf;

	public Usuario(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	
	public Usuario(String nome) {
		this.nome = nome;
	}

	public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}

	public String getcpf() {
		return cpf;
	}

	public void setcpf(String cpf) {
		this.cpf = cpf;
	}

}
