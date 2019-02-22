package aps;

import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

import org.junit.Test;

public class EscalonadorTest {

	@Test
	public void test() {
		
		
		Escalonador escalonador = new Escalonador();
		escalonador.setQuantum(5);
		escalonador.addProcesso("P1",0,10);
		escalonador.addProcesso("P2",0,3);
		escalonador.addProcesso("P3",3,3);
		
		//segundo
		escalonador.addProcesso("P4",0,3);
		escalonador.addProcesso("P5",5,2);
		
		//terceiro
		escalonador.addProcesso("P6", 0, 1);
		escalonador.addProcesso("P7", 0, 2);
		escalonador.addProcesso("P8", 0, 4);
		escalonador.addProcesso("P9", 0, 6);
		escalonador.addProcesso("P10", 0, 8);
		escalonador.addProcesso("P11", 11, 8);
		escalonador.addProcesso("P12", 11, 6);
		escalonador.addProcesso("P13", 11, 4);
		escalonador.addProcesso("P14", 11, 2);
		escalonador.addProcesso("P15", 11, 1);
		
		TabelaExecucao tabela = escalonador.rodar();
			
			assertEquals(Estados.Executando, tabela.getStatus("P1",0));
			assertEquals(Estados.Executando, tabela.getStatus("P2",0));
			assertEquals(Estados.Executando, tabela.getStatus("P3",3));
			assertEquals(Estados.Executando, tabela.getStatus("P4",0));
			assertEquals(Estados.Executando, tabela.getStatus("P5",5));
			assertEquals(Estados.Executando, tabela.getStatus("P6",0));
			assertEquals(Estados.Executando, tabela.getStatus("P7",0));
			assertEquals(Estados.Executando, tabela.getStatus("P8",0));
			assertEquals(Estados.Executando, tabela.getStatus("P9",0));
			assertEquals(Estados.Executando, tabela.getStatus("P10",0));
			assertEquals(Estados.Executando, tabela.getStatus("P11",11));
			assertEquals(Estados.Executando, tabela.getStatus("P12",11));
			assertEquals(Estados.Executando, tabela.getStatus("P13",11));
			assertEquals(Estados.Executando, tabela.getStatus("P14",11));
			assertEquals(Estados.Executando, tabela.getStatus("P15",11));
			
			System.out.println("P1: RRRRRWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWRRRRR");
			System.out.println("P2: WWWWWRRR");
			System.out.println("P3:    WWWWWRRR");
			System.out.println("P4: WWWWWWWWWWWRRR");
			System.out.println("P5:      WWWWWWWWWRR");
			System.out.println("P6: WWWWWWWWWWWWWWWWR");
			System.out.println("P7: WWWWWWWWWWWWWWWWWRR");
			System.out.println("P8: WWWWWWWWWWWWWWWWWWWRRRR");
			System.out.println("P9: WWWWWWWWWWWWWWWWWWWWWWWRRRRRWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWR");
			System.out.println("P10:WWWWWWWWWWWWWWWWWWWWWWWWWWWWRRRRRWWWWWWWWWWWWWWWWWWWWWWWWWWRRR");
			System.out.println("P11:           WWWWWWWWWWWWWWWWWWWWWWRRRRRWWWWWWWWWWWWWWWWWWWWWWWWRRR");
			System.out.println("P12:           WWWWWWWWWWWWWWWWWWWWWWWWWWWRRRRRWWWWWWWWWWWWWWWWWWWWWWR");
			System.out.println("P13:           WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWRRRR");
			System.out.println("P14:           WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWRR");
			System.out.println("P15:           WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWR");
				
		}

}
