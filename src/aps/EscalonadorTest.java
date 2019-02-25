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
			
			String TabelaPronta = tabela.getTabelaFinal();
			String tabelaTest = ("P1: RRRRRWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWRRRRR\n"+
					"P2: WWWWWRRR\n" +
					"P3:    WWWWWRRR\n" +
					"P4: WWWWWWWWWWWRRR\n" +
					"P5:      WWWWWWWWWRR\n" +
					"P6: WWWWWWWWWWWWWWWWR\n" +
					"P7: WWWWWWWWWWWWWWWWWRR\n" +
					"P8: WWWWWWWWWWWWWWWWWWWRRRR\n" +
					"P9: WWWWWWWWWWWWWWWWWWWWWWWRRRRRWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWR\n" +
					"P10:WWWWWWWWWWWWWWWWWWWWWWWWWWWWRRRRRWWWWWWWWWWWWWWWWWWWWWWWWWWRRR\n" +
					"P11:           WWWWWWWWWWWWWWWWWWWWWWRRRRRWWWWWWWWWWWWWWWWWWWWWWWWRRR\n" +
					"P12:           WWWWWWWWWWWWWWWWWWWWWWWWWWWRRRRRWWWWWWWWWWWWWWWWWWWWWWR\n" +
					"P13:           WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWRRRR\n" +
					"P14:           WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWRR\n" +
					"P15:           WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWR");
			
			assertEquals(TabelaPronta,tabelaTest);
			
			
				
		}

}
