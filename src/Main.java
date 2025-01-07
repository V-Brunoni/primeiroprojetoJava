public class Main {
    public static void main(String[] args) {

        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoLancamento = 2022;
        System.out.println("O ano do lançamento é "+anoLancamento);

        boolean incluidoNoPlano = false;
        System.out.println("O usuário possui plano Plus? "+incluidoNoPlano);

        double notaFilme = 8.5;
        System.out.println("A nota do filme é "+notaFilme+"!");

        double media = (9.8 + 7.8 + 8.1)/3;
        System.out.println(media);

        String sinopse;
        // 3 aspas duplas significa text block, block aonde pode-se pular linhas e formatar da maneira que desejar
        sinopse = """                            
                \n
                Top Gun: Maverick
                Filme de ação com aviões
                Ano de Lançamento:
                """+anoLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media/2);    //casting explícito: converte a saida da classificao de double para inteiro (int)
        System.out.println(classificacao);


    }
}
