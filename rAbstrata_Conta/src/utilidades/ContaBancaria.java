package utilidades;

//SuperClasse que irá repassar seus Atributos para outras classes, possui alto nivel de abstração para que não seja instanciada
public abstract class ContaBancaria {
    protected double saldo;
    
//Construtor da classe ContaBancária
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    
//Criação de métodos abstratos pois o valor e a forma de como serão feitos será sempre diferente 
    public abstract void saque(double valor);
    public abstract void deposito(double valor);
    public abstract double consulta();
    
//Define e Puxa o Dado quando necessário
    public double getSaldo() {
        return saldo;
    }
}
