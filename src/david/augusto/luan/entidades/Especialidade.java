package david.augusto.luan.entidades;

public class Especialidade {
	private String especialidade;
	private Medico medico;

	public Especialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

}
