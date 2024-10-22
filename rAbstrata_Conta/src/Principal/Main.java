package Principal;

//Import para buscar os métodos de outras classes
import utilidades.ContaBancaria;
import utilidades.ContaCorrente;
import utilidades.ContaPoupanca;

//Método principal para testar tudo que foi configurado
public class Main {
    public static void main(String[] args) {
        ContaBancaria contaCorrente = new ContaCorrente(1000.0, 500.0);
        ContaBancaria contaPoupanca = new ContaPoupanca(2000.0);

        contaCorrente.deposito(200);
        contaCorrente.saque(1500);
        System.out.println("Saldo Conta Corrente: " + contaCorrente.consulta());

        contaPoupanca.deposito(300);
        contaPoupanca.saque(2500);
        System.out.println("Saldo Conta Poupança: " + contaPoupanca.consulta());
    }
}
