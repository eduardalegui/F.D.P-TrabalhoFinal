public class Disciplina {
    private String nome;
    private String requisitos;
    private int creditos;

    public Disciplina() {
    }

    public Disciplina(String nome, String requisitos, int creditos) {
        this.nome = nome;
        this.requisitos = requisitos;
        this.creditos = creditos;
    }

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
    
    public static void listarDisciplinas(Disciplina[] disciplinas) {
    for (Disciplina disciplina : disciplinas) {
        System.out.printf("Disciplina: %-18s | Requisitos: %-25s | Créditos: %d\n",
                disciplina.getNome(),
                disciplina.getRequisitos(),
                disciplina.getCreditos());
        }
    }

 }
