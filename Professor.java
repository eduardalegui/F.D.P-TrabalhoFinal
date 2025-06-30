public class Professor { //classe Professor com 3 atributos
    private String nome;
    private String titulacao;
    private int matricula;

    public Professor(){
    }

    public Professor(String nome, String titulacao, int matricula) {//construtor com parâmetros
        this.nome = nome;
        this.titulacao = titulacao;
        this.matricula = matricula;
    }

    // Getters e Setters

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
    
    public static void listarProfessores(Professor[] prof){ //método para listar professores
        for (Professor professor : prof) { //para cada professor do vetor prof
            System.out.println("Professor(a): "+ professor.getNome() + " | Titulação: " + professor.getTitulacao() + " | Matrícula: " + professor.getMatricula());
        }
    }
}