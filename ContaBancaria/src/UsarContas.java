import java.text.DecimalFormat;

public class UsarContas {
    public static void main(String[] args) {
        ContaCorrente clienteCorrente1 = new ContaCorrente("Maxwell", 123, 1000);
        clienteCorrente1.depositar(10000);
        clienteCorrente1.sacar(500);
        DecimalFormat formatar = new DecimalFormat("0.00");
        System.out.println("O saldo da conta corrente de " + clienteCorrente1.nome + " é de R$: " + formatar.format(clienteCorrente1.saldo));

        ContaPoupanca clientePoupanca1 = new ContaPoupanca("João", 456, 2500);
        clientePoupanca1.depositar(1000);
        clientePoupanca1.sacar(20);
        DecimalFormat format = new DecimalFormat("0.00");
        System.out.println("O saldo da conta poupanca de " + clientePoupanca1.nome + " é de R$: " + format.format(clientePoupanca1.saldo));

    }



}
