/**
 * 
 */
package com.unab;

/**
 * @author Luis Zenteno
 *
 */
public class CalculadoraPOO {
	
	/*Atributos*/
	private int n1, n2;
	
	/*Constructores*/
	public CalculadoraPOO() {		
	}
	public CalculadoraPOO(int n1, int n2) {
		
		this.n1 = n1;
		this.n2 = n2;
	}
	//
	
	/* Metodos*/
	
	public int sumar() {
		
		return this.n1 + this.n2;
	}
	
	public int resta() {
		
		return this.n1 - this.n2;
	}
	
	public int mult() {
		
		return this.n1 * this.n2;
	}
	
	public int div() {
		
		return this.n1 / this.n2;
	}
	

	/**
	 * @return the n1
	 */
	public int getN1() {
		return n1;
	}
	
	/**
	 * @param n1 the n1 to set
	 */
	public void setN1(int n1) {
		this.n1 = n1;
	}
	
	/**
	 * @return the n2
	 */
	public int getN2(){
		return n2;
	}
	
	/**
	 * @param n2 the n2 to set
	 */
	public void setN2(int n2) {
		this.n2 = n2;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CalculadoraPOO calc1 = new CalculadoraPOO();
		calc1.setN1(10);
		calc1.setN2(2);
		
		System.out.println("Numero 1: " + calc1.getN1());
		System.out.println("Numero 2: " + calc1.getN2());
		
		System.out.println("Suma: " + calc1.sumar());
		System.out.println("Resta: " + calc1.resta());
		System.out.println("Multiplicacion: " +  calc1.mult());
		System.out.println("División: " + calc1.div());
		
		
		
		/*CalculadoraPOO calc = new CalculadoraPOO(11,132);
		
		System.out.println(calc.sumar());*/
	}
	

}
