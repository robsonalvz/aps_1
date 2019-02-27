package aps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Escalonador {
	private int quantum;
	private TabelaExecucao tabela = new TabelaExecucao();
	

	public int getQuantum() {
		return quantum;
	}

	public void setQuantum(int quantum) {
		this.quantum = quantum;
	}

	public void addProcesso(Processo processo) {
		if(this.tabela.liberado()){
			this.tabela.processos.add(processo);
		}	
	}
	
	public void removeProcesso(String nomeProcesso){
		for (int i = 0; i<this.tabela.processos.size(); i++){
			if(this.tabela.processos.get(i).equals(nomeProcesso)){
				this.tabela.processos.remove(this.tabela.processos.get(i));
			}
		}
	}
	
	public void mudarStatus (String nomeProcesso){
		for (int i = 0; i < this.tabela.processos.size(); i++){
			if(this.tabela.processos.get(i).equals(nomeProcesso)){
				int resta = this.tabela.processos.get(i).getDuracao() - this.quantum;
				if(resta > 0){
					this.tabela.processos.get(i).setStatus(Estados.Esperando);
				}
			}
		}
	}
	
	
	
	
	
	
	
	

}
