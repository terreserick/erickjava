package boletim_project;

public class Aluno {
    private String nome;
    private int idade;
    private double nota1;
    private double nota2;
    private double media;
    
    public Aluno(String nome ,int idade,double nota1 ,double nota2) {
        this.nome = nome; 
        this.idade = idade; 
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return this.idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the nota1
     */
    public double getNota1() {
        return this.nota1;
    }

    /**
     * @param nota1 the nota1 to set
     */
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    /**
     * @return the nota2
     */
    public double getNota2() {
        return this.nota2;
    }

    /**
     * @param nota2 the nota2 to set
     */
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    /**
     * @return the média
     */
    public double getMedia() {
        return this.media;
    }

    /**
     * @param média the média to set
     */
    public void setMedia(double média) {
        this.media = média;
    }
    public double calc_media(double nota1 , double nota2) {
        this.media = (this.nota1 + this.nota2) / 2;
        return this.media;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
