package br.unicentro.acaddecomp;

public class Teste {
	private int x;
	private static int y;
	
	public void setX(int x){
		this.x = x;
	}
	
	public void printX(){
		System.out.println(x);
	}
	
	public static void setY(int y){
		Teste.y = y;
	}
	
	public void printY(){
		System.out.println(y);
	}
}
