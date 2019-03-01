package aps;

import java.util.ArrayList;

public class Processo {
	private String nome;

	private int tempoExecucao;
	private int chegada;
	private Estados status;
	private int restante;
	private ArrayList<String> linhaProcessos;

 	public Processo(String nome, int chegada, int tempoExecucao) {
		this.nome = nome;
		this.chegada = chegada;
		this.tempoExecucao = tempoExecucao;
		int restante = 0;
		this.linhaProcessos = new ArrayList<>();
		
	}

 	public Processo() {
		this.nome = null;
		this.chegada = 0;
		this.tempoExecucao = 0;		
		this.status = null;
		int restante = 0;
		this.linhaProcessos = new ArrayList<>();
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

	public ArrayList<String> getLinhaProcessos() {
		return linhaProcessos;
	}

	public void adicionaStatusLinhaProcessos(String status) {
		linhaProcessos.add(status);
	}

	public int getRestante() {
		return restante;
	}

	public void setRestante(int restante) {
		this.restante = restante;
	}



 }

