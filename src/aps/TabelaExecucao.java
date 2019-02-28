package aps;

import static aps.Estados.Esperando;
import static aps.Estados.Executando;
import static aps.Estados.Inativo;

import java.util.ArrayList;

public class TabelaExecucao {
	
	public ArrayList<Processo> processos = new ArrayList<Processo>();
	private Processo processo;
	
	
	public ArrayList<Processo> getProcessos() {
		return processos;
	}
	
	public boolean liberado(){
		for(int i = 0; i < this.processos.size(); i++){
			if(this.processos.contains(processo)){
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



	public String getTabelaFinal() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
