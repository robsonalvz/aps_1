package aps;

import java.util.ArrayList;
import java.util.Collections;

public class Processo {
	private String nome;
	
	private int tempoExecucao;
	private int chegada;
	private Estado status;
	private int restante;
	private ArrayList<String> linhaProcessos;

 	public Processo(String nome, int chegada, int tempoExecucao) {
		this.nome = nome;
		this.chegada = chegada;
		this.tempoExecucao = tempoExecucao;
		this.linhaProcessos=new ArrayList<>();
		this.restante = tempoExecucao;
		
	}

 	public Processo() {
		this.nome = null;
		this.chegada = 0;
		this.tempoExecucao = 0;		
		this.status = null;
		this.linhaProcessos= new ArrayList<>();
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
	public Estado getStatus() {
		return status;
	}
	public void setStatus(Estado status) {
		this.status = status;
	}

	public String getLinhaProcessos() {
		String resultado="";
		for (String s : linhaProcessos){
			resultado+=s;
		}
		return resultado;
	}

	public void adicionaStatusLinhaProcessos(String status) {
		linhaProcessos.add(status);
	}
	public int getTempoExecutando(){
		int qtd = Collections.frequency(linhaProcessos, "R");
		return qtd;
	}
	public boolean processoFinalizado(){
		int qtd = Collections.frequency(linhaProcessos, "F");
		if (qtd>0)return true;
		return false;
	}
	public int getRestante() {
		return restante;
	}
	public void restante(int quantum){
		this.restante -=quantum;
	}
	public void setRestante(int restante) {
		this.restante = restante;
	}




 }