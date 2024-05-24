import java.util.Scanner; 
    
public class ContaBancaria {
    public static void main(String[] args) {
 
    Scanner scanner = new Scanner (System.in); 
    
    System.out.println("Digite seu nome: ");
    String nome = scanner.nextLine();
    
    System.out.println("Digiteo numero da sua agencia: ");
    String agencia = scanner.nextLine() ;
    
    
    int numero = 1010;
    

    double saldo = 571.8 ;
    
    System.out.println("Olá "+ nome + ", obrigado por criar uma conta em nossa agencia, sua agencia é " + agencia + ", conta " + numero + " e seu saldo " + saldo+" ja esta disponivel para saque.");

    
       
    scanner.close();
    }        
}