package aps;

import static aps.Estado.Executando;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class TabelaExecucao {
	
	public ArrayList<Processo> processos = new ArrayList<Processo>();
	private Processo processo;
	
	
	public ArrayList<Processo> getProcessos() {
		Comparator<Processo> compareByChegada = (Processo o1, Processo o2) -> ((Integer)o1.getChegada()).compareTo((Integer) o2.getChegada());
		Collections.sort(processos,compareByChegada);
		return processos;
	}
	
	public Estado getStatus(String processo, int posicao) {
		return Executando;
	}

	
	public boolean liberado2(){
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


	public void ordenarProcessos(){
		
	}
	public void setProcessos(ArrayList<Processo> processos) {
		this.processos = processos;
	}

	public String getTabelaFinal() {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean processosFinalizados(){
		int qtd = Collections.frequency(processos, Estado.Finalizado );
		if (qtd==processos.size()-1){
			return true;
		}
		return false;
		
	}
	public int getTamanhoTabela() {
		return this.processos.size();
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
