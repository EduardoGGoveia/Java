package tiposprimitivos;
import java.util.Scanner;
public class TiposPrimitivos {

    public static void main(String[] args) {
       /*   String nome = "Eduardo";
        *   float nota = 9.5f;
        *       System.out.println("A nota é: " + nota);
        *       System.out.printf("A nota de %s é %.2f \n", nome, nota);
        *       System.out.format("A nota de %s é %.2f \n", nome, nota);
        */
    Scanner sC = new Scanner(System.in);
            System.out.print("Digite o nome do aluno: ");
    String nome = sC.nextLine();
            System.out.print("Digite a nota do aluno: ");
    float nota = sC.nextFloat();
            System.out.format("A nota de %s é %.1f \n", nome, nota);
    
    }     
    
}
