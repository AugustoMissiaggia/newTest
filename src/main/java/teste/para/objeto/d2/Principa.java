package teste.para.objeto.d2;

public class Principa {
    public static void main(String[] args){
        Livro livro = new Livro();

        livro.nome ="Tf";
        livro.descricao = "Livro sobre Tf";
        livro.isbn = "29798247201";
        livro.preco = 89.90;
        livro.autor = "Desconhecido";
        livro.dataPub = "02/09/2011";

        livro.dadosLivro();
    }
}
