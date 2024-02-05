import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota =0 ;
        int totalDeNotas = 0;

        while (nota != -1){
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar ");
            nota = leitura.nextDouble();


           //se a nota for diferente de -1 ->ele soma a media e o tatol de notas
            if (nota == -1){
                break;
            }

            if (nota != -0) {

                mediaAvaliacao += nota;
                totalDeNotas++;
            }else{
                System.out.println("Digite uma nota valida");
            }
        }
        if (totalDeNotas > 0) {
            System.out.println("A media geral de valiações " + mediaAvaliacao / totalDeNotas);
        }else {
            System.out.println("Nenhuma avalição valida foi inserida !");
        }
    }
}