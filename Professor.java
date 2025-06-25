public class Professor {
    private String nome;
    private String titulacao;
    private int matricula;

    public Professor(){
    }

    public Professor(String nome, String titulacao, int matricula) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.matricula = matricula;
    }

    public String getNome(){
        return nome;
    }

    public String getTitulacao(){
        return titulacao;
    }

    public int getMatricula(){
        return matricula;
    }
     
    public void listarProfessores(Professor[] prof){
        for (Professor professor : prof) {
            System.out.println("Professor: "+ professor.getNome() + " Titulação: " + professor.getTitulacao() + " Matrícula: " + professor.getMatricula());
        }
    }
    // public void adicionarProfessor(String nome, String titulacao, int matricula) {
    //     this.nome = nome;
    //     this.titulacao = titulacao;
    //     this.matricula = matricula;
    // }

    // public String toString(){
    //     return "Professor: "+ nome + " Titulação: " + titulacao + " Matrícula: " + matricula;
    // }
}
