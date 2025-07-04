import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Professor[] prof = new Professor[6]; // criação do vetor de professores com 6 posições
        prof[0] = new Professor("Carol", "Mestre", 456);// armazenamento dos professores em um vetor
        prof[1] = new Professor("Pedro", "Doutor", 789);
        prof[2] = new Professor("Paulo", "Mestre", 125);
        prof[3] = new Professor("Mário", "Doutor", 308);
        prof[4] = new Professor("Júlia", "Mestre", 908);
        prof[5] = new Professor("Chico", "Mestre", 129);

        Disciplina[] disciplina = new Disciplina[3]; // criação do vetor com 3 disciplinas
        disciplina[0] = new Disciplina("POO", "Fundamentos de Programação ", 4); // armazenamento das 3 disciplinas no
                                                                                 // vetor
        disciplina[1] = new Disciplina("ALEST I", "Fundamentos de Programação ", 4);
        disciplina[2] = new Disciplina("Banco de Dados I", "Sem requisitos     ", 4);

        Turma[] turmas = new Turma[6]; // criação do vetor de turmas com 6 turmas
        turmas[0] = new Turma("Segunda-feira e Quarta-feira", "JK", 20, disciplina[0], prof[0]); // armazenamento das
                                                                                                 // turmas com dados dos
                                                                                                 // vetores anteriores
        turmas[1] = new Turma("Terça-feira e Quinta-feira", "LM", 30, disciplina[0], prof[1]);
        turmas[2] = new Turma("Quarta-feira e Sexta-feira", "NP", 60, disciplina[1], prof[2]);
        turmas[3] = new Turma("Terça-feira e Quinta-feira", "JK", 45, disciplina[1], prof[3]);
        turmas[4] = new Turma("Quarta-feira e Sexta-feira", "LM", 25, disciplina[2], prof[4]);
        turmas[5] = new Turma("Quinta-feira e Sexta-feira", "NP", 30, disciplina[2], prof[5]);

        String[][] tabela = new String[4][6]; // criação da matriz da grade de horarios

        String op;
        do {
            System.out.println(
                    "\nEscolha uma opção digitando seu respectivo número:\n" +
                            "1 - Programação Orientada a Objetos\n" +
                            "2 - Algoritmos e Estrutura de Dados I\n" +
                            "3 - Banco de Dados\n" +
                            "4 - Ver média de alunos por turma\n" +
                            "5 - Ver menor turma do semestre\n" +
                            "6 - Listar professores\n" +
                            "7 - Listar disciplinas\n" +
                            "8 - Ver grade de horários\n");
            op = sc.next();
            switch (op) { // switch case para o menu principal das funcionalidades
                case "1":
                    Turma.mostrarTurmasPoo(turmas, sc, tabela);
                    break;
                case "2":
                    Turma.mostrarTurmasAlg(turmas, sc, tabela);
                    break;
                case "3":
                    Turma.mostrarTurmasBdd(turmas, sc, tabela);
                    break;
                case "4":
                    double media = Turma.mediaQtdAlunos(turmas);
                    System.out.println("A média da quantidade de alunos é " + media);
                    break;
                case "5":
                    Turma menor = Turma.buscarMenorTurma(turmas);
                    System.out.println("A menor turma é " + menor.getDisciplina().getNome() + " da professora "
                            + menor.getProfessor().getNome() + ", com " + menor.getQuantAlunos() + " alunos");
                    break;
                case "6":
                    Professor.listarProfessores(prof);
                    break;
                case "7":
                    Disciplina.listarDisciplinas(disciplina);
                    break;
                case "8":
                    System.out.println("Ver grade de horarios");
                    Tabela.imprimirTabela(tabela);
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
            // opção para o usuário continuar ou terminar o programa
            System.out.println(
                    "\n☞ Digite 1 se quer continuar ou qualquer outra tecla para encerrar e ver a sua grade de horários.");
        } while (sc.next().equals("1"));

        // mostra a grade de horários na tela
        Tabela.imprimirTabela(tabela);

        sc.close();
    }
}