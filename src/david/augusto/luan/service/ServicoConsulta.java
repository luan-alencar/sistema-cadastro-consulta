package david.augusto.luan.service;

import static david.augusto.luan.utils.DataUtils.adicionarDias;

import java.util.Date;

import david.augusto.luan.entidades.*;

public class ServicoConsulta {

	public Consulta realizarConsulta(Paciente paciente, Medico medico) {
		Consulta consulta = new Consulta(paciente, medico, new Date());

		// retorno daqui 7 dias
		Date dataRetorno = new Date();
		dataRetorno = adicionarDias(dataRetorno, 7);

		return consulta;
	}

	public static void main(String[] args) {

		ServicoConsulta servico = new ServicoConsulta();
		Paciente p1 = new Paciente("Fulano", "12341234");
		Medico m1 = new Medico("Dr. Beltrado", new Especialidade("Oftamologista"));
		
		Consulta consulta = servico.realizarConsulta(p1, m1); 
	}
}
