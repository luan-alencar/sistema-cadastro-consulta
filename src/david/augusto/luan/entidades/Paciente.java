package david.augusto.luan.entidades;

public class Paciente extends Usuario {
	private int nextRegistration = 0;

	private int idPaciente;
	private int dataNascimento;
	private String nome;
	private String cpf;

	public Paciente(String nome, String cpf) {
		super(nome, cpf);
		this.idPaciente = nextRegistration;
		nextRegistration++;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public int getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
