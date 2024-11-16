//TO DO:Conhecer e importar a classe Scanner - Atendido!
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        //Exibir as mensagens para o nosso usuário - Atendido!
        Scanner scanner = new Scanner (System.in);

        System.out.println("Seja Bem-Vindo!");
        System.out.println("Sistema Banco CLARDIO");

        //Obter pela scanner os valores digitados no terminal
        System.out.print("Por favor, digite o número da Conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Número da Agência: ");
        String agencia = scanner.next();

        System.out.print("Qual seu primeiro nome? ");
        String nomeCliente = scanner.next();

        System.out.print("Qual seu ultimo sobrenome? ");
        String sobrenomeCliente = scanner.next();

        System.out.print("Qual o saldo inicial (R$)? ");
        double saldo = scanner.nextDouble();

         //Exibir a mensagem conta criada=Atendido!
        System.out.print("----------------------------|  Saudaçoes! |----------------------------------");
        System.out.print("\nPrezado (a) Senhor (a) " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco. " +
        "\nSua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$ " + saldo +
        " já disponível para saque imediato.\nTenha um ótimo dia! ");        

        System.out.println("\n------------------------------------------------------------------------");
        
            

    
        scanner.close();
    }
}