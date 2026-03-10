
package calcularmedia;
import java.util.Scanner;
public class CalcularMedia {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.printf("%s\n","Nome do aluno:");
        String nomeAluno = entrada.nextLine();
        
        System.out.printf("%s\n","Nota 1");
        double nota1 = entrada.nextDouble();
        System.out.printf("%s\n","Nota 2");
        double nota2 = entrada.nextDouble();
        System.out.printf("%s\n","Nota 3");
        double nota3 = entrada.nextDouble();
        System.out.printf("%s\n","Nota 4");
        double nota4 = entrada.nextDouble();
        
        double media = (nota1 + nota2 + nota3 + nota4)/4;
        
        System.out.printf("%s %s %f.\n",nomeAluno,"sua média foi",media);
    }
    
}
