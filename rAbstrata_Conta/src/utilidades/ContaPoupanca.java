package utilidades;

//Classe que irá herdar o atributo de ContaBancária, tendo seus próprio Atributos também
public class ContaPoupanca extends ContaBancaria {
    private static final double TAXA_SAQUE = 1.0;
    private static final double TAXA_DEPOSITO = 0.2;
    private static final double TAXA_CONSULTA = 0.5;

  //Construtor de ContaPoupanca
    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }
    
    //Override para sobreescrever as informações já colocadas no mesmo método (saque)
    @Override
    public void saque(double valor) {
        if (valor > saldo) {
            System.out.println("Saque não permitido: saldo insuficiente.");
        } else {
            saldo -= (valor + TAXA_SAQUE);
            System.out.println("Saque realizado com sucesso!");
        }
    }
    
    //Override para sobreescrever as informações já colocadas no mesmo método (deposito)
    @Override
    public void deposito(double valor) {
        saldo += (valor - TAXA_DEPOSITO);
        System.out.println("Depósito realizado com sucesso!");
    }
    
    //Override para sobreescrever as informações já colocadas no mesmo método (consulta)
    @Override
    public double consulta() {
        System.out.println("Consulta realizada com sucesso!");
        return saldo - TAXA_CONSULTA;
    }
}
