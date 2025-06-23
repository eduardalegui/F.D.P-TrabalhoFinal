public class Turma {
    private String dia;
    private String horario;
    private int quantAlunos;
    private Disciplina disciplina;
    private Professor professor;

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
}