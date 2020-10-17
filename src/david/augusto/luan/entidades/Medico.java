package david.augusto.luan.entidades;

public class Medico extends Usuario {
	private int idMedico;
	private int dataInscricao;
	private String nome;

	public Medico(int id, boolean ativo, String email, String senha) {
		super(id, ativo, email, senha);
	}

	public int getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(int idMedico) {
		this.idMedico = idMedico;
	}

	public int getDataInscricao() {
		return dataInscricao;
	}

	public void setDataInscricao(int dataInscricao) {
		this.dataInscricao = dataInscricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
