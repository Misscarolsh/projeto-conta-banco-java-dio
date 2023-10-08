import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
     try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
        System.out.println("Digite seu nome");
         String nome = scanner.next();

         System.out.println("Digite o numero da conta");
         int conta = scanner.nextInt();

         System.out.println("Digite o numero de sua agencia");
         String agencia = scanner.next();

         System.out.println("Me informe o seu saldo atual");
         double saldo = scanner.nextDouble();



         System.out.println(" Ola," + nome);
         System.out.println(" Obrigado por criar uma conta em nosso banco sua conta e " + conta );
         System.out.println(" Sua agencia e " + agencia);
         System.out.println(" E seu saldo " + saldo );
         System.out.println("Ja esta disponivel para saque");
         


    }






    }
}
