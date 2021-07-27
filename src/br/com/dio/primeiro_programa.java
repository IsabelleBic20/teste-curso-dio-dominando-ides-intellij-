package br.com.dio;

import br.com.dio.model.Gato;

public class primeiro_programa {
    public static void main(String[] args) {
       /* int a =5;
        int b = 3;
        System.out.println("Hello World " + (a+b));*/

      Gato gato = new Gato();
        System.out.println(gato);

        Livro livro = new Livro(nome: "O problema dos 3 corpos", numpag:300);
        System.out.println(livro);




   }
}

class Livro{
    private String nome;
    private Integer numpag;

    public Livro(String nome, Integer numpag) {
        this.nome = nome;
        this.numpag = numpag;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumpag() {
        return numpag;
    }

    public void setNumpag(Integer numpag) {
        this.numpag = numpag;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numpag=" + numpag +
                '}';
    }
}
