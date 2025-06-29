
public class Tabela {

    public static void adicionarNaTabela(String[][] tabela, Turma turma) {

        if (disciplinaJaInserida(tabela, turma.getDisciplina().getNome())) {
            System.out.println("Você já está inscrito em uma turma da disciplina " + turma.getDisciplina().getNome());
            return;
        }

        int linha = horarioParaLinha(turma.getHorario());
        int[] colunas = diasParaColunas(turma.getDia());

        for (int coluna : colunas) {
            if (tabela[linha][coluna] != null) {
                System.out.println("Conflito detectado: já existe uma turma em " +
                        nomeDoDia(coluna) + " " + turma.getHorario() +
                        ": " + tabela[linha][coluna]);
                return; 
            }
        }

        for (int coluna : colunas) {
            tabela[linha][coluna] = turma.getDisciplina().getNome().trim();
        }

        System.out.println("Turma adicionada com sucesso à grade.");
    }

    public static void imprimirTabela(String[][] tabela) {
        String[] dias = {"Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira"};
        String[] horarios = {"JK", "LM", "NP"};

        System.out.println("\n↖(^o^)↗ GRADE FINAL:");
        System.out.print("      ");
        for (String dia : dias) {
            System.out.print(String.format("%-20s", dia));
        }
        System.out.println();

        for (int i = 0; i < horarios.length; i++) {
            System.out.print(String.format("%-6s", horarios[i]));
            for (int j = 0; j < dias.length; j++) {
                String celula = tabela[i][j];
                System.out.print(String.format("%-20s", (celula == null ? "-" : celula)));
            }
            System.out.println();
        }
    }

    private static int horarioParaLinha(String horario) {
        horario = horario.toUpperCase();
        if (horario.equals("JK")) return 0;
        else if (horario.equals("LM")) return 1;
        else if (horario.equals("NP")) return 2;
        else return -1;
    }

    private static int[] diasParaColunas(String diasTexto) {
        String[] partes = diasTexto.toLowerCase().split(" e ");
        int[] colunas = new int[partes.length];

        for (int i = 0; i < partes.length; i++) {
            String dia = partes[i].trim();
            if (dia.equals("segunda-feira")) colunas[i] = 0;
            else if (dia.equals("terça-feira")) colunas[i] = 1;
            else if (dia.equals("quarta-feira")) colunas[i] = 2;
            else if (dia.equals("quinta-feira")) colunas[i] = 3;
            else if (dia.equals("sexta-feira")) colunas[i] = 4;
            else colunas[i] = -1;
        }

        return colunas;
    }
    private static String nomeDoDia(int coluna) {
        switch (coluna) {
            case 0: return "Segunda-feira";
            case 1: return "Terça-feira";
            case 2: return "Quarta-feira";
            case 3: return "Quinta-feira";
            case 4: return "Sexta-feira";
            default: return "?";
        }
    }

    private static boolean disciplinaJaInserida(String[][] tabela, String nomeDisciplina) {
    for (int i = 0; i < tabela.length; i++) {
        for (int j = 0; j < tabela[i].length; j++) {
            if (tabela[i][j] != null && tabela[i][j].equals(nomeDisciplina.trim())) {
                return true;
            }
        }
    }
    return false;
    }
}