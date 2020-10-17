package david.augusto.luan.entidades;

public class Especialidade {
	private String especialidade;
	private Medico medico;

	public Especialidade(String especialidade, Medico medico) {
		this.especialidade = especialidade;
		this.medico = medico;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

}
