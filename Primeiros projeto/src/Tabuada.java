import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner numeroTabuada = new Scanner(System.in);
        System.out.println("""
                TABUADA:
                Informe um numero
                """);
        int numero = numeroTabuada.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            int resultado = i * numero;
            System.out.printf(" %d x %d = %d \n ",i,numero,resultado);

        }


    }
}
