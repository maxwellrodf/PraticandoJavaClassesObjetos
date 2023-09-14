public class Conta {
    private String nome;
    private String endereço;
    private double saldo;

    public String getNome() {
        return nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public void sacar(double valorSaque){
        saldo = saldo - valorSaque;
    }



}
