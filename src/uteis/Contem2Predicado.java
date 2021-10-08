package uteis;

import java.util.function.Predicate;

import modelo.Pessoa;

public class Contem2Predicado implements Predicate<Pessoa>{

    @Override
    public boolean test(Pessoa pessoa) {

        return pessoa.getNome().contains("2");
    }
    
}
