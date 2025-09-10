import java.util.Scanner;



public class SistemaEscolar {

   

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

     

    // Declaração das variáveis para as 8 notas

    double[] notas = new double[8];

     

    // Entrada das 8 notas

    System.out.println("Digite as 8 notas anuais do aluno:");

    for (int i = 0; i < 8; i++) {

      System.out.print("Nota " + (i + 1) + ": ");

      notas[i] = sc.nextDouble();

    }



    // Cálculo das médias bimestrais

    double mediaBimestral1 = (notas[0] + notas[1]) / 2;

    double mediaBimestral2 = (notas[2] + notas[3]) / 2;

    double mediaBimestral3 = (notas[4] + notas[5]) / 2;

    double mediaBimestral4 = (notas[6] + notas[7]) / 2;

     

    // Cálculo das médias semestrais

    double mediaSemestral1 = (mediaBimestral1 + mediaBimestral2) / 2;

    double mediaSemestral2 = (mediaBimestral3 + mediaBimestral4) / 2;

     

    // Cálculo da média final

    double mediaFinal = (mediaSemestral1 + mediaSemestral2) / 2;

     

    // Exibição dos resultados

    System.out.println("\nMédias Bimestrais:");

    System.out.println("Bimestre 1: " + mediaBimestral1);

    System.out.println("Bimestre 2: " + mediaBimestral2);

    System.out.println("Bimestre 3: " + mediaBimestral3);

    System.out.println("Bimestre 4: " + mediaBimestral4);



    System.out.println("\nMédias Semestrais:");

    System.out.println("Semestre 1: " + mediaSemestral1);

    System.out.println("Semestre 2: " + mediaSemestral2);



    System.out.println("\nMédia Final: " + mediaFinal);

     

    // Fechar o scanner

    sc.close();

  }

}