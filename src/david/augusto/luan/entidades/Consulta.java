package david.augusto.luan.entidades;

import java.util.Date;

public class Consulta {
	private Paciente paciente;
	private Medico medico;
	private Date dataConsulta;
	private Date dataRetorno;

	public Consulta(Paciente paciente, Medico medico, Date dataConsulta) {
		this.paciente = paciente;
		this.medico = medico;
		this.dataConsulta = dataConsulta;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Date getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public Date getDataRetorno() {
		return dataRetorno;
	}

	public void setDataRetorno(Date dataRetorno) {
		this.dataRetorno = dataRetorno;
	}
	
	

}
