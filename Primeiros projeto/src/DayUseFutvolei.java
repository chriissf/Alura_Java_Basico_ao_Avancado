import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Jogador {
    String nome;
    int nivel;
    boolean aluno;

    Jogador(String nome, int nivel, boolean aluno) {
        this.nome = nome;
        this.nivel = nivel;
        this.aluno = aluno;
    }
}

public class DayUseFutvolei {

    private static final double PRECO_ALUNO = 20.0;
    private static final double PRECO_NAO_ALUNO = 25.0;
    private static final int HORARIO_FINAL = 18; // Horário limite para finalizar o day use

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Jogador> jogadores = new ArrayList<>();
        List<Jogador> professores = new ArrayList<>();
        List<Jogador> professoresDisponiveis = new ArrayList<>();
        int totalJogadores = 0;

        while (true) {
            System.out.print("Digite o nome do jogador (ou 'fim' para encerrar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Digite o nível do jogador (1 a 5): ");
            int nivel = scanner.nextInt();

            System.out.print("O jogador é aluno? (sim/não): ");
            String resposta = scanner.next().toLowerCase();
            boolean aluno = resposta.equals("sim");
            scanner.nextLine();  // Limpar o buffer

            Jogador jogador = new Jogador(nome, nivel, aluno);

            if (aluno) {
                jogadores.add(jogador);
            } else {
                professores.add(jogador);
                professoresDisponiveis.add(jogador);
            }

            totalJogadores++;
        }

        organizarPartidas(jogadores, professores, professoresDisponiveis, scanner);

        System.out.println("\nResumo do Day Use de Futvôlei:");
        System.out.println("Total de jogadores: " + totalJogadores);

        double totalArrecadado = calcularTotalArrecadado(jogadores);
        System.out.println("Total arrecadado: R$ " + totalArrecadado);

        scanner.close();
    }

    private static void organizarPartidas(List<Jogador> jogadores, List<Jogador> professores, List<Jogador> professoresDisponiveis, Scanner scanner) {
        while (!jogadores.isEmpty() && getHoraAtual() < HORARIO_FINAL) {
            Collections.shuffle(jogadores); // Embaralha a lista de jogadores

            List<Jogador> time1 = new ArrayList<>();
            List<Jogador> time2 = new ArrayList<>();

            for (int i = 0; i < Math.min(4, jogadores.size()); i++) {
                if (i % 2 == 0) {
                    time1.add(jogadores.get(i));
                } else {
                    time2.add(jogadores.get(i));
                }
            }

            exibirPartida(time1, time2);

            jogadores.removeAll(time1);
            jogadores.removeAll(time2);

            if (time1.size() < 2) {
                adicionarJogadorManual(time1, professores, professoresDisponiveis, scanner);
            }

            if (time2.size() < 2) {
                adicionarJogadorManual(time2, professores, professoresDisponiveis, scanner);
            }
        }

        if (getHoraAtual() >= HORARIO_FINAL) {
            System.out.println("Day use finalizado devido ao horário limite atingido: " + HORARIO_FINAL + " horas.");
        } else {
            System.out.println("Não há mais jogadores disponíveis para formar partidas.");
        }
    }

    private static void exibirPartida(List<Jogador> time1, List<Jogador> time2) {
        System.out.println("\nPartida formada:");
        exibirTime("Time 1", time1);
        exibirTime("Time 2", time2);
    }

    private static void exibirTime(String nomeTime, List<Jogador> time) {
        System.out.println(nomeTime + ":");
        for (Jogador jogador : time) {
            System.out.println(" - " + jogador.nome + " (Nível " + jogador.nivel + ")");
        }
    }

    private static void adicionarJogadorManual(List<Jogador> time, List<Jogador> professores, List<Jogador> professoresDisponiveis, Scanner scanner) {
        System.out.println("Faltam jogadores para o time. Deseja adicionar manualmente? (sim/não): ");
        String resposta = scanner.nextLine().toLowerCase();

        if (resposta.equals("sim")) {
            System.out.print("Digite o nome do jogador: ");
            String nome = scanner.nextLine();
            System.out.print("Digite o nível do jogador (1 a 5): ");
            int nivel = scanner.nextInt();
            System.out.print("O jogador é aluno? (sim/não): ");
            resposta = scanner.next().toLowerCase();
            boolean aluno = resposta.equals("sim");
            scanner.nextLine();  // Limpar o buffer

            Jogador jogador = new Jogador(nome, nivel, aluno);

            if (aluno) {
                time.add(jogador);
            } else {
                adicionarProfessorReserva(time, professores, professoresDisponiveis, jogador);
            }

            System.out.println("Jogador adicionado: " + jogador.nome);
        } else {
            adicionarProfessorReserva(time, professores, professoresDisponiveis, null);
        }
    }

    private static void adicionarProfessorReserva(List<Jogador> time, List<Jogador> professores, List<Jogador> professoresDisponiveis, Jogador jogadorAdicional) {
        if (jogadorAdicional != null) {
            time.add(jogadorAdicional);
            return;
        }

        if (!professoresDisponiveis.isEmpty()) {
            Jogador professor = professoresDisponiveis.get(0);
            System.out.println("Um professor foi adicionado à reserva: " + professor.nome);
            time.add(professor);
            professoresDisponiveis.remove(professor);
        } else {
            System.out.println("Não há mais professores disponíveis na reserva.");
        }
    }

    private static double calcularTotalArrecadado(List<Jogador> jogadores) {
        double totalArrecadado = 0;

        for (Jogador jogador : jogadores) {
            if (jogador.aluno) {
                double preco = jogador.aluno ? PRECO_ALUNO : PRECO_NAO_ALUNO;
                totalArrecadado += preco;
            }
        }

        return totalArrecadado;
    }

    private static int getHoraAtual() {
        // Simulação simples da obtenção da hora atual (substitua pela lógica real se necessário)
        return java.time.LocalTime.now().getHour();
    }
}
