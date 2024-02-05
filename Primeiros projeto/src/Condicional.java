public class Condicional {
    public static void main(String[] args) {
        int anoLancamento = 2021;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }
        if (incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.printf("Filme liberado");
        } else {
            System.out.println("Filme não está disponivel no plano virgente");
        }
    }
}

