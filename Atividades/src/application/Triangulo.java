package application;
import java.util.Scanner;
public class Triangulo {

	public static void main(String[] args) {
		Scanner sC = new Scanner(System.in);
		
		System.out.println("Valores dos lados do Triângulo");
		double xA = sC.nextDouble();
		double xB = sC.nextDouble();
		double xC = sC.nextDouble();
		System.out.println("Valores dos lados do 2º Triângulo");
		double yA = sC.nextDouble();
		double yB = sC.nextDouble();
		double yC = sC.nextDouble();
		
		double p = (xA+xB+xC)/2;
		double areaX = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));
		double areaY = Math.sqrt(p*(p-yA)*(p-yB)*(p-yC));
		
		System.out.printf(" Triângulo X: %.2f%n", areaX);
		System.out.println("");
		System.out.printf(" Triângulo Y:%.2f%n", areaY);
		
		System.out.println("");
		
		if (areaX > areaY) {
			System.out.println("A area do triângulo X é maior");
		}
		else {
			if( areaX == areaY ) {
				System.out.println("A area dos dois triângulos são iguais");
				
			}
			else { 
				System.out.println(" A area do triângulo Y é maior");
			}
		}
	
		
		
		sC.close();
			
			
		}
		
		
	}

