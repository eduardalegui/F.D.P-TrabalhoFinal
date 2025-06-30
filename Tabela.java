
public class Tabela { //classe Tabela para manipular a grade de horários

    public static void adicionarNaTabela(String[][] tabela, Turma turma) { //método para adicionar uma turma na tabela

        if (disciplinaJaInserida(tabela, turma.getDisciplina().getNome())) { //checa se a disciplna escolhida ja está na tabela, a partir de um método
            System.out.println("Você já está inscrito em uma turma da disciplina " + turma.getDisciplina().getNome());
            return;
        }

        int linha = horarioParaLinha(turma.getHorario()); //armazena o número da linha correspondente ao horário da turma
        int[] colunas = diasParaColunas(turma.getDia()); //armazena em um vetor o número de colunas correspondentes aos dias da semana da turma

        for (int coluna : colunas) { //para cada coluna do vetor colunas
            if (tabela[linha][coluna] != null) { //se a posição da tabela correspondente ao horário e dia da turma não for nula, acusa um conflito
                System.out.println("Conflito detectado: já existe uma turma em " + //indica o conflito
                        nomeDoDia(coluna) + 
                        " " + turma.getHorario() +
                        ": " + tabela[linha][coluna]);
                return; 
            }
        }

        for (int coluna : colunas) { //para cada coluna do vetor colunas
            tabela[linha][coluna] = turma.getDisciplina().getNome().trim(); //armazena o nome da disciplina na tabela
        }

        System.out.println("Turma adicionada com sucesso à grade.");
    }

    public static void imprimirTabela(String[][] tabela) { //metodo para imprimir a tabela de horários
        String[] dias = {"Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira"}; //guarda os dias da semana em um vetor dias
        String[] horarios = {"JK", "LM", "NP"}; //guarda os horários em um vetor horarios

        System.out.println("\n-GRADE FINAL:");
        System.out.print("      ");
        for (String dia : dias) { //para cada dia do vetor dias
            System.out.print(String.format("%-20s", dia)); //imprime o dia formatado com 20 espaços
        }
        System.out.println();

        for (int i = 0; i < horarios.length; i++) { //começa a percorrer o vetor horarios
            System.out.print(String.format("%-6s", horarios[i]));//imprime o horário formatado com 6 espaços
            for (int j = 0; j < dias.length; j++) { //percorre o vetor dias
                String celula = tabela[i][j]; //guarda o que estiver na posição atual da matriz em uma variavel celula
                System.out.print(String.format("%-20s", (celula == null ? "-" : celula))); // se for nulo o valor armazenado, imprime um -, se não imprime o valor armazenado
            }
            System.out.println();
        }
    }

    private static int horarioParaLinha(String horario) { //recebe uma string com o horário como parâmetro
        horario = horario.toUpperCase(); //converte para maiúsculo para evitar problemas na comparação
        if (horario.equals("JK")) return 0; //se for JK, retorna um numero correspondente, e assim por diante com as outras opções
        else if (horario.equals("LM")) return 1;
        else if (horario.equals("NP")) return 2;
        else return -1; //se não for nenhuma das opções, retorna -1
    }

    private static int[] diasParaColunas(String diasTexto) { //recebe uma string com o dia da semana como parâmetro
        String[] partes = diasTexto.toLowerCase().split(" e "); //separa a string em partes, a partir string " e "
        int[] colunas = new int[partes.length]; //cria um vetor para armazenar o numero correspondente das colunas em relação aos dias da semana

        for (int i = 0; i < partes.length; i++) { //percorre o vetor partes
            String dia = partes[i].trim(); //armazena o dia atual em uma variável dia
            if (dia.equals("segunda-feira")) colunas[i] = 0; //se o dia for segunda-feira, armazena 0 na posição atual do vetor colunas, e assim por diante com os outros dias da semana
            else if (dia.equals("terça-feira")) colunas[i] = 1;
            else if (dia.equals("quarta-feira")) colunas[i] = 2;
            else if (dia.equals("quinta-feira")) colunas[i] = 3;
            else if (dia.equals("sexta-feira")) colunas[i] = 4;
            else colunas[i] = -1;
        }

        return colunas; //retorna o vetor
    }
    private static String nomeDoDia(int coluna) { 
        //recebe um número de coluna e retorna uma string com o dia da semana correspondente
        switch (coluna) {
            case 0: return "Segunda-feira";
            case 1: return "Terça-feira";
            case 2: return "Quarta-feira";
            case 3: return "Quinta-feira";
            case 4: return "Sexta-feira";
            default: return "?";
        }
    }

    private static boolean disciplinaJaInserida(String[][] tabela, String nomeDisciplina) {// recebe a matriz e o nome da disciplina como parâmetros
        for (int i = 0; i < tabela.length; i++) {          //percorre a matriz tabela
            for (int j = 0; j < tabela[i].length; j++) {                      //.trim() tira espaços no inicio e final da string, para evitar problemas na comparação
                if (tabela[i][j] != null && tabela[i][j].equals(nomeDisciplina.trim())) { //se a posição atual da matriz não 
                    return true;                                                         //for nula e o nome atual for igual ao nome da disciplina, retorna true
                }
            }
        }
        return false;
    }
}