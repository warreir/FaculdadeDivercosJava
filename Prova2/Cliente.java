package Prova2;
class Cliente{
    int id;
    String nome;
    String dataNascimento;
    String cpf;
    int dias;
    int filmesLocados;
    Locacao locacao;

    Cliente(int id, String nome, String dataNascimento, String cpf, int dias){
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.dias = dias;
        this.filmesLocados = 0;
    }
    public void retornaDados(){
        System.out.println("Id:"+this.id);
        System.out.println("Nome:"+this.nome);
        System.out.println("Nascido em:"+this.dataNascimento);
        System.out.println("Cpf :"+this.cpf);
        System.out.println("Dias para devolução:"+this.dias);
        System.out.println("Qtde Filmes Locados:"+this.filmesLocados);
    }
}