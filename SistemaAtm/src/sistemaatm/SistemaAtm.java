package sistemaatm;
import java.util.Scanner;

public class SistemaAtm {
    public static void main(String[] args) {
        int opcaoAtm;
        Scanner entrada=new Scanner(System.in);
        do{
            System.out.println("\n\n\n\n*********************************************************************************************************************************************");
            System.out.println("\t\tMenu de opções ");
            System.out.println("\t1.Consultar saldo conta corrente ");
            System.out.println("\t2.Consultar saldo poupança ");
            System.out.println("\t3.Consultar saldo aplicação ");
            System.out.println("\t4.Fazer transferência de valor ");
            System.out.println("\t5.Fazer depósito?");
            System.out.println("\t0.Sair ");
            System.out.printf("*********************************************************************************************************************************************%n");
            System.out.println("\nInsira sua opção ");
            opcaoAtm = entrada.nextInt();
            
            if(opcaoAtm == 1){
                System.out.println("\tConsultar saldo conta corrente ");
            }else if(opcaoAtm == 2){
                System.out.println("\tConsultar saldo poupança ");
            }else if(opcaoAtm == 3){
                System.out.println("\tConsultar saldo aplicação ");
            }else if(opcaoAtm == 4){
                System.out.println("\tFazer transferência de valor ");
            }else if(opcaoAtm == 5){
                System.out.println("\tFazer depósito ");
            }
        }while(opcaoAtm != 0);
        System.out.println("Programa Finalizado");
        System.out.printf("*********************************************************************************************************************************************%n");
    }
}