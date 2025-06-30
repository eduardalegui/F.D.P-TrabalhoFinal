# F.D.P-TrabalhoFinal

# Sistema para Organização da Grade de Horários da PUCRS

Este é um projeto simples em Java para simular o processo de matrícula em disciplinas na PUCRS. O sistema permite que o usuário escolha disciplinas, visualize turmas com dias e horários, selecione turmas sem conflitos de horário e gere uma tabela semanal com as aulas escolhidas.


# Funcionalidades

- Listagem de disciplinas disponíveis com requisitos e créditos.
- Escolha de turmas com dias da semana e horários.
- Verificação de conflitos de horário entre turmas.
- Prevenção contra matrícula duplicada na mesma disciplina.
- Permite troca de turma da mesma disciplina, caso o usuário deseje.
- Geração de uma grade de horários (matriz 3x5) com os dados inseridos.
- Cálculo da média de alunos por turma.
- Identificação da menor turma do semestre.
- Impressão final da grade horária do aluno.

## Estrutura do Projeto

# App.java (Classe principal)

- Contém o main() com menu interativo para o usuário.
- Cria e inicializa os arrays de Professor, Disciplina e Turma.
- Exibe o menu para o usuário selecionar disciplinas.
- Chama os métodos de escolha de turmas e impressão de grade.

# Professor.java

- Define o objeto Professor com: Nome, Titulação (Mestre, Doutor, etc.), Matrícula.
- Possui método listarProfessores() para exibição formatada dos professores.

# Disciplina.java

- Define o objeto Disciplina com: Nome, Requisitos, Créditos.
- Possui método listarDisciplinas() para exibir as disciplinas e suas informação de forma alinhada.

# Turma.java

- Define a turma com: Dias da semana, Horário (JK, LM, NP), Quantidade de alunos, Disciplina vinculada, Professor vinculado.
- Métodos estáticos:
  - mostrarTurmasPoo, mostrarTurmasAlg, mostrarTurmasBdd: para escolha das turmas por disciplina.
  - mediaQtdAlunos(): calcula a média de alunos nas turmas.
  - buscarMenorTurma(): retorna a turma com menos alunos.
- Exibe as informações de forma alinhada com toString().

# Tabela.java

- Gerencia a grade de horários do aluno.
- Utiliza uma matriz com 3 linhas (JK, LM, NP) e 5 colunas (segunda a sexta).
- Métodos principais:
  - adicionarNaTabela(): insere disciplina na matriz com verificação de conflitos e duplicações.
  - disciplinaJaInserida(): verifica se a disciplina já está na grade.
  - removerDisciplinaDaTabela(): remove turma antiga da grade caso o usuário queira trocar.
  - imprimirTabela(): exibe a grade com colunas e horários alinhados.
  - Conversões auxiliares de texto para índices: dias da semana e horários.


# Reflexão Crítica

Este projeto proporcionou uma experiência prática importante no uso de conceitos fundamentais de programação em Java, como encapsulamento, criação de classes, métodos estáticos, uso de arrays e estrutura de menus com switch-case.

Durante o desenvolvimento, enfrentamos desafios como:
- Trabalhar com a lógica de alocação de turmas sem conflito de horários.
- Implementar uma grade de horários com mapeamento entre texto e índices de matriz.
- Evitar duplicidade de matrícula na mesma disciplina e permitir a troca de turmas de forma segura.

Esses desafios exigiram o uso de boas práticas, como separação de responsabilidades entre classes (Professor, Disciplina, Turma, Tabela), além da necessidade de pensar em casos de uso reais, como a validação de entradas e conflitos de agenda.

No geral, o projeto foi fundamental para consolidar os conhecimentos adquiridos ao longo da disciplina e nos preparou para lidar com problemas práticos de lógica e estruturação de sistemas em Java.
