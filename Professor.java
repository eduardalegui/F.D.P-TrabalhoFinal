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

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTitulacao(String titulacao){
        this.titulacao = titulacao;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    } 
    
    public static void listarProfessores(Professor[] prof){
        for (Professor professor : prof) {
            System.out.println("Professor(a): "+ professor.getNome() + " | Titulação: " + professor.getTitulacao() + " | Matrícula: " + professor.getMatricula());
        }
    }
}