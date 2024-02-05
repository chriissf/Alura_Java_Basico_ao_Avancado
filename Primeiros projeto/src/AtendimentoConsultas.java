import java.util.Scanner;

public class AtendimentoConsultas {
    public static void main(String[] args) {

        int totalConsultas = 0 ;
        int clinica = 0 ;
        int prontoAtendimento = 0;
        int consultaExames = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("""
    Digite o tipo de Consulta: 
    
    1- clinica
    2- Pronto atendimento
    3- Consultas e exames  ou
    0- para encerrrar"""

        );

        int tipoConsulta;

        do {
            System.out.println("Paciente " + (totalConsultas+1) +":");
            tipoConsulta = scanner.nextInt();

            switch (tipoConsulta){

                case 1:
                    clinica ++;
                    break;
                case 2:
                    prontoAtendimento ++;
                    break;
                case 3:
                    consultaExames ++;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Digite um tipo valido ");
                    continue;



            }
            totalConsultas ++;
        } while (tipoConsulta !=0 );


        System.out.println("Total de paciente atendido no dia: " + totalConsultas);
        System.out.println("Consultas clinicas: "+ clinica);
        System.out.println("Pronto atendimento: " + prontoAtendimento);
        System.out.println("Consultas e  exames: " + consultaExames);
    }

}
