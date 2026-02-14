package animais;

public class Animais {
    private String nome;

    public void comer() {
        System.out.println(String.format("%s comeu", getNome()));
    }
    public void beber() {
        System.out.println(String.format("%s bebeu", getNome()));
    }
    
    // getters
    public String getNome() {
        this.nome = nome;
        return nome;
    }

    // setter
    public void setNome(String nome) {
        this.nome = nome;
    }
}
