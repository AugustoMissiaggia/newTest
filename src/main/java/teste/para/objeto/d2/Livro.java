package teste.para.objeto.d2;

public class Livro {
    String nome;
    String descricao;
    String autor;
    String isbn;
    double preco;
    String dataPub;

    void dadosLivro(){
        System.out.println("Nome do livro: "+nome);
        System.out.println("preço: "+preco);
        System.out.println("Autor: "+autor);
        System.out.println("Data de publicação: "+dataPub+"\n");
    }
}
