
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Esse é Screen Match");
        System.out.println("Filme: Top Gun:Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento:"+anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        //Media calculada pelos primeiros usuarios
        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme top Gun
                Filme aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """+anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);









    }
}