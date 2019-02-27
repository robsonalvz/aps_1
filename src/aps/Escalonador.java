package aps;

import java.util.ArrayList;
import java.util.List;
 
public class Escalonador {
	private int quantum;
	private ArrayList<Processo> processos = new ArrayList<Processo>();
	private Processo processo;
	
	public int getQuantum() {
		return quantum;
	}


	public void addProcesso(Processo processo) {
		
		this.processos.add(processo);
			
	}
	
	public void removeProcesso(Processo processo) {
		this.processos.remove(processo);
	}
	
	public Estados estadoDoProcesso() {
		return this.processo.estado;
	}

	public String getTabelaRR() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
