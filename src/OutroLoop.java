import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double avaliacao = 0;
        double nota = 0;
        int quantDeNotas = 0;

        while (nota != -1) {
            System.out.println("Insira a sua avaliação para o filme ou -1 para encerrar: ");
            nota = leitura.nextDouble();

            if(nota != -1){
                avaliacao += nota;
                quantDeNotas++;
            }
        }

        System.out.println("A Avaliação média do filme é " + avaliacao/quantDeNotas);

    }
}
