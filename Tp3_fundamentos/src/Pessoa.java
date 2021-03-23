public abstract class Pessoa {
    private String pegarNome;
    private String nome;
    private String sobreNome;
    private String matricula;
    private StringBuilder nomeCompleto;
   
    Pessoa(){

    }
    
    Pessoa(String nome, String matricula, String pegarNome, String sobreNome, StringBuilder nomeCompleto){
        super();
        this.nome = nome;
        this.matricula = matricula;
        this.pegarNome = pegarNome;
        this.sobreNome = sobreNome;
        this.nomeCompleto = nomeCompleto;
        
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getMatricula() {
        return matricula;
    }


    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPegarNome() {
        return pegarNome;
    }

    public void setPegarNome(String pegarNome) {
        this.pegarNome = pegarNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public StringBuilder getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(StringBuilder nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

}
