import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        System.out.println(" FATORIAL ");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um numero Fatorial: ");
        int fatorial = entrada.nextInt();
        int resultado = 1;

        while (fatorial > 1) {
            resultado *= fatorial;
            System.out.printf("%d * %d = %d\n", fatorial, resultado / fatorial, resultado);
            fatorial--;
        }

        System.out.printf("O fatorial : %d\n", resultado);
        entrada.close();
    }
}
