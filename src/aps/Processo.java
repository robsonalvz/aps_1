package aps;

 public class Processo {
	private String nome;

	private int tempoExecucao;
	private int chegada;
	private Estados status;

 	public Processo(String nome, int chegada, int tempoExecucao, Estados status) {
		this.nome = nome;
		this.chegada = chegada;
		this.tempoExecucao = tempoExecucao;
		this.status = status;
	}

 	public Processo() {
		this.nome = null;
		this.chegada = 0;
		this.tempoExecucao = 0;		
		this.status = null;
	}

 	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTempoExecucao() {
		return tempoExecucao;
	}
	public void setTempoExecucao(int tempoExecucao) {
		this.tempoExecucao = tempoExecucao;
	}
	public int getChegada() {
		return chegada;
	}
	public void setChegada(int chegada) {
		this.chegada = chegada;
	}
	public Estados getStatus() {
		return status;
	}
	public void setStatus(Estados status) {
		this.status = status;
	}



 }
