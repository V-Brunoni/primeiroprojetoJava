public class Condicional {
    public static void main(String[] args) {


        int anoLancamento = 2021;
        boolean incluidoNoPlano = true;
        double notaFilme = 8.5;
        String tipoPlano = "plus";

        if(anoLancamento >= 2022){
            System.out.println("Filme Lançamento");
        } else {
            System.out.println("Filme antigo");
        }

        if(incluidoNoPlano && tipoPlano.equals("plus")){  //Para String usar equals para comparar
            System.out.println("Filme Liberado!");
        }else{
            System.out.println("Pagar Locação! ");
        }
    }
}
