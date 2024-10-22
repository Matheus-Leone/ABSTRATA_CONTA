package utilidades;

//Classe que irá herdar o atributo de ContaBancária, tendo seus próprio Atributos também
public class ContaCorrente extends ContaBancaria {
    private double limite;
    private static final double TAXA_SAQUE = 2.0;
    private static final double TAXA_DEPOSITO = 0.5;
    private static final double TAXA_CONSULTA = 1.0;
    
//Construtor de ContaCorrente
    public ContaCorrente(double saldoInicial, double limite) {
        super(saldoInicial);
        this.limite = limite;
    }
    //Override para sobreescrever as informações já colocadas no mesmo método (saque)
    @Override
    public void saque(double valor) {
        if (valor > saldo + limite) {
            System.out.println("Saque não permitido: valor maior que o saldo + limite.");
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
