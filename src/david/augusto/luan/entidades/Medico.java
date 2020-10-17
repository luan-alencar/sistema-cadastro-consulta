package david.augusto.luan.entidades;

public class Medico extends Usuario {
	private int nextRegistration = 0;

	private int idMedico;
	private int dataInscricao;
	private String nome;
	private Especialidade especialidade;

	public Medico(String nome, Especialidade especialidade) {
		super(nome);
		this.especialidade = especialidade;
		this.idMedico = nextRegistration;
		nextRegistration++;
	}
	
	public int getNextRegistration() {
		return nextRegistration;
	}

	public void setNextRegistration(int nextRegistration) {
		this.nextRegistration = nextRegistration;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
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
