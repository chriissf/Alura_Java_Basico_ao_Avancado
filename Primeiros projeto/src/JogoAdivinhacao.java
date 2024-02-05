import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int tentativa = 0;


        while (tentativa < 5) {
            System.out.println("Digite um numero de 0 a 100 !");
            int numeroDigitado = leitura.nextInt();
            tentativa++;

            if (numeroDigitado == numeroAleatorio) {
                System.out.println("Parabens a sorte está do seu lado!");
                break;

            } else if (numeroDigitado < numeroAleatorio) {
                System.out.println("Desculpe o numero digitado está menor que o numero da sorte!" +
                        "tenta outra vez");
            } else {
                System.out.println("O numero digitado estar maior que o numero da sorte,");
            }
            if (tentativa == 5) {
                System.out.printf("Hum fim de jogo ,numero de tentativa excedida  o numero da sorte é %d! Jogar outra vez",numeroAleatorio);

            }

        }
    }


}

