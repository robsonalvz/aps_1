
package aps;

public class Escalonador {

	private int quantum;
	private TabelaExecucao tabela = new TabelaExecucao();

	public Escalonador(int quantum) {
		this.quantum = quantum;
	}

	public int getQuantum() {
		return quantum;
	}

	public void addProcesso(String nome, int chegada, int tempoExecucao) {
		Processo p = new Processo(nome, chegada, tempoExecucao);
		p.setStatus(Estado.Inativo);
		this.tabela.processos.add(p);
	}

	public void setQuantum(int i) {
		this.quantum = i;

	}

	public void rodarProcessos() {
		int tempoMaximo = 0;
		for (Processo p : this.tabela.processos)
			tempoMaximo += p.getTempoExecucao();
		for (int i = 0; i < tempoMaximo; i++) {
			for (Processo p : this.tabela.processos) {

				if (p.getTempoExecutando() == p.getTempoExecucao()) {
					if (p.processoFinalizado()) {
						continue;
					} else {
						p.setStatus(Estado.Finalizado);
						p.adicionaStatusLinhaProcessos(Estado.F.toString());
						continue;
					}
				} else if (p.getRestante() == quantum && tabela.processoExecutando(p)) {
					if (tabela.processosFinalizados()){
						p.setStatus(Estado.Executando);
						p.adicionaStatusLinhaProcessos(Estado.R.toString());
						continue;
					}else{
						p.setStatus(Estado.Esperando);
						p.adicionaStatusLinhaProcessos(Estado.W.toString());
						continue;
					}
					
				}
				if (p.getChegada() == i || p.getStatus().equals(Estado.Esperando) || tabela.processoExecutando(p)) {
					if (tabela.liberado() && tabela.liberado2() || tabela.processoExecutando(p)) {
				
							p.setStatus(Estado.Executando);
							p.restante(1);
							p.adicionaStatusLinhaProcessos(Estado.R.toString());
							
							
							if (p.getTempoExecutando() == p.getTempoExecucao()) {
									p.setStatus(Estado.Finalizado);
									p.adicionaStatusLinhaProcessos(Estado.F.toString());
								
							}
					} else {
						p.setStatus(Estado.Esperando);
						p.adicionaStatusLinhaProcessos(Estado.W.toString());
					}
				} else {
					if (tabela.liberado()) {

						tempoMaximo++;
					}
					p.setStatus(Estado.Inativo);
					p.adicionaStatusLinhaProcessos(Estado.I.toString());
				}

			}
		}
	}



	public String getTabelaRR() {
		rodarProcessos();
		String resultado = "";
		for (Processo p : this.tabela.processos) {

			resultado += p.getLinhaProcessos() + "\n";
		}
		return resultado;
	}
}