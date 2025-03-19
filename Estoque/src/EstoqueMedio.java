import java.util.Scanner;

public class EstoqueMedio {
    public static void main(String [] args){
        double estoqueMedio;
        int qntdMinima, qntdMaxima;
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas peças você comprou: ");
        qntdMaxima = sc.nextInt();

        System.out.println("Qual a quantidade minima de peças: ");
        qntdMinima = sc.nextInt();

        estoqueMedio = (qntdMinima + qntdMaxima) / 2;
        System.out.println("O estoque medio de peças: " + estoqueMedio);
    }
}
