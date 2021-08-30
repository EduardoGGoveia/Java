package entities;

public class Conta {
 
private int NumerodaConta;
private String NomedaConta;
private double SaldodaConta;

	public Conta() {
	}

	public Conta(int numerodaConta, String nomedaConta) {
		this.NumerodaConta = numerodaConta;
		this.NomedaConta = nomedaConta;
	}

	public Conta(int numerodaConta, String nomedaConta, double saldodaConta) {
		this.NumerodaConta = numerodaConta;
		this.NomedaConta = nomedaConta;
		this.deposito(saldodaConta);
	}

				public int getNumerodaConta() {
					return NumerodaConta;
	}


				public String getNomedaConta() {
					return NomedaConta;
	}

				public void setNomedaConta(String nomedaConta) {
					this.NomedaConta= nomedaConta;
	}

				public double getSaldodaConta() {
					return SaldodaConta;
	}


		public void deposito(double valorDeposito) {
			this.SaldodaConta += valorDeposito;
	}
	
		public void saque (double valorSaque) {
			this.SaldodaConta -= (valorSaque + 5);	
	}

	@Override
	public String toString() {
		return "Informações da conta: " 
				+ "Numero da conta: "
				+ NumerodaConta 
				+ ", Nome do usuário da conta: " 
				+ NomedaConta 
				+ ", Saldo atual: "
				+ String.format("%.2f", SaldodaConta);
	}

	
	
} 
