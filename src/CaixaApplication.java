import java.util.Scanner;

public class CaixaApplication {
  public static void main(String[] args) {
    CaixaComportamentos caixa = new CaixaComportamentos();
    Scanner ler = new Scanner(System.in);
    boolean sair = false;
    System.out.println("===============================================");
    System.out.println("Bem Vindo ao Caixa");
    System.out.println("===============================================");
    while(sair == false) {
      System.out.println("===============================================");
      System.out.println("Qual operação deseja realizar?");
      System.out.println("1- Consultar Saldo.");
      System.out.println("2- Sacar.");
      System.out.println("3- Depositar.");
      System.out.println("0- Sair.");
      System.out.println("===============================================");
      int op = ler.nextInt();
      switch(op) {
        case 1 -> // CONSULTAR SALDO
                caixa.consultarSaldo();
        case 2 -> // SACAR
                caixa.sacar();
        case 3 -> // DEPOSITAR
                caixa.depositar();
        default -> sair = true;
      }
    }
    System.out.println("===============================================");
    System.out.println("ATÉ LOGO");
    System.out.println("===============================================");
  }
}
