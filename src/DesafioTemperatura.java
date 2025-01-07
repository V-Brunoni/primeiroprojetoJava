public class DesafioTemperatura {
    public static void main(String[] args) {

        double celsius = 30.5;

        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println(celsius+" graus Celsius é equivalente a "+fahrenheit+" graus Fahrenheit");

        int tempInt = (int) fahrenheit;
        System.out.println("A temperatura em Fahrenheit em números inteiros é "+tempInt);

    }
}
