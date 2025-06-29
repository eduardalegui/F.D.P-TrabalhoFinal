import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Professor[] prof = new Professor[6]; 
        prof[0] = new Professor("Carol", "Mestre", 456);
        prof[1] = new Professor("Pedro", "Doutor", 789);
        prof[2] = new Professor("Paulo", "Mestre", 125);
        prof[3] = new Professor("Mário", "Doutor", 308);
        prof[4] = new Professor("Júlia", "Mestre", 908); 
        prof[5] = new Professor("Chico", "Mestre", 129); 
        
        Disciplina[] disciplina = new Disciplina [3];  
        disciplina[0] = new Disciplina("POO", "Fundamentos de Programação ", 4);
        disciplina[1] = new Disciplina("ALEST I", "Fundamentos de Programação ", 4);
        disciplina[2] = new Disciplina("Banco de Dados I", "Sem requisitos     ", 4);

        Turma[] turmas = new Turma[6]; 
        turmas[0] = new Turma("Segunda-feira e Quarta-feira", "JK", 20, disciplina[0], prof[0]);
        turmas[1] = new Turma("Terça-feira e Quinta-feira", "LM", 30, disciplina[0], prof[1]);
        turmas[2] = new Turma("Quarta-feira e Sexta-feira", "NP", 60, disciplina[1], prof[2]);
        turmas[3] = new Turma("Terça-feira e Quinta-feira", "JK", 45, disciplina[1], prof[3]);  
        turmas[4] = new Turma("Quarta-feira e Sexta-feira", "LM", 25, disciplina[2], prof[4]);
        turmas[5] = new Turma("Quinta-feira e Sexta-feira", "NP", 30, disciplina[2], prof[5]);

        String[][] tabela = new String[4][6];

        
        int continuar;
        int op = 0;
        do {
            System.out.println("Escolha uma opção digitando seu respectivo número:\n1 - Programação Orientada a Objetos\n2 - Algoritmos e Estrutura de Dados I\n3 - Banco de Dados\n4 - Ver média de alunos por turma\n5 - Ver menor turma do semestre\n6 - Listar professores\n7 - Listar disciplinas");
            op = sc.nextInt();
            switch(op){
                case 1:
                    Turma.mostrarTurmasPoo(turmas, sc, tabela);
                    break;
                case 2:
                    Turma.mostrarTurmasAlg(turmas, sc, tabela);
                    break;
                case 3: 
                    Turma.mostrarTurmasBdd(turmas, sc, tabela);
                    break;
                case 4:
                    double media = Turma.mediaQtdAlunos(turmas);
                    System.out.println("A média da quantidade de alunos é " + media);
                    break;
                case 5:
                    Turma menor = Turma.buscarMenorTurma(turmas);
                    System.out.println("A menor turma é " + menor.getDisciplina().getNome() + " da professora " + menor.getProfessor().getNome() + ", com " + menor.getQuantAlunos() + " alunos");
                    break;
                case 6:
                    Professor.listarProfessores(prof);
                    break;
                case 7:
                    Disciplina.listarDisciplinas(disciplina);
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
            System.out.println("\n☞ Digite 1 se quer continuar ou 0 para encerrar e ver a sua grade de horários.");
            continuar = sc.nextInt();
        } while(continuar == 1);

        
        Tabela.imprimirTabela(tabela);
        
        sc.close();
    }
}