package aps;

public class Escalonador {

	
	private int quantum;
	private TabelaExecucao tabela = new TabelaExecucao();
//	private int contador;
	private int rodou = 0;


	public Escalonador(int quantum){
		this.quantum = quantum;
	}
	public int getQuantum() {
		return quantum;
	}


	public void addProcesso(String nome, int i, int k) {	
		Processo p = new Processo(nome,i,k);
		/*
		 * 
		 * if(this.tabela.liberado()){
		 * 
		 * this.tabela.processos.add(p); p.setStatus(Estados.Executando);
		 * p.adicionaStatusLinhaProcessos(Estados.R.toString()); } else {
		 * p.setStatus(Estados.Esperando);
		 * p.adicionaStatusLinhaProcessos(Estados.W.toString()); }
		 */
		this.tabela.processos.add(p);
	}
/*
	public void mudarStatus (Processo p){
		int resta = p.getTempoExecucao() - this.quantum;
		if (resta > 0) {
			p.setStatus(Estados.Esperando);
			p.adicionaStatusLinhaProcessos(Estados.W.toString());
			p.setRestante(resta);

		} else if (resta <= 0) {

			p.setStatus(Estados.Finalizado);
			p.adicionaStatusLinhaProcessos(Estados.F.toString());

		} else if (!(this.tabela.processos.contains(p))) {
			p.setStatus(Estados.Inativo);
			p.adicionaStatusLinhaProcessos(Estados.I.toString());

		}
	
	}
	
	public void setQuantum(int i) {
		this.quantum = i;
		
	}
	
	public void run() {
		int tempoMaximo =0 ;
			for (Processo p: this.tabela.processos) {
			tempoMaximo += p.getTempoExecucao();
		}
		
		for (int i=0;i<tempoMaximo;i++) {
			for (Processo p : this.tabela.processos) {
				
				if (p.getChegada()==i) {
					if (tabela.liberado()) {
						p.setStatus(Estados.Executando);
						p.adicionaStatusLinhaProcessos(Estados.R.toString());
					}
					else {
						p.setStatus(Estados.Esperando);
						p.adicionaStatusLinhaProcessos(Estados.W.toString());
					}
				}else if (p.getTempoExecucao()!=p.getRestante()){
					p.setStatus(Estados.Inativo);
					p.adicionaStatusLinhaProcessos(Estados.I.toString());
				}
				
				
				if (p.getTempoExecucao()<=quantum) {
					p.setStatus(Estados.Finalizado);
					p.adicionaStatusLinhaProcessos(Estados.F.toString());
					System.out.println("AAAAAAAAAAAAAAAAaaaa");
				}else if (p.getTempoExecucao() > quantum) {
					p.setTempoExecucao(p.getTempoExecucao()-quantum);
					p.setRestante(p.getTempoExecucao()-quantum);
					p.setStatus(Estados.Esperando);
					p.adicionaStatusLinhaProcessos(Estados.W.toString());
				}
				
			}
		}
	}
*/
	public String getTabelaRR() {
		run2();
		String resultado="";
		for (Processo p : this.tabela.processos) {
				
				resultado += p.getLinhaProcessos()+"\n";
		}
		return resultado;
	}
	
	public void run2() {
		
		int tempoMaximo =0 ;
		for (Processo p: this.tabela.processos) {
			tempoMaximo += p.getTempoExecucao();
		}
		
		for (int i=0;i<tempoMaximo+1;i++) { //     -          RODOU = 0  Q = 3  TE = 3
			for (Processo p : this.tabela.processos) {
					if(p.getRestante() < p.getTempoExecucao() && p.getRestante() < this.quantum) {
						if(tabela.liberado() || p.getStatus().equals(Estados.Executando)){
							p.setStatus(Estados.Executando);
							p.adicionaStatusLinhaProcessos(Estados.R.toString());
							p.setRestante(p.getRestante()+1);
						}else if(p.getChegada()==i) {
							p.setStatus(Estados.Esperando);
							p.adicionaStatusLinhaProcessos(Estados.W.toString());
							p.setChegada(p.getChegada()+1);
						}else {
							p.setStatus(Estados.Inativo);
							p.adicionaStatusLinhaProcessos(Estados.I.toString());
						}
					} else if(p.getRestante() == this.quantum && p.getRestante() < p.getTempoExecucao()) {
						p.setStatus(Estados.Esperando);
						p.adicionaStatusLinhaProcessos(Estados.W.toString());
						p.setChegada(p.getChegada()+1);
					}else {
						p.setStatus(Estados.Finalizado);
						p.adicionaStatusLinhaProcessos(Estados.F.toString());
					}
				}
			}
		
	}
}
