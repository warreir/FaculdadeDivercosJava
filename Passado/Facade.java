/**
 *  @author Renan Ponick
 * NOME: Facade
    Contexto: 
        Um Façade é um objeto que provê uma interface simplificada para um corpo de código maior,
        como por exemplo, uma biblioteca de classes. É do tipo estrutural.
    
    Resolve: 
        É usado quando existir um sistema complexo, na qual o cliente não precisa entender todo o sistema,
        já que possui um grande número de classes independentes ou se trechos de código
        fonte estão indisponíveis. Este padrão esconde as complexidades de um sistema
        maior e provê uma interface simplificada ao cliente. Tipicamente envolve uma única
        classe responsável por englobar uma série de membros requeridos pelo cliente.
        Estes membros acessam o sistema em nome do Façade e escondem os detalhes de implementação.
    
    Solução:
        Não evita que as aplicações possam acessar as subclasses diretamente, pode-se escolher entre a facilidade de uso ou a generalidade.
        Reduz a complexidade de uma api, liberando acesso a métodos de alto nível encapsulando os demais.
        Produz uma interface comum e simplificada.
        Pode encapsular uma ou mais interfaces mal projetadas em uma mais concisa.
        Reduz drasticamente o acoplamento entre as camadas do projeto.

    Interessante:
        com a aplicação do Padrão Facade não importa quantas classes tenhamos na visualização ou no negócio, elas sempre irão
        interagir por um único caminho, mantendo a arquitetura coerente bom baixo acoplamento e com alta manutenabilidade.

*/
package Passado;

public class Facade{
    public static void main(String[] args) {
        /*
            Pai:
            SistemasFacade.java

            Filhos:
            SistemaDeVideo.java
            SistemaDeAudio.java
            SistemaDeInput.java
        */
    }
}