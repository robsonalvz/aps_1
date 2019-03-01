package aps;

import static aps.Estado.Executando;

import java.util.ArrayList;

public class TabelaExecucao {
	
	private ArrayList<Processo> processos = new ArrayList<Processo>();
	private Processo processo;
	
	
	public ArrayList<Processo> getProcessos() {
		return processos;
	}
	
	public boolean isProcessosRodando(){
		for (Processo p : this.processos){
			if (p.getStatus().equals(Estado.Executando)){
				return false;
			}
		}
		return true;
	}
	public boolean liberado(){
		for(int i = 0; i < this.processos.size(); i++){
			if(this.processos.contains(this.processo)){
				for(int k = 0; k < this.processos.size(); k++){
					if(this.processos.get(k).getStatus().equals(Executando)){
						return false;
					}else{
						return true;
					}
				}
			}
		}
		return true;
	}

	public void setProcessos(ArrayList<Processo> processos) {
		this.processos = processos;
	}
	public boolean processosFinalizados(){
		int qtd=0;
		for (Processo p: this.processos){
			if (p.getStatus().equals(Estado.Finalizado)){
				qtd++;
			}
		}
		if (qtd==processos.size()-1){
			return true;
		}
		return false;
		
	}

	public boolean processoExecutando(Processo p) {
		for (Processo processo : this.processos){
			if (p.getNome().equals(processo.getNome())){
				if (p.getStatus().equals(Estado.Executando)){
					return true;
				}
			}
		}
		return false;
	}

}