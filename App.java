import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int op;
            do {
                System.out.println("Escolha uma opção digitando seu respectivo número:\n1 - Programação Orientada a Objetos\n2 - Algoritmos e Estrutura de Dados I\n3 - Banco de Dados");
                op = sc.nextInt();
                switch(op){
                    case 1:
                        System.out.println("Programação Orientada a Objetos");
                        break;
                    case 2:
                        System.out.println("Algoritmos e Estrutura de Dados I");
                        break;
                    case 3:
                        System.out.println("Banco de Dados");
                        break;
                    default:
                        System.out.println("Opção inválida, tente novamente.");
                        break;
                }

            } while(op == 0 || op > 3);
        
        Professor[] prof = new Professor[5]; //vetor de objetos !!!
        prof[0] = new Professor("Ana", "Mestre", 456);
        prof[1] = new Professor("João", "Doutor", 789);
        prof[2] = new Professor("Paulo", "Mestre", 125);
        prof[3] = new Professor("Mário", "Doutor", 308);
        prof[4] = new Professor("Júlia", "Mestre", 908); 
        prof[5] = new Professor("Chico", "Mestre", 129); 
        
        Disciplina[] disciplina = new Disciplina [2];      
        disciplina[0] = new Disciplina("Programação Orientada a Objetos ", "Fundamentos de Programação ", 4);
        disciplina[1] = new Disciplina("Algoritmos e Estrutura de Dados I ", "Fundamentos de Programação ", 4);
        disciplina[2] = new Disciplina("Banco de Dados ", "Sem requisitos ", 4);

        Turma[] turmas = new Turma[4];
        turmas[0] = new Turma("Segunda e Quarta", "JK", 20, disciplina[0], prof[0]);
        turmas[1] = new Turma("Terça e Quinta", "LM", 30, disciplina[0], prof[1]);
        turmas[2] = new Turma("Quarta e Sexta", "NP", 60, disciplina[1], prof[2]);
        turmas[3] = new Turma("Terça e Quinta", "JK", 45, disciplina[1], prof[3]);
        turmas[4] = new Turma("Quarta e Sexta", "LM", 25, disciplina[2], prof[4]);
        turmas[5] = new Turma("Quinta e Sexta", "NP", 30, disciplina[3], prof[5]);


        
        sc.close();
    }
}
