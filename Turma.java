import java.util.Scanner;

public class Turma {
    
    private String dia;
    private String horario;
    private int quantAlunos;  
    private Disciplina disciplina;
    private Professor professor;

    public Turma() {
    }

    public Turma(String dia, String horario, int quantAlunos, Disciplina disciplina, Professor professor) {
        this.dia = dia;
        this.horario = horario;
        this.quantAlunos = quantAlunos;
        this.disciplina = disciplina;
        this.professor = professor;
    }

    public int getQuantAlunos() {
        return quantAlunos;
    }

    public String getDia (){
        return this.dia;
    }

    public String getHorario(){
        return this.horario;
    }

    public Disciplina getDisciplina(){
        return this.disciplina;
    }

    public Professor getProfessor(){
        return this.professor;
    }

    public void setQuantAlunos(int quantAlunos) {
        this.quantAlunos = quantAlunos;
    }

    public void setDia (String dia){
        this.dia = dia;
    }

    public void setHorario(String horario){
        this.horario = horario;
    }

    public void setDisciplina(Disciplina disciplina){
        this.disciplina = disciplina;
    }

    public void setProfessor(Professor professor){
        this.professor = professor;
    }

    public static double mediaQtdAlunos(Turma[] turmas) {
        int total = 0;
        for (Turma t : turmas) {
            total += t.getQuantAlunos();
        }
        return (double) total / turmas.length;
    }

    public static Turma buscarMenorTurma(Turma[] turmas) {
        Turma menor = turmas[0];
        for (Turma t : turmas) {
            if (t.getQuantAlunos() < menor.getQuantAlunos()) {
                menor = t;
            }
        }
        return menor;
    }

    public static void mostrarTurmasPoo(Turma[] turmas, Scanner sc, String[][] tabela){
        int op;
        System.out.println("Selecione a turma desejada entre as disponíveis para a disciplina programação orientada a objetos (0 ou 1):");
        System.out.println("Turma 0 " + (turmas[0].toString()));
        System.out.println("Turma 1 " + (turmas[1].toString()));
        op=sc.nextInt();
        switch(op){
            case 0:
                System.out.println("Você selecionou a turma 0.");
                Tabela.adicionarNaTabela(tabela, turmas[0]);
                break;
            case 1:
                System.out.println("Você selecionou a turma 1.");
                Tabela.adicionarNaTabela(tabela, turmas[1]);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    public static void mostrarTurmasAlg(Turma[] turmas, Scanner sc, String[][] tabela){
        int op;
        System.out.println("Selecione a turma desejada entre as disponíveis para a matéria: ");
        System.out.println("Turma 2 " + (turmas[2].toString()));
        System.out.println("Turma 3 " + (turmas[3].toString()));

        op = sc.nextInt();
        switch(op){
            case 2:
                System.out.println("Você selecionou a turma 2.");
                Tabela.adicionarNaTabela(tabela, turmas[2]);
                break;
            case 3:
                System.out.println("Você selecionou a turma 3.");
                Tabela.adicionarNaTabela(tabela, turmas[3]);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    public static void mostrarTurmasBdd(Turma[] turmas, Scanner sc, String[][] tabela){
        int op = 0;

        System.out.println("Selecione a turma desejada entre as disponíveis para a matéria (4 ou 5): ");
        System.out.println("Turma 4 " + turmas[4].toString());
        System.out.println("Turma 5 " + turmas[5].toString());

        op = sc.nextInt();
    
        switch (op) {
        case 4:
            System.out.println("Você selecionou a turma 4.");
            Tabela.adicionarNaTabela(tabela, turmas[4]);
            break;
        case 5:
            System.out.println("Você selecionou a turma 5.");
            Tabela.adicionarNaTabela(tabela, turmas[5]);
            break;
        default:
            System.out.println("Opção inválida!");
            break;
        }
    }
    
    public String toString(){
        return " | " + this.dia + " | " + this.horario +" | " + this.quantAlunos + " | " + this.disciplina.getNome() + " | " + this.professor.getNome() + " | ";
    }
}