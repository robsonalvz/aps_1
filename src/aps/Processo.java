package aps;

public class Processo {
	String nomeProcesso;
	int tempoEspera;
	int tempoDeExecucao;
	int tempoInativo;
	int duracao;
	int momentoEntrada;
	int momentoSaida;
	int momentoDuracao;
	Estados estado;
	
	public Processo(String nomeProcesso, int tempoEspera, int tempoDeExecucao, int tempoInativo, int duracao, int momentoEntrada, int momentoSaida, int momentoDuracao, Estados estado) {
		
		this.nomeProcesso = nomeProcesso;
		this.tempoEspera = tempoEspera;
		this.tempoDeExecucao = tempoDeExecucao;
		this.tempoInativo = tempoInativo;
		this.duracao = duracao;
		this.momentoEntrada = momentoEntrada;
		this.momentoSaida = momentoSaida;
		this.momentoDuracao = momentoDuracao;
		this.estado = estado;
	}
	
	public Estados getEstado() {
		return estado;
	}

	public void setEstado(Estados estado) {
		this.estado = estado;
	}

	public int getTempoEspera() {
		return tempoEspera;
	}
	public void setTempoEspera(int tempoEspera) {
		this.tempoEspera = tempoEspera;
	}
	public int getTempoDeExecucao() {
		return tempoDeExecucao;
	}
	public void setTempoDeExecucao(int tempoDeExecucao) {
		this.tempoDeExecucao = tempoDeExecucao;
	}
	public int getTempoInativo() {
		return tempoInativo;
	}
	public void setTempoInativo(int tempoInativo) {
		this.tempoInativo = tempoInativo;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public int getMomentoEntrada() {
		return momentoEntrada;
	}
	public void setMomentoEntrada(int momentoEntrada) {
		this.momentoEntrada = momentoEntrada;
	}
	public int getMomentoSaida() {
		return momentoSaida;
	}
	public void setMomentoSaida(int momentoSaida) {
		this.momentoSaida = momentoSaida;
	}
	public int getMomentoDuracao() {
		return momentoDuracao;
	}
	public void setMomentoDuracao(int momentoDuracao) {
		this.momentoDuracao = momentoDuracao;
	}
	public String getNomeProcesso() {
		return nomeProcesso;
	}

	public void setNomeProcesso(String nomeProcesso) {
		this.nomeProcesso = nomeProcesso;
	}
	
	

}
