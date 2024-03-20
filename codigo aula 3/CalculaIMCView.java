import java.util.Scanner;
import Pessoa;

public class CalculaIMCView {
    public static void main(String args[]) {
      
      Pessoa pessoa = new Pessoa();
      
      System.out.println("Digite o Peso: ");
      Scanner input01 = new Scanner(System.in);
      double pesoDouble = input01.nextDouble();
      pessoa.setPeso = (pesoDouble);
      
      System.out.println("Digite a Altura: ");
      Scanner input02 = new Scanner(System.in);
      double alturaDouble = input02.nextDouble();
      pessoa.setAltura = (alturaDouble);
      
      double imc = pessoa.calcularIMC();
      
      System.out.println("Peso    => " + String.format("%.2f", pessoa.getPeso()));
      System.out.println("Altura  => " + String.format("%.2f", pessoa.getAltura()));
      System.out.println("IMC  = " + String.format("%.2f", imc));
      
      pessoa.informarIMC(imc);
    }
}