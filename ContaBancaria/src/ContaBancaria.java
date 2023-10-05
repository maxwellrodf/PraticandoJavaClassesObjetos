public class ContaBancaria {
    public String nome;
    public int cpf;
    public double saldo;

    //UTILIZANDO ATRIBUTOS PUBLICOS E CONSTRUTORES

    public ContaBancaria(String nome, int cpf, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    public void depositar(double depositarValor){
        this.saldo = saldo + depositarValor;

    }

    public void sacar(double sacarValor){
        this.saldo = saldo - sacarValor;
    }
}










