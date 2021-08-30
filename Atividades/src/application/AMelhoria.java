package application;

import java.util.Scanner;
import entities.TrianguloMelhorado;

public class AMelhoria {

	public static void main(String[] args) {
		Scanner sC = new Scanner(System.in);
		
		TrianguloMelhorado x, y;
		x = new TrianguloMelhorado();
		y = new TrianguloMelhorado();
		
		System.out.println("Valores dos lados do Tri�ngulo");
		 x.a = sC.nextDouble();
		 x.b = sC.nextDouble();
		 x.c = sC.nextDouble();
		System.out.println("Valores dos lados do 2� Tri�ngulo");
		 y.a= sC.nextDouble();
		 y.b= sC.nextDouble();
		 y.c= sC.nextDouble();
		
		 double p = (x.a + x.b + x.c)/2;
		 double areaX = Math.sqrt(p*(p-x.a)*(p-x.b)*(p-x.c));
		 
		 		p = (y.a + y.b + y.c)/2;
		 double areaY = Math.sqrt(p*(p-y.a)*(p-y.b)*(p-y.c));
		 
		 System.out.printf(" Tri�ngulo X: %.4f%n", areaX);
		 System.out.println("");
		 System.out.printf(" Tri�ngulo Y: %.4f%n", areaY);
			
		 System.out.println("");
			
			if (areaX > areaY) {
				System.out.println("A area do tri�ngulo X � maior");
			}
			else {
				if( areaX == areaY ) {
					System.out.println("A area dos dois tri�ngulos s�o iguais");
					
				}
				else { 
					System.out.println(" A area do tri�ngulo Y � maior");
				}
			}
	}
	
}


