package aps;

import static org.junit.Assert.*;

import org.junit.Test;

public class EscalonadorTest {

	@Test
	public void test() {
		
		
		Escalonador escalonador = new Escalonador();
		escalonador.setQuantum(5);
		escalonador.addProcesso("P1",0,10);
		escalonador.addProcesso("P2",0,3);
		escalonador.addProcesso("P1",3,3);
		
		//segundo
		escalonador.addProcesso("P1",0,3);
		escalonador.addProcesso("P1",5,2);
		
		
		
	}

}
