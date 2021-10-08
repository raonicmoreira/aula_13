package uteis;

import java.util.Comparator;

import modelo.Pessoa;

public class ComparadorNomeSobrenome implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa pessoa1, Pessoa pessoa2) {

        String[] nomes = pessoa1.getNome().split(" ");
        String sobrenome1 = nomes[nomes.length - 1] + nomes[0];

        nomes = pessoa2.getNome().split(" ");
        String sobrenome2 = nomes[nomes.length - 1] + nomes[0];

        return sobrenome1.compareTo(sobrenome2);
    }
    
}
