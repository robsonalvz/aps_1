package aps;

import static aps.Estados.Esperando;
import static aps.Estados.Executando;
import static aps.Estados.Inativo;

public class TabelaExecucao {
	
	
	
	public Estados getStatus(String processo, int posicao) {
		
		return Executando;
		/*for(int k = 0; k<62; k++) {
		
		if(processo == "P1") {
			
			if(k > 0 && k < 5 || k > 49 && k < 55) {
				return Executando;
			
			}else if(k > 4 && k < 50) {
				return Esperando;
				
			}else {
				return Inativo;
			}
		
		}else if(processo == "P2") {
			
			if(k > 4 && k < 8) {
				return Executando;
			
			}else if(k < 5){
				return Esperando;
			
			}else {
				return Inativo;
			}
			
		}else if(processo == "P3") {
			
		}else if(processo == "P4") {
			
		}else if(processo == "P5") {
			
		}else if(processo == "P6") {
			
		}else if(processo == "P7") {
			
		}else if(processo == "P8") {
			
		}else if(processo == "P9") {
			
		}else if(processo == "P10") {
			
		}else if(processo == "P11") {
			
		}else if(processo == "P12") {
			
		}else if(processo == "P13") {
			
		}else if(processo == "P14") {
			
		}else if(processo == "P15") {
			
		}
		
	}
		
		
		return estados.Executando;*/
	}
	
	
}
