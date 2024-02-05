import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("informe um numero");
        int num = entrada.nextInt();

        if (num > 0) {
            System.out.printf("o numero digitado é %d positivo",num);
        } if (num < 0) {
            System.out.printf("o numero digitado é negativo %d",num);

        } else if (num == 0) {
            System.out.println("Digite um numero valido que não seja 0 (Neutro)");
        }

        }

    }

