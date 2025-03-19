import java.math.BigDecimal;
import java.util.Scanner;

public class Comissao{
    public static void main(String [] args){
        /*
        Faça um programa para pagamento de comissão de vendedores de peças, levando-se em consideração que sua
        comissão será de 5% do total da venda e que você tem os seguintes dados:
        - Identificação do vendedor
        - Código da peça
        - Preço unitário da peça
        - Quantidade vendida
         */

        CalculoComissao calculo = new CalculoComissao();

        int id, codigoDaPeca, quantidadeVendida;
        BigDecimal precoUnitario;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nPagamentos de Comissões \n");

        System.out.println("Funcionário, identifique-se com seu id: ");
        id = sc.nextInt();

        System.out.println("Digite o código da peça: ");
        codigoDaPeca = sc.nextInt();

        System.out.println("Digite o preço unitário: ");
        precoUnitario = sc.nextBigDecimal();

        System.out.println("Informe a quantidade vendida: ");
        quantidadeVendida = sc.nextInt();

        System.out.println("O funcionario com o id " + id + ", com o código da peça informado: " + codigoDaPeca);

        CalculoComissao.comissaoAcionada(precoUnitario,quantidadeVendida);
    }
}