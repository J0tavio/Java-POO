package Banco;
public class AppBanco {
    public static void main(String[] args) {
      
        Banco pessoa1 = new Banco();
        pessoa1.setDono("Carlitos");
        pessoa1.numeroConta = 123;
        pessoa1.abrirConta("Conta corrente");
        pessoa1.depositar(300);
        pessoa1.sacar(350);
        pessoa1.fecharConta();

        Banco pessoa2 = new Banco();
        pessoa2.setDono("Marcola");
        pessoa2.numeroConta = 777;
        pessoa2.abrirConta("Conta poupança");
        pessoa2.depositar(500);
        pessoa2.sacar(100);

        pessoa1.estadoAtual();
        pessoa2.estadoAtual();
    }
}
