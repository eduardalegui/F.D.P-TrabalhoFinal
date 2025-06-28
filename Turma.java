import java.util.Scanner;

public class Turma {
    Scanner sc = new Scanner(System.in);
    
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

    public void setQuantAlunos() {
        this.quantAlunos = quantAlunos;
    }

    public void setDia (){
        this.dia = dia;
    }

    public void setHorario(String horario){
        this.horario = horario;
    }

    public void setDisciplina(){
        this.disciplina = disciplina;
    }

    public void setProfessor(){
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

    public void mostrarTurmasPoo(Turma[] turmas){// turma 0 e 1
        int op;
        System.out.println("Selecione a turma desejada entre as disponíveis para a disciplina programação orientada a objetos (0 ou 1):");
        op=sc.nextInt();
        switch(op){
            case 0:
                System.out.println("Turma 0: " + (turmas[0].toString()));
                break;
            case 1:
                System.out.println("Turma 1: " + (turmas[1].toString()));
                break;
        }
    }

    public void mostrarTurmasAlg(Turma[] turmas){// turma 2 e 3
        int op;
        System.out.println("Selecione a turma desejada entre as disponíveis para a matéria: ");
        op = sc.nextInt();
        switch(op){
            case 2:
                System.out.println("Turma 2: " + (turmas[2].toString()));
                break;
            case 3:
                System.out.println("Turma 3: " + (turmas[3].toString()));
                break;
        }
    }

    public void mostrarTurmasBdd(Turma[] turmas){// turma 4 e 5 
        System.out.println("Selecione a turma desejada entre as disponíveis para a matéria (4 ou 5): ");
        int op = sc.nextInt();
        switch (op) {
            case 4:
                System.out.println("Turma 4: " + turmas[op].toString());
                break;
            case 5:
                System.out.println("Turma 5: " + turmas[op].toString());
                break;
            default:
                break;
        }
    }
    

    public String toString(){
        return " | " + this.dia + " | " + this.horario +" | " + this.quantAlunos + " | " + this.disciplina.getNome() + " | " + this.professor.getNome() + " | ";
    }
    
    
}