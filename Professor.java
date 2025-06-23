public class Professor {
    private String nome;
    private String titulacao;
    private int matricula;

    public Professor(String nome, String titulacao, int matricula) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.matricula = matricula;
    }
     
    public void adicionarProfessor(String nome, String titulacao, int matricula) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.matricula = matricula;
    }
}