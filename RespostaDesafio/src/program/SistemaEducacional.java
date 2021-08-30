package program;
import java.util.Scanner;
import desafio.Aluno;
import desafio.Turma;
import desafio.Prova;
public class SistemaEducacional {
	public static void main(String[] args) {
			Scanner sC = new Scanner(System.in);
				Turma inf;
				inf = new Turma();
				
				System.out.println("Insira as notas da primeira prova do primeiro aluno: ");
				Aluno aluno1Prova1 = new Aluno();
				//aluno1Prova1 = 0; 
				aluno1Prova1.prova1.notaParte1 = sC.nextDouble();
				aluno1Prova1.prova1.notaParte2= sC.nextDouble();
				//inf.aluno1.prova1.notaParte1 = sC.nextDouble();
				//inf.aluno1.prova1.notaParte2 = sC.nextDouble();
				System.out.println("Insira as notas da segunda prova do primeiro aluno: ");
				Aluno aluno1Prova2 = new Aluno();
				aluno1Prova2.prova2.notaParte1 = sC.nextDouble();
				aluno1Prova2.prova2.notaParte2 = sC.nextDouble();
				inf.aluno1.calcularMedia();
				System.out.println("Insira as notas da primeira prova do segundo aluno: ");
				Aluno aluno2Prova1 = new Aluno();
				aluno2Prova1.prova1.notaParte1 = sC.nextDouble();
				aluno2Prova1.prova1.notaParte2= sC.nextDouble();
				System.out.println("Insira as notas da segunda prova do segundo aluno: ");
				Aluno aluno2Prova2 = new Aluno();
				aluno2Prova2.prova2.notaParte1 = sC.nextDouble();
				aluno2Prova2.prova2.notaParte2= sC.nextDouble();
				inf.aluno2.calcularMedia();
				System.out.println("Insira as notas da primeira prova do terceiro aluno: ");
				Aluno aluno3Prova1 = new Aluno();
				aluno3Prova1.prova1.notaParte1 = sC.nextDouble();
				aluno3Prova1.prova1.notaParte2= sC.nextDouble();
				System.out.println("Insira as notas da segunda prova do terceiro aluno: ");
				Aluno aluno3Prova2 = new Aluno();
				aluno3Prova2.prova2.notaParte1 = sC.nextDouble();
				aluno3Prova2.prova2.notaParte2= sC.nextDouble();
				inf.aluno3.calcularMedia();
				System.out.println();
				System.out.printf("Média do Aluno 1 é: %.2f%n ", inf.aluno1.calcularMedia());
				System.out.println();
				System.out.printf("Média do Aluno 2 é: %.2f%n ", inf.aluno2.calcularMedia());
				System.out.println();
				System.out.printf("Média do Aluno 3 é: %.2f%n ", inf.aluno3.calcularMedia());
				System.out.println();
				System.out.printf("Média da turma é: %.2f%n ",inf.calcularMedia2());
			}
	}