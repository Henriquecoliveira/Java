package animais;

public class Gato extends Animais {
    private String nome;


    public void miar() {
        System.out.printf("%s mia", getNome());
    }
}
