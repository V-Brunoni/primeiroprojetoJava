import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int chute = 0;
        int numero = 0;

        numero = new Random().nextInt(100); //Gera um número aleatório entre 0 e 100
        //System.out.println(numero);

        for (int tentativas = 1; tentativas <= 5; tentativas++) {
            System.out.println("Advinhe o número aleatório entre 0 e 100!!!");
            chute = sc.nextInt();

            if(chute == numero){
                System.out.println("Parabéns você acertou o número em " +tentativas+ " tentativas!!!");
                break;
            } else if (numero < chute){
                System.out.println("O número sorteado é menor do que seu chute...");
            } else {
                System.out.println("O número sorteado é maior do que o seu chute...");
            }

            if (tentativas == 4){
                System.out.println("ESSA É A SUA ULTIMA CHANCE!");
            }

            if (tentativas == 5 && chute != numero) {
                System.out.println("Você não conseguiu acertar o número em 5 tentativas. O número era: " + numero);
            }
        }
    }
}
