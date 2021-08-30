package esfera;
public class Esfera {
	private static final double PI = 3.14159;
	public double valor;
	public double circunferencia() {
		double c = (2*PI*valor);
		return c;	
	}
	public double volume() {
		double v = (4*PI*Math.pow(valor,3))/3;
		return v;
	}
}
