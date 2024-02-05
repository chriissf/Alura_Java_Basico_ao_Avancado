import java.util.Scanner;

public class NumerosParImpar {
    public static void main(String[] args) {
        Scanner ParImpar = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int num = ParImpar.nextInt();

        if(num % 2 == 0){
            System.out.printf("O numero informado é par %d",num);
        }else {
            System.out.printf("O numero informado é impar %d",num);
        }
    }
}
