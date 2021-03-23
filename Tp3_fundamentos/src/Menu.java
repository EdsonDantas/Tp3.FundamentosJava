
import java.util.Scanner;

public class Menu {

    Scanner input = new Scanner(System.in);

    public void menuOpcoes() {

        System.out.println("*************************************************************************************\n"
                + "---------------Bem vindo ao menu de consulta e cadastro da universidade-------------\n"
                + "*************************************************************************************\n");

    }

    public int escolherOpcao() {
        int opcao;
        int escolha = 0;

        // Mostrando o Menu
        System.out.println("- - - - - - - - Escolha uma das opções abaixo - - - - - - - - \n" + "[1] - Cadastrar Professor\n"
                + "[2] - Cadastrar Aluno\n" + "[3] - Consultar Situação Professor/Aluno\n"
                + "[4] - Finalizar Programa!");

        System.out.println("Informe a opção do MENU:");
        int[] opcoes = { 1, 2, 3, 4 };
        opcao = input.nextInt();

        try {
            escolha = opcoes[opcao - 1];

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Opção não existe no menu. Tente novamente.");

        }

        return escolha;

    }

    public void fecharOuContinuar() {
        System.out.println("\n*************************************************************************");
        System.out.println("Deseja Fechar o Programa?\nFechar: digite '0'.\nIr para o Menu: digite '1'.");
        System.out.println("\n*************************************************************************");
    }


    public void escolhaNaoExisteException(int continuar) throws Exception {
        System.out.println("//- - - - - " + continuar + " Não é uma opção válida!!! - - - - -//\n");
    }
    
}
