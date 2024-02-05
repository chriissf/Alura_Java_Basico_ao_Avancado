import java.util.Scanner;

public class ComparaçãoMaiorMenor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero inteiro ");
        int num1 = entrada.nextInt();

        System.out.println("Digite o segundo numero inteiro ");
        int num2 = entrada.nextInt();

        if (num1 > num2){

            System.out.printf("O primeiro numero digitado é maior que o primeiro %d",num1);

        }else {
            System.out.printf("O segundo numero digitado é o mair %d",num2);
        }
    }
}
