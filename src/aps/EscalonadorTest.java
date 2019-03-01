package aps;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EscalonadorTest {

	
	/*Teste com 3 processos
	@Test
	public void testeTresProcessos() {
		Escalonador escalonador = new Escalonador(5);
		escalonador.addProcesso("P1",0,10);
		escalonador.addProcesso("P2",0,3);
		escalonador.addProcesso("P3",3,3);
		String tabela = escalonador.getTabelaRR();
		String tabelaTest = "RRRRRWWWWWWRRRRRF\n"+
		                    "WWWWWRRRF\n"+
				            "IIWWWWWWRRRF";

	/*Teste com 2 processos
	@Test
	public void testeDoisProcessosComTempoInexistente() {
		Escalonador escalonador = new Escalonador(3);
		escalonador.addProcesso("P4",0,3);
		escalonador.addProcesso("P5",5,2);
		String tabela = escalonador.getTabelaRR();
		String tabelaTest = "RRRF\n"
				+ "IIIIRRF";
		
		assertEquals(tabela,tabelaTest);
		
	}
	/*Teste com processos desordenados com quantum 2
	@Test
	public void testeQuatroProcessosDesordenados(){
		Escalonador escalonador = new Escalonador(2);
		escalonador.addProcesso("P1",1,2);
		escalonador.addProcesso("P2",0,1);
		escalonador.addProcesso("P3",5,5);	
		escalonador.addProcesso("P4",4,1);
		String tabela = escalonador.getTabelaRR();
		String tabelaTest = "IRRF\n"
				+ "RF\n"
				+ "IIIIIRRRRRF\n"
				+ "IIIIRF";
		assertEquals(tabela,tabelaTest);
	}
	@Test
	public void testeQuantumZero(){
		Escalonador escalonador = new Escalonador(0);
		escalonador.addProcesso("P1",0,2);
		assertEquals(0,escalonador.getQuantum());		
	}
	@Test
	public void testeQuantumNegativo(){
		Escalonador escalonador = new Escalonador(-1);
		escalonador.addProcesso("P1",0,2);
		assertEquals(0,escalonador.getQuantum());		
	}*/
	@Test
	public void testeProcessosSeguidos(){
		Escalonador escalonador = new Escalonador(3);
		escalonador.addProcesso("P1",0,3);
		escalonador.addProcesso("P2", 0,2);
		String tabela = escalonador.getTabelaRR();
		System.out.println(tabela);
		String tabelaTest = "RRRF\n"
				+ "WWWRRF";
		//assertEquals(tabela,tabelaTest);
		
	}
	

}
