package aps;

import static aps.Estados.Esperando;
import static aps.Estados.Executando;
import static aps.Estados.Inativo;

public class TabelaExecucao {
	
	
	public Estados getStatus(String processo, int posicao) {
		
		return Executando;
		
	}

	public String getTabelaFinal() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
