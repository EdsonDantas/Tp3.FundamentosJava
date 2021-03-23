
public class Aluno extends Pessoa implements Substring{

    private String curso;
    private double nota1;
    private double nota2;
    private double media;

    Aluno(){
    }

    Aluno(String pegarNome, String nome, String sobreNome, String matricula, String curso, double nota1, double nota2, double media, StringBuilder nomeCompleto) {
       super(pegarNome, nome, sobreNome, matricula, nomeCompleto);
        this.curso = curso;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = media;
        
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double calcularMedia(double nota1, double nota2){
        this.media =  (nota1 + nota2) / 2;
        return media;
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
