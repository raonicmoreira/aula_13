package uteis;

import java.util.Comparator;

import modelo.Pessoa;

public class ComparadorCpf implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa pessoa1, Pessoa pessoa2) {
        return pessoa1.getCpf().compareTo(pessoa2.getCpf());
    }
    
}
