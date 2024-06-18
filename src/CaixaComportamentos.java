import java.util.Scanner;

public class CaixaComportamentos {
  CaixaModel caixa = new CaixaModel();

  public void consultarSaldo() {
    System.out.println("Seu saldo: R$" + caixa.getSaldo());
  }

  public void sacar() {
    Scanner ler = new Scanner(System.in);
    if (caixa.getSaldo() <= 0) {
      System.out.println("Saldo Insuficiente");
      System.out.println("Saque disponivel somente para contas não vazias");
      System.out.println("Tente quando tiver dinheiro");
    } else {
      System.out.print("Digite o valor para saque: ");
      float valorSacar = ler.nextFloat();
      if(valorSacar > caixa.getSaldo()) {
        System.out.println("Não é possível fazer um saque maior que o saldo atual");
      } else {
        // caixa.saldo = caixa.saldo - valorSacar
        caixa.setSaldo(caixa.getSaldo() - valorSacar);
        System.out.println("Voce sacou R$" + valorSacar);
        System.out.println("E seu saldo atual e de: R$" + caixa.getSaldo());
      }
    }
  }

  public void depositar() {
    Scanner ler = new Scanner(System.in);
    System.out.print("Digite o valor para deposito: ");
    float valorDepositar = ler.nextFloat();
    if(valorDepositar <= 0 || valorDepositar > 100000) {
      System.out.println("Valor não permitido para deposito");
    } else {
      caixa.setSaldo(caixa.getSaldo() + valorDepositar);
      System.out.println("Voce depositou R$" + valorDepositar);
      System.out.println("E seu saldo atual e de: R$" + caixa.getSaldo());
    }
  }
}
