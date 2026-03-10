package calculadora;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int entradaCalc;
        Scanner entrada=new Scanner(System.in);
        do{
            System.out.println("\n\n\n*********************************************************************************************************************************************");
            System.out.println("\t\tCalculadora ");
            System.out.println("\t1.Adição ");
            System.out.println("\t2.Subtração ");
            System.out.println("\t3.Multiplicação ");
            System.out.println("\t4.Divisão ");
            System.out.println("\t0.Sair ");
            System.out.printf("*********************************************************************************************************************************************%n");
            System.out.println("\nInsira sua opção ");
            entradaCalc = entrada.nextInt();
            
            if(entradaCalc == 1){ //Adicao
                double num1, num2, result;
                System.out.println("\tCalculadora > Adição ");
                System.out.println("\t\t__ + 0 ");
                num1 = entrada.nextFloat();
                System.out.println("\t\t" + num1 + " + __ ");
                num2 = entrada.nextFloat();
                result = num1 + num2;
                System.out.println("   Resultado: " + num1 + " + " + num2 + " = " + result);
            }else if(entradaCalc == 2){ //Subtracao
                double num1, num2, result;
                System.out.println("\tCalculadora > Subtração ");
                System.out.println("\t\t__ - 0 ");
                num1 = entrada.nextFloat();
                System.out.println("\t\t" + num1 + " - __ ");
                num2 = entrada.nextFloat();
                result = num1 - num2;
                System.out.println("   Resultado: " + num1 + " - " + num2 + " = " + result);
            }else if(entradaCalc == 3){ // Multiplicacao
                double num1, num2, result;
                System.out.println("\tCalculadora > Multiplicação ");
                System.out.println("\t\t__ * 0 ");
                num1 = entrada.nextFloat();
                System.out.println("\t\t" + num1 + " * __ ");
                num2 = entrada.nextFloat();
                result = num1 * num2;
                System.out.println("   Resultado: " + num1 + " * " + num2 + " = " + result);
            }else if(entradaCalc == 4){ // Divisão
                double num1, num2, result;
                System.out.println("\tCalculadora > Divisão ");
                System.out.println("\t\t__ / 0 ");
                num1 = entrada.nextFloat();
                System.out.println("\t\t" + num1 + " / __ ");
                num2 = entrada.nextFloat();
                if(num2 == 0){
                    System.out.println("Erro: Não é possivel dividir por zero.");
                }else{
                    result = num1 / num2;
                System.out.println("   Resultado: " + num1 + " / " + num2 + " = " + result);
                }
            }
        }while(entradaCalc != 0);
        System.out.println("Programa Finalizado");
        System.out.printf("*********************************************************************************************************************************************%n");
    }
}