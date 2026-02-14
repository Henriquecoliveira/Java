import java.util.Scanner;

public class Notas {
    // constante de notas
    public static final int qntd_Notas = 3;
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // variaveis
        int[] notas = new int[qntd_Notas];
        int choice = 0;

        // interface
        do {
            System.out.println("..::NOTAS DE ALUNOS::..");
            System.out.println("1. Inserir notas:");
            System.out.println("2. Visualizar notas");
            System.out.println("9. Sair do programa: ");
            System.out.println("Digite sua escolha: ");
            choice = scanner.nextInt();

        // opcoes
            if (choice == 1) {
                // zerando todas as notas toda vez que inicializar a opcao 1
                for (int i = 0; i < qntd_Notas; i++) {
                    notas[i] = 0;
                }

                // inserindo novas notas
                for (int i= 0; i < qntd_Notas; i++) {
                    System.out.println(String.format("Digite a nota %d a ser cadastrada: ", (i + 1)));
                    notas[i] = scanner.nextInt();
                }
            }

            if (choice == 2) {
                for (int i = 0; i < qntd_Notas; i++) {
                    System.out.println(String.format("A nota %d é %d...", (i + 1), notas[i]));
                }
            }

        } while (choice != 9);

    }
}
