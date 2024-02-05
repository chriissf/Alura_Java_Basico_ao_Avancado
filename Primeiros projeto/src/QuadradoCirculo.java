import java.util.Scanner;

public class QuadradoCirculo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("""
                DIGITE UMA DA OPÇÃOES ABAIXO:
                
                1. Calcular área do quadrado
                2. Calcular área do círculo
                
                """);
        int opcao = entrada.nextInt();
        switch (opcao){
            case 1 :
                System.out.println("Digite o lado do quadrado");
                double lado =  entrada.nextDouble();
                double areaQuadrado = lado *lado;
                System.out.println("Areia do quadrado: " + areaQuadrado);
                break;
            case 2 :
                System.out.println("Digite o raio do Circulo");
                double raio =  entrada.nextDouble();
                double areaCirculo = Math.PI * Math.pow(raio,2);
                System.out.printf("A area do circulo : %.2f",areaCirculo);
                break;

            default:
                System.out.println("Opção invalida");
                break;
        }

    }
}
