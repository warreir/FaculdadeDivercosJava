package Prova2;
/**
 *  @author Renan Ponick
 * 
 * 
*/

public class index{
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(01, "Junior Rezende", "15/05/1998", "123.123.123-32", 2);
        cliente1.retornaDados();
        cliente1.locacao = new Locacao(01, cliente1);

        System.out.println("\n");

        Filme filme1 = new Filme(01, "Jhon, e os quem", "25/10/2018", "Uma História", 1, 3);
        filme1.dadosFilme();

        cliente1.locacao.adicionarFilme(filme1);
        cliente1.locacao.adicionarFilme(filme1);

        System.out.println(cliente1.locacao.calcularPrecoFinal());
    }
}