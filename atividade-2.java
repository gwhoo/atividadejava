import java.util.Scanner;



public class ConversaoTemperatura {



  public static void main(String[] args) {

    // Criando o scanner para ler a entrada do usuário

    Scanner sc = new Scanner(System.in);

     

    // Solicita ao usuário a temperatura em Celsius

    System.out.print("Digite a temperatura em Celsius: ");

    double celsius = sc.nextDouble();

     

    // Realiza as conversões

    double fahrenheit = (celsius * 9/5) + 32;

    double kelvin = celsius + 273.15;

     

    // Exibe os resultados

    System.out.println("\nTemperatura original: " + celsius + "°C");

    System.out.println("Equivalente em Fahrenheit: " + fahrenheit + "°F");

    System.out.println("Equivalente em Kelvin: " + kelvin + " K");

     

    // Fecha o scanner

    sc.close();

  }

}