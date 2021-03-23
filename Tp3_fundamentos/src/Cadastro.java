import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastro {

    Scanner input = new Scanner(System.in);

    // *************AÇÕES PARA PROFESSORES*******************
    List<Professor> professores = new ArrayList<>();

    // --------------------Cadastro-------------------------
    public void cadastrarProfessor() {
        System.out.println("\n********** Cadastrar Professor **************\n");
        System.out.println("Pressione Enter para começar o cadastro:");
        input.nextLine();// esse input faz com que, na próxima vez, a linha de nome nao seja pulada.

        // Pegar Nome completo professor
        Professor professor = new Professor();
        System.out.println("Informe o nome completo do professor: ");
        professor.setPegarNome(input.nextLine().toUpperCase());

        // separar nome e sobrenome
        professor.setNome(professor.separarNome(professor.getPegarNome()));
        professor.setSobreNome(professor.separarSobreNome(professor.getPegarNome()));

        // Matricula Professor
        System.out.println("Informe a matrícula: ");
        professor.setMatricula("P" + input.nextLine().toUpperCase());

        //Juntar o nome novamente com StringBuilder
        StringBuilder nomeProfessor = new StringBuilder();
        nomeProfessor.append(professor.getNome()).append(" ").append(professor.getSobreNome());
        professor.setNomeCompleto(nomeProfessor);

        // Curso Professor
        System.out.println("Informe o curso do Professor: ");
        professor.setCurso(input.nextLine());

        // Horas trabalhadas Professor
        System.out.println("Informe as horas trabalhadas esse Mês:");
        professor.setHorasTrabalhadas(Double.parseDouble(input.nextLine()));

        // Valor hora Aula
        System.out.println("Informe O Valor da hora/aula:");
        professor.setValorHoraAula(Double.parseDouble(input.nextLine()));

        // Salario do Professor
        professor.calcularSalario(professor.getValorHoraAula(), professor.getHorasTrabalhadas());
        professores.add(professor);

        System.out.println(
                "Anote o código de matricula do cadastrado para consulta futura:" + professor.getMatricula() + "\n");
    }

    // -------------Consulta Prof--------------------
    public void menuConsultaProfessores(int consultar) {

        if (consultar == 1) {
            System.out.println(
                    "Consultar Professores: \n[4] para todos os professores cadastradaos e suas informações\n[5] para consultar um professor específico:");
            int consultaProf = input.nextInt();
            if (consultaProf == 4) {
                mostrarListaProfessor();
            } else if (consultaProf == 5) {

                System.out.println("Informe o numero da matrícula do Professor:");
                String buscaProf = input.next().toUpperCase();
                buscarProfessor(buscaProf);

            } else {
                System.out.println("Algo errado. Tente denovo.");
            }

        }
    }

    // Listando todos os Professores
    public void mostrarListaProfessor() {

        for (Professor professor : professores) {

            System.out.println("Professor: " + professor.getNomeCompleto());
            System.out.println("Curso: " + professor.getCurso());
            System.out.println("Matricula: " + professor.getMatricula());
            System.out.println("Salario: " + professor.getSalario() + "\n");
        }
    }

    // Buscando um professor específico pelo Matrícula
    public void buscarProfessor(String buscaProf) {

        for (Professor professor : professores) {
            if (professor.getMatricula().equals(buscaProf)) {

                System.out.println("Professor: " + professor.getNomeCompleto());
                System.out.println("Curso: " + professor.getCurso());
                System.out.println("Matricula: " + professor.getMatricula());
                System.out.println("Salario: " + professor.getSalario() + "\n");
            } else {
                System.out.println("Cadastro não encontrado. \nNúmero código da Matrícula não existe");
            }

        }

    }

    // ***************AÇÕES PARA ALUNOS***********************
    List<Aluno> alunos = new ArrayList<>();

    // ----------------Cadastro------------------
    public void cadastrarAlunos() {
        System.out.println("\n********** Cadastrar Aluno **************\n");

        Aluno aluno = new Aluno();
        // System.out.println("Pressione Enter para começar o cadastro:");
        // input.nextLine();

        // Nome do Aluno
        System.out.println("Informe o Nome Completo do Aluno:");
        aluno.setPegarNome(input.nextLine().toUpperCase());

        // Separar nome e sobrenome
        aluno.setNome(aluno.separarNome(aluno.getPegarNome()));
        aluno.setSobreNome(aluno.separarSobreNome(aluno.getPegarNome()));
        
        //Juntar o nome novamente com StringBuilder
        StringBuilder nomeAluno = new StringBuilder();
        nomeAluno.append(aluno.getNome()).append(" ").append(aluno.getSobreNome());
        aluno.setNomeCompleto(nomeAluno);

        // Matricula do Aluno
        System.out.println("Informe a Matrícula do Aluno:");
        aluno.setMatricula("A" + input.nextLine().toUpperCase());

        // Curso do Aluno
        System.out.println("Informe o curso do aluno:");
        aluno.setCurso(input.nextLine());

        // Primeira e segunda nota
        System.out.println("Informe a 1º nota:");
        aluno.setNota1(input.nextDouble());
        System.out.println("Informe a 2º nota:");
        aluno.setNota2(input.nextDouble());
        // Média das notas
        aluno.setMedia(aluno.calcularMedia(aluno.getNota1(), aluno.getNota2()));

        alunos.add(aluno);
        System.out.println("Anote o código de matricula do cadastrado para consulta futura:" + aluno.getMatricula());
    }

    public void menuConsultaAlunos(int consultar) {

        if (consultar == 2) {
            System.out.println(
                    "Consultar Alunos: \n[4] para todos os Alunos cadastradaos e suas informações\n[5] para consultar um aluno específico:");
            int consultaAluno = input.nextInt();
            if (consultaAluno == 4) {
                mostrarListaAlunos();
            } else if (consultaAluno == 5) {

                buscarAluno();
            } else {
                System.out.println("Algo errado. Tente denovo.");
            }

        }
    }

    // Listando todos os alunos
    public void mostrarListaAlunos() {

        for (Aluno aluno : alunos) {

            System.out.println("Aluno: " + aluno.getNomeCompleto());
            System.out.println("Matricula: " + aluno.getMatricula());
            System.out.println("Curso: " + aluno.getCurso());
            System.out.println("Nota 1: " + aluno.getNota1());
            System.out.println("Nota 2: " + aluno.getNota2());
            System.out.println("Média: " + aluno.getMedia());

            if (aluno.getMedia() < 4) {
                System.out.println("Situação do aluno: REPROVADO!\n");
            } else if (aluno.getMedia() < 7) {

                System.out.println("Situação do aluno: PROVA FINAL!\n");
            } else {
                System.out.println("Situação do aluno: APROVADO!\n");

            }
        }

    }

    // Buscando aluno específico pela Matrícula
    public void buscarAluno() {
        System.out.println("Informe o numero da matrícula do Aluno:");
        String buscaAluno = input.next().toUpperCase();
        for (Aluno aluno : alunos) {

            if (aluno.getMatricula().equals(buscaAluno)) {

                System.out.println("Aluno: " + aluno.getNomeCompleto());
                System.out.println("Matricula: " + aluno.getMatricula());
                System.out.println("Curso: " + aluno.getCurso());
                System.out.println("Nota 1: " + aluno.getNota1());
                System.out.println("Nota 2: " + aluno.getNota2());
                System.out.println("Média: " + aluno.getMedia());

                if (aluno.getMedia() < 4) {
                    System.out.println("Situação do aluno: REPROVADO!\n");
                } else if (aluno.getMedia() < 7) {

                    System.out.println("Situação do aluno: PROVA FINAL!\n");
                } else {
                    System.out.println("Situação do aluno: APROVADO!\n");

                }
            } else {

                System.out.println("Cadastro não encontrado. \nNúmero código da Matrícula não existe");
            }
        }

    }

}
