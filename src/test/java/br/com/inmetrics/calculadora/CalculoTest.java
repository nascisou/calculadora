package br.com.inmetrics.calculadora;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalculoTest {
	Operacoes operacoes = new Operacoes();
	
	@Before
	public void header(){
		System.out.println("Calculadora Inmetrics");
	}
	
	@Test(timeout = 300)
	//public void calcular() throws InterruptedException{
	public void calcular(){
		double a = 3.0;
		double b = 4.0;
	//	boolean hasvalue = false;
		String valor = null;
	//Thread.sleep(200);
		
		double resultado = operacoes.somar(a, b);
		System.out.println("Operação: " + a + "+" + b + "=" + resultado);
		//Assert.assertEquals(7.0, resultado, 0);
		//Assert.assertFalse(hasvalue);
		
		Assert.assertNotNull(valor);
		
	}
	
	@After
	public void finalize(){
		System.out.println("Esa calculadora foi criada por especialistas");
	}
}
