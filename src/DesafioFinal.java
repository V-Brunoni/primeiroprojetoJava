import java.util.Scanner;

public class DesafioFinal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome = "Vinicius Brunoni";
        String tipoConta = "Corrente";
        double saldoInicial = 5000;
        int opcao = 0;
        double saldo = saldoInicial;
        double valor = 0;

        System.out.println("***************************************");
        System.out.println("Dados iniciais do cliente: \n");
        System.out.println("Nome do cliente: " +nome);
        System.out.println("Tipo da conta: " +tipoConta);
        System.out.println("Saldo Inicial:  R$ " +saldoInicial);
        System.out.println("****************************************\n");

        while(opcao != 4){
            System.out.println("OPERAÇÕES\n");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair\n");
            System.out.println("Digite a opção desejada: ");
            opcao = sc.nextInt();

            if(opcao == 1){
                System.out.println("O saldo da sua conta é de R$ " + saldo);
            } else if (opcao == 2) {
                System.out.println("Informe o valor que irá receber: ");
                valor = sc.nextDouble();
                saldo += valor;
                System.out.println("Seu novo saldo é de R$ " + saldo);
            } else if (opcao == 3) {
                System.out.println("Informe o valor que deseja transferir: ");
                valor = sc.nextDouble();
                if (valor > saldo) {
                    System.out.println("Operação Invalida. Por favor informe um valor dentro do limite do seu saldo!");
                } else {
                    saldo -= valor;
                    System.out.println("Seu novo saldo é de R$ " + saldo);
                }
            } else if (opcao == 4) {
                System.out.println("Programa Finalizado...");
            } else {
                System.out.println("Opção Invalida! Por favor informe uma das opções do menu!");
            }
        }
    }
}
