
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    Integer numero;
    String agencia;
    String nomeCliente;
    Double saldo;

    public ContaTerminal(Integer numero, String agencia, String nomeCliente, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        

        ContaTerminal dados = new ContaTerminal(1234, " ", "Vanessa", 150.69);

        System.out.println("Por favor, digite o número da Agência: ");
        dados.agencia = sc.nextLine();
        System.out.println("Digite seu nome: ");
        dados.nomeCliente = sc.nextLine();
        System.out.println("Digite o numero da conta: ");
        dados.numero = sc.nextInt();
        System.out.println("Digite o saldo bancario: ");
        dados.saldo = sc.nextDouble();

        System.out.println(" Olá,"+dados.nomeCliente+ " obrigado por criar uma conta em nosso banco, sua agência é " +dados.agencia+ " conta "+ dados.numero+  " e seu saldo "+dados.saldo+" já está disponível para saque. ");


        sc.close();


    }
    
}
