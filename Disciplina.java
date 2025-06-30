public class Disciplina { //classe disciplina com 3 atributos
    private String nome;
    private String requisitos;
    private int creditos;

    public Disciplina() {
    }

    public Disciplina(String nome, String requisitos, int creditos) { //construtor com parâmetros
        this.nome = nome;
        this.requisitos = requisitos;
        this.creditos = creditos;
    }

    // Getters e Setters

    public String getNome(){
        return nome;
    }

    public String getRequisitos(){
        return requisitos;
    }

    public int getCreditos(){
        return creditos;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setRequisitos(String requisitos){
        this.requisitos = requisitos;
    }

    public void setCreditos(int creditos){
        this.creditos = creditos;
    }   
    
    public static void listarDisciplinas(Disciplina[] disciplinas) { //metodo para listar as disciplinas 
    for (Disciplina disciplina : disciplinas) { //para cada Disciplina do vetor disciplinas
        System.out.printf("Disciplina: %-18s | Requisitos: %-25s | Créditos: %d\n", //formatação da saída
                disciplina.getNome(),
                disciplina.getRequisitos(),
                disciplina.getCreditos());
        }
    }

 }
