public class Disciplina {
    private String nome;
    private String requisitos;
    private int creditos;

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
     
    public void listarDisciplinas(Disciplina[] disciplinas){
        for (Disciplina disciplina : disciplinas) {
            System.out.println("Disciplina: "+ disciplina.getNome() + " Requisitos: " + disciplina.getRequisitos() + " Créditos: " + disciplina.getCreditos());
        }
    }
}
