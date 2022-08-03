public class Main {
    public static void main (String[] args) {

        Cliente carolina = new Cliente();
        carolina.setNome("Carolina");

        IConta cc = new ContaCorrente(carolina);
        cc.depositar(100);

        IConta poupanca = new ContaPoupanca(carolina);

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
