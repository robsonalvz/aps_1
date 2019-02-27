package aps;


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
			processo.setStatus(Estados.Executando);
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
	
	
	
	
	
	
	
	

}
