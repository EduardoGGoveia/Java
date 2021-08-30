package program;

import java.util.Locale;
import java.util.Scanner;
import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sC = new Scanner(System.in);
		Conta conta;
		
		System.out.println("Insira o numero da conta: ");
		int numerodaConta = sC.nextInt();
		
		System.out.println("Insira o nome do titular da conta: ");
		sC.next();
		String nomedaConta = sC.next();
		
		System.out.println("Deseja fazer um deposito inicial? (y = Sim/n = Não): ");
		char resposta = sC.next().charAt(0);
		
		if (resposta == 'y') {
			System.out.println("Insira o valor do deposito inicial: ");
			double saldodaConta = sC.nextDouble();
			conta = new Conta(numerodaConta, nomedaConta, saldodaConta);
			System.out.println("Conta criada! " );
			System.out.println(conta);
			System.out.println();
		} else {
			conta = new Conta(numerodaConta, nomedaConta);
			System.out.println("Conta criada! " );
			System.out.println(conta);
			System.out.println();
		}
		System.out.println("Escolha sua próxima ação: ");
		System.out.println("Digite '1' para depósito; ");
		System.out.println("Digite '2' para saque; ");
		System.out.println("Digite '0' para sair: ");
		int k = 10;
		int l = 1;
		while (l <= k) {
		
		int i = sC.nextInt();
		
		switch (i) {
		case 1: 
			System.out.println("Insira o valor que deseja depositar: ");
			conta.deposito(sC.nextDouble());
			System.out.println("Conta atualizada: ");
			System.out.println(conta);
			k = k + 1;
			System.out.println("Escolha sua próxima ação: ");
			System.out.println("Digite '1' para depósito; ");
			System.out.println("Digite '2' para saque; ");
			System.out.println("Digite '0' para sair: ");
			break;
		case 2:  
			System.out.println("Insira o valor que deseja sacar: ");
			conta.saque(sC.nextDouble());
			System.out.println();
			System.out.println("Conta atualizada: ");
			System.out.println(conta);
			k = k + 1;
			System.out.println();
			System.out.println("Escolha sua próxima ação: ");
			System.out.println("Digite '1' para depósito; ");
			System.out.println("Digite '2' para saque; ");
			System.out.println("Digite '0' para sair: ");
			System.out.println();
			break;
		case 0:  
			System.out.println();
			System.out.println("Obrigado!");
			l = l + 100;
			break;
		default:
			System.out.println("Insira um número válido: ");
			k = k + 1;
			System.out.println();
			break;
		}
	}
		sC.close();	

	}
}
