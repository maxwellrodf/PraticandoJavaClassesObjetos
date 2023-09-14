public class UsarConta {
    public static void main(String[] args) {
        Conta cliente1 = new Conta();

        cliente1.setNome("Maxwell");
        cliente1.setEndereço("Pedro Battani");
        cliente1.setSaldo(1000);
        cliente1.depositar(1000);
        cliente1.sacar(500);


        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Endereço: " + cliente1.getEndereço());
        System.out.println("Saldo R$: " + String.format("%.2f", cliente1.getSaldo()));

    }



}
