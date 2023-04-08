import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    double valorHoraTrabalhada;
    double horaTrabalhada;
    double salarioMensal;

    System.out.println("Informe o valor que ganha por hora trabalhada:");
    Scanner valorHora = new Scanner(System.in);
    valorHoraTrabalhada = valorHora.nextDouble();
    System.out.println("O valor que você ganha por hora trabalhada é: " + valorHoraTrabalhada);

    System.out.println("Informe quantas horas você trabalha ao mês: ");
    Scanner tempoTrabalho = new Scanner(System.in);
    horaTrabalhada = tempoTrabalho.nextDouble();
    System.out.println("O seu tempo de trabalho ao mês é: " + horaTrabalhada);

    salarioMensal = valorHoraTrabalhada * horaTrabalhada;
    System.out.println("O valor que você ganha ao mês é: " + salarioMensal);
    
  }
}