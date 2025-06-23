public class Disciplina {
    private String name;
    private String requisitos;
    private int creditos;

    public Disciplina(String name, String requisitos, int creditos) {
        this.name = name;
        this.requisitos = requisitos;
        this.creditos = creditos;
    }

    public String listarDisciplinas() {
        return "Disciplina: " + name + ", Requisitos: " + requisitos + ", Créditos: " + creditos;
    }
}
