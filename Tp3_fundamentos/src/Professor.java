import java.util.Scanner;

public class Professor extends Pessoa implements Salario, Substring{

    Scanner input = new Scanner(System.in);
    
    private String curso;
    private double horasTrabalhadas;
    private double valorHoraAula; 
    private double salario;

    Professor(){
        
    }

    
    Professor(String pegarNome, String nome, String sobreNome,  String matricula, String curso, double salario, StringBuilder nomeCompleto){
        super(pegarNome, nome, sobreNome, matricula, nomeCompleto);
        this.salario = salario;

    }
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }


    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }


    public double getValorHoraAula() {
        return valorHoraAula;
    }


    public void setValorHoraAula(double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }


    @Override
    public double calcularSalario(double valorHoraAula, double horasTrabalhadas) {
        this.salario = horasTrabalhadas * valorHoraAula;
       return salario;
        
    }


    @Override
    public String separarNome(String pegaNome) {
        String nome = pegaNome.substring(0, pegaNome.indexOf(" "));
        return nome;
    }


    @Override
    public String separarSobreNome(String pegaNome) {
        String sobreNome = pegaNome.substring(pegaNome.indexOf(" ") + 1, pegaNome.length());
        return sobreNome;
    }




}
