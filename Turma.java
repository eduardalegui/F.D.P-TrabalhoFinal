import java.util.Scanner;

public class Turma { //classe turma com 5 atributos, sendo 2 deles objetos de outras classes
    
    private String dia;
    private String horario;
    private int quantAlunos;  
    private Disciplina disciplina;
    private Professor professor;

    public Turma() {
    }

    public Turma(String dia, String horario, int quantAlunos, Disciplina disciplina, Professor professor) { //construtor com parâmetros
        this.dia = dia;
        this.horario = horario;
        this.quantAlunos = quantAlunos;
        this.disciplina = disciplina;
        this.professor = professor;
    }

    // Getters e Setters

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

    public void setQuantAlunos(int quantAlunos) {
        this.quantAlunos = quantAlunos;
    }

    public void setDia (String dia){
        this.dia = dia;
    }

    public void setHorario(String horario){
        this.horario = horario;
    }

    public void setDisciplina(Disciplina disciplina){
        this.disciplina = disciplina;
    }

    public void setProfessor(Professor professor){
        this.professor = professor;
    }

    public static double mediaQtdAlunos(Turma[] turmas) { //metodo para calcular a media de alunos das turmas, recebendo um vetor de turmas como parâmetro
        int total = 0;
        for (Turma t : turmas) { //para cada Turma do vetor turmas
            total += t.getQuantAlunos(); //soma a quantidade de alunos de cada turma
        }
        return (double) total / turmas.length; //divide o total pelo tamanho do vetor
    }

    public static Turma buscarMenorTurma(Turma[] turmas) { //método para buscar a menor Turma do vetor de turmas
        Turma menor = turmas[0]; //inicializa a menor turma com a primeira turma do vetor
        for (Turma t : turmas) { 
            if (t.getQuantAlunos() < menor.getQuantAlunos()) { //se a turma atual for menor que a menor turma, ela se torna a menor
                menor = t;
            }
        }
        return menor; //retorna o objeto Turma que possui a menor quantidade de alunos
    }

    // métodos para exibir as turmas de cada disciplina, recebendo um vetor de turmas, o Scanner e a matriz tabela como parâmetros
    // os outros métodos com nomes semelhantes fazem as mesmas coisas, porém com disciplinas diferentes
    public static void mostrarTurmasPoo(Turma[] turmas, Scanner sc, String[][] tabela){
        int op;
        System.out.println("Selecione a turma desejada entre as disponíveis para a disciplina (0 ou 1):");//orientação para o usuário
        System.out.println("Turma 0 " + (turmas[0].toString())); //imprime as opções de turmas disponíveis
        System.out.println("Turma 1 " + (turmas[1].toString()));
        op=sc.nextInt();
        switch(op){//switch para adicionar a turma selecionada na matriz
            case 0:
                System.out.println("Você selecionou a turma 0.");
                Tabela.adicionarNaTabela(tabela, turmas[0]); // adiciona na tabela passando a matriz e a turma selecionada como parâmetros
                break;
            case 1:
                System.out.println("Você selecionou a turma 1.");
                Tabela.adicionarNaTabela(tabela, turmas[1]);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    public static void mostrarTurmasAlg(Turma[] turmas, Scanner sc, String[][] tabela){
        int op;
        System.out.println("Selecione a turma desejada entre as disponíveis para a disciplina (2 ou 3): ");
        System.out.println("Turma 2 " + (turmas[2].toString()));
        System.out.println("Turma 3 " + (turmas[3].toString()));

        op = sc.nextInt();
        switch(op){
            case 2:
                System.out.println("Você selecionou a turma 2.");
                Tabela.adicionarNaTabela(tabela, turmas[2]);
                break;
            case 3:
                System.out.println("Você selecionou a turma 3.");
                Tabela.adicionarNaTabela(tabela, turmas[3]);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    public static void mostrarTurmasBdd(Turma[] turmas, Scanner sc, String[][] tabela){
        int op = 0;

        System.out.println("Selecione a turma desejada entre as disponíveis para a disciplina (4 ou 5): ");
        System.out.println("Turma 4 " + turmas[4].toString());
        System.out.println("Turma 5 " + turmas[5].toString());

        op = sc.nextInt();
    
        switch (op) {
        case 4:
            System.out.println("Você selecionou a turma 4.");
            Tabela.adicionarNaTabela(tabela, turmas[4]);
            break;
        case 5:
            System.out.println("Você selecionou a turma 5.");
            Tabela.adicionarNaTabela(tabela, turmas[5]);
            break;
        default:
            System.out.println("Opção inválida!");
            break;
        }
    }
    
    public String toString(){ //toString para exibir um objeto Turma
        return " | " + this.dia + " | " + this.horario +" | " + this.quantAlunos + " | " + this.disciplina.getNome() + " | " + this.professor.getNome() + " | ";
    }
}