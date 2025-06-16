import java.util.Scanner;

class ContaBancaria{
    private int numeroDaConta;
    private double saldoConta;
    Scanner scanner = new Scanner(System.in);

    ContaBancaria(int numeroDaConta, double saldoConta){
        this.numeroDaConta = numeroDaConta;
        this.saldoConta = saldoConta;
    }

    public void mostrarDadosConta(){
        System.out.println("Numero da Conta: " + this.numeroDaConta);
        System.out.println("Saldo da Conta: " + getSaldo());
    }

    public double getSaldo(){
        return this.saldoConta;
    }

    public void setDeposito(){
        System.out.println("Digite o valor do deposito: ");
        double novoDeposito = scanner.nextDouble();
        if (novoDeposito > 0) {
            this.saldoConta += novoDeposito;
            System.out.println("Deposito realizado com sucesso.");
            System.out.println("Novo Saldo: "+ getSaldo());
        }
    }

    public void sacarSaldo(){
        System.out.println("Digite o valor do saque: ");
        double novoValorSaque = scanner.nextDouble();
        if (novoValorSaque > 0 && getSaldo() >= novoValorSaque) {
            this.saldoConta -= novoValorSaque;
            System.out.println("Saque realizado com sucesso.\n");
            System.out.println("Novo saldo: "+ getSaldo());  
        }else{
            System.out.println("Valor Invalido para saque.");
        }
    }


    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(123434,345.0d);

        conta.setDeposito();
        conta.mostrarDadosConta();
        conta.sacarSaldo();
        conta.mostrarDadosConta();



    }
}
