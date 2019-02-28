package aps;

public class Processo {
	
	String nome;
	int inicio;
	int tempoExecucao;
	Estados estados = Estados.Inativo;
	
	Processo(String nome,int inicio, int tempoExecucao){
		this.nome = nome;
		this.inicio = inicio;
		this.tempoExecucao = tempoExecucao;
		
	}

}
