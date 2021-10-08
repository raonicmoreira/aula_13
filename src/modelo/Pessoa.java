package modelo;

public abstract class Pessoa implements Comparable<Pessoa>{

    private String nome;
    private String cpf;
    private double salario;

    
    public Pessoa(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }


    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + "]";
    }

    @Override
    public int compareTo(Pessoa outraPessoa){
        return getNome().compareTo(outraPessoa.getNome());
    }
    
}
