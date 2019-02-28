package aps;
import java.util.List;
import java.util.ArrayList;

public class Escalonador {

	
	private int quantum;
	private TabelaExecucao tabela = new TabelaExecucao();


	public Escalonador(int quantum){
		this.quantum = quantum;
	}
	public int getQuantum() {
		return quantum;
	}


	public void addProcesso(String nome, int inicio, int tempo) {		
		if(this.tabela.liberado()){
			Processo p = new Processo(nome,inicio,tempo, Estados.Inativo);
 			this.tabela.processos.add(p);
			p.setStatus(Estados.Executando);
		}	
	}
	
	public void removeProcesso(String nomeProcesso){
		for (int i = 0; i<this.tabela.processos.size(); i++){
			if(this.tabela.processos.get(i).getNome().equals(nomeProcesso)){
				this.tabela.processos.remove(this.tabela.processos.get(i));
			}
		}
	}

	public void mudarStatus (String nomeProcesso){
		for (int i = 0; i < this.tabela.processos.size(); i++){
			if(this.tabela.processos.get(i).getNome().equals(nomeProcesso)){
				int resta = this.tabela.processos.get(i).getDuracao() - this.quantum;
				if(resta > 0){
					
					this.tabela.processos.get(i).setStatus(Estados.Esperando);
				
				}else if(resta <= 0){			
					
					this.tabela.processos.get(i).setStatus(Estados.Finalizado);
				
				}else if(!(this.tabela.processos.contains(this.tabela.processos.get(i)))){
					
					this.tabela.processos.get(i).setStatus(Estados.Inativo);
				
				}
			}
		}
	}

	public void setQuantum(int i) {
		this.quantum = i;
		
	}


	public String getTabelaRR() {
		// TODO Auto-generated method stub
		return null;
	}
}
