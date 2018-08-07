package br.unicentro.acaddecomp;

public class Teste2 {
	
	private static Teste2 instancia = new Teste2();
	
	private Teste2(){
		
	}
	
	public void f(){
		System.out.println("Oi");
	}
	
	public static Teste2 getInstancia(){
		return instancia;
	}
	
}
