import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in); //System.in rastreia se o usuário fez uma entrada pelo teclado

        System.out.println("Digite o seu filme favorito");
        String filme = leitura.nextLine();

        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Insira sua avaliação para o filme: ");
        double avaliacao = leitura.nextDouble(); //usar virgula ao inserir o double para o scanner

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }
}
