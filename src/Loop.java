import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double avaliacao = 0;
        double nota = 0;
        int quantDeNotas = 5;

        for (int i = 0; i < quantDeNotas; i++) {
            System.out.println("Insira a sua avaliação para o filme: ");
            nota = leitura.nextDouble();
            avaliacao += nota;
        }

        System.out.println("A Avaliação média do filme é " + avaliacao/quantDeNotas);

    }
}
