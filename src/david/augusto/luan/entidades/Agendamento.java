package david.augusto.luan.entidades;

import java.util.Calendar;
import java.util.Date;

public class Agendamento {
	private Date dataConsulta;
	private Especialidade especialidade;
	private Calendar diaHora;

	public Agendamento(Date dataConsulta, Especialidade especialidade, Calendar diaHora) {
		this.dataConsulta = dataConsulta;
		this.especialidade = especialidade;
		this.diaHora = diaHora;
	}

	public Date getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

	public Calendar getDiaHora() {
		return diaHora;
	}

	public void setDiaHora(Calendar diaHora) {
		this.diaHora = diaHora;
	}

}
