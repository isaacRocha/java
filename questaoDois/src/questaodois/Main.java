package questaodois;

import classes.*;

public class Main {

    public static void main(String[] args) {

        Emprestimo emprestimo = new Emprestimo();

        emprestimo.livro = new Livro();
        emprestimo.pessoa = new Pessoa();

        emprestimo.pessoa.nome = "isaac rocha";
        emprestimo.pessoa.email = "i@gmail.com";
        emprestimo.pessoa.endereco = " Q 2 lote 12 ";
        emprestimo.pessoa.telefone = "9999999999";
        emprestimo.dataEmprestimo = "24/11/2020";
        emprestimo.dataDevolucaoEmprestimo = "15/12/2020";

        emprestimo.livro.nome = "java";
        emprestimo.livro.autor = "eu";
        emprestimo.livro.isbn = "1111-111-2";

        System.out.println("Biblioteca");
        System.out.println("-----------------------");
        System.out.println("Nome do Livro: " + emprestimo.livro.nome);
        System.out.println("Autor: " + emprestimo.livro.autor);
        System.out.println("ISBN: " + emprestimo.livro.isbn);
        System.out.println("-----------------------");
        System.out.println("Data de devolução: " + emprestimo.dataDevolucaoEmprestimo);
        System.out.println("Data de emprestimo: " + emprestimo.dataEmprestimo);
        System.out.println("-----------------------");
        System.out.println("Nome Cliente: " + emprestimo.pessoa.nome);
        
    }

}
