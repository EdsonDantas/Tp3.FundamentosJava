import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        Cadastro cadProf = new Cadastro();
        Cadastro cadAluno = new Cadastro();
        
        Menu menu = new Menu();
        menu.menuOpcoes();
        int continuar = 1;
        while (continuar == 1) {
            
            

            int escolha = menu.escolherOpcao();

            switch (escolha) {
                
            // CADASTRO DE PROFESSORES
            case 1:
               cadProf.cadastrarProfessor();
                break;

            case 2:
                // CADASTRO DE ALUNOS
                cadAluno.cadastrarAlunos();

                break;

            case 3:
                System.out.println("Consultar Situação :\n[1] Professor\n[2]Aluno");
                int consultar = input.nextInt();

                if (consultar == 1) {

                    // Consulatar Professores
                    cadProf.menuConsultaProfessores(consultar);
                } else if (consultar == 2) {

                    // Consultar Alunos
                    cadAluno.menuConsultaAlunos(consultar);
                }
                break;

                case 4:
                System.out.println("******Programa Encerrado!******");
                System.exit(0);

            }

            menu.fecharOuContinuar();
            continuar = input.nextInt();
            while(continuar <0 || continuar >1) {
            
            
                Menu menuSair = new Menu();
                try {
                    if(continuar != 1 || continuar != 0) {
                      menuSair.escolhaNaoExisteException(continuar);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }finally{
                    System.out.println("//- - - - - Tente novamente! - - - - -//\n");
                }
                menu.fecharOuContinuar();
                continuar = input.nextInt();
            
            }



        }
        input.close();
        System.out.println("* * * * * * Programa Encerrado! * * * * * *");

    }

}
