import java.util.ArrayList;
import java.util.List;

import modelo.Motorista;
import modelo.Passageiro;
import modelo.Pessoa;
import uteis.ComparadorCpf;
import uteis.ComparadorNomeSobrenome;
import uteis.Contem2Predicado;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Motorista("joão silva", "999", 100));
        pessoas.add(new Motorista("Maria almeida 2", "333", 150));
        pessoas.add(new Motorista("Gustavo silviano", "222", 123));
        pessoas.add(new Passageiro("Juliana motta 2", "111", 330));
        pessoas.add(new Passageiro("Andre andrade", "000", 123));
        pessoas.add(new Passageiro("Gabriela oliveira", "444", 333));
        

        System.out.println("Lista original");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        System.out.println("-------------------------------------------");
        pessoas.sort(null);
        System.out.println("Lista ordenada por nome");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        System.out.println("-------------------------------------------");
        pessoas.sort(new ComparadorCpf());
        System.out.println("Lista ordenado por CPF");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        System.out.println("-------------------------------------------");
        pessoas.sort(new ComparadorNomeSobrenome());
        System.out.println("Lista ordenado por sobrenome");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }


        // calculando salario medio das pessoas
        System.out.println("-------------------------------------------");
        double salarioTotal = 0;
        double salarioMax = 0;
        double salariaMin = 999999999;
        for (Pessoa pessoa : pessoas) {
            salarioTotal = salarioTotal + pessoa.getSalario();
            if(pessoa.getSalario() > salarioMax){
                salarioMax = pessoa.getSalario();
            }
            if(pessoa.getSalario() < salariaMin){
                salariaMin = pessoa.getSalario();
            }
        }
        System.out.println("salario medio = " + salarioTotal / pessoas.size());
        System.out.println("salario maximo = " + salarioMax);
        System.out.println("salario minimo = "+ salariaMin);




        System.out.println("-------------------------------------------");
        pessoas.removeIf(new Contem2Predicado());
        System.out.println("Lista de pessoas após o removeIf com predicado");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        System.out.println("-------------------------------------------");
        pessoas.removeIf(p -> p.getNome().contains("2"));
        System.out.println("Lista de pessoas após o removeIf com lambda");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        String buscaCPF = "000";
        for (Pessoa pessoa : pessoas) {
            if(pessoa.getCpf() == buscaCPF){
                System.out.println(pessoa);
            }
        }






    }
}
