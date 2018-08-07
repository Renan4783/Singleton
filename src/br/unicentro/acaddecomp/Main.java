package br.unicentro.acaddecomp;

public class Main {
	public static void main(String args[]){
		Teste t1 = new Teste();
		Teste t2 = new Teste();
		//Teste2 t3 = new Teste2();
		t1.setX(10);
		t2.setX(20);
		
		t1.printX();
		t2.printX();
		
		t1.setY(5);
		t2.setY(0);
		
		t1.printY();
		t2.printY();
		
		Teste2 tt = Teste2.getInstancia();
		tt.f();
	}
}
