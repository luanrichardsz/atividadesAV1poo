public class Soma {
    public static void Somar(int A, int B, int C, int D){
        /*
        se forem lidas as variáveis A, B, C e
        D, devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, B com D e por
        último C com D.

        A + B
        A + C
        A + D
        B + C
        B + D
        C + D
         */

        int soma1 = A + B;
        int soma2 = A + C;
        int soma3 = A + D;
        int soma4 = B + C;
        int soma5 = B + D;
        int soma6 = C + D;

        System.out.println("\nA + B = " + soma1);
        System.out.println("A + C = " + soma2);
        System.out.println("A + D = " + soma3);
        System.out.println("B + C = " + soma4);
        System.out.println("B + D = " + soma5);
        System.out.println("C + D = " + soma6);
    }
}

