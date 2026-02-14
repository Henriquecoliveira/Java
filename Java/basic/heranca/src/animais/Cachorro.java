package animais;

public class Cachorro extends Animais {
    private String nome;

    public void latir() {
        System.out.printf("%s latiu", getNome());
    }

    public void lamber() {
        System.out.printf("* %s te da uma lambida... *", getNome());
    }
}
