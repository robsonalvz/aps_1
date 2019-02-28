package aps;
import java.util.List;
import java.util.ArrayList;

public class Escalonador {
	private int quantum;
	private TabelaExecucao tabela;
	List<Processo> processos = new ArrayList<>();

	public int getQuantum() {
		return quantum;
	}

	public void setQuantum(int quantum) {
		this.quantum = quantum;
	}

	public void addProcesso(String nome, int inicio, int tempo) {
		Processo p = new Processo(nome,inicio,tempo);
		processos.add(p);
	}
	
	public TabelaExecucao rodar() {
		return this.tabela;
	}

	public String getTabelaRR() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	

}
