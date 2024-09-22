package br.com.bdam;

public class CalculoMedia {

	private double n1;
	private double n2;
	private double n3;
	private double n4;
	
	public void media(double n1, double n2, double n3, double n4) {
		double media = (n1 + n2 + n3 + n4) / 4;
		
		System.out.print("A média é de: " + media);
	}

}
