public class Main {
    public static void main(String[] args) {
        Cliente vinicius = new Cliente();
        vinicius.setNome("Vinícius");

        Conta ccorrente = new ContaCorrente(vinicius);
        ccorrente.depositar(100);
        Conta cpoupanca = new ContaPoupanca(vinicius);

        ccorrente.transferir(25, cpoupanca);

        ccorrente.imprimirExtrato();
        cpoupanca.imprimirExtrato();
    }
}
