package aps;

 public class Processo {
	private String nome;
	private int duracao;
	private int tempoExecucao;
	private int chegada;
	private Estados status;

 	public Processo(String nome, int duracao, Estados status) {
		this.nome = nome;
		this.duracao = duracao;
		this.status = status;
	}

 	public Processo() {
		this.nome = null;
		this.duracao = 0;
		this.tempoExecucao = 0;
		this.chegada = 0;
		this.status = null;
	}

 	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
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