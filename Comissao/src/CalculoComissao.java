import java.math.BigDecimal;

public class CalculoComissao {
    public static void comissaoAcionada(BigDecimal precoUnitario, int quantidadeVendida){
        BigDecimal valorComComissao, valorTotal;
        double percentual = 0.05;

        valorTotal = precoUnitario.multiply(BigDecimal.valueOf(quantidadeVendida));
        valorComComissao = valorTotal.multiply(BigDecimal.valueOf(percentual));

        System.out.println("Vendeu " + quantidadeVendida + " peças com o preço de: R$" + precoUnitario + " cada uma. Ficando assim o valor total de: R$" + valorTotal + "!");
        System.out.println("Com essas informações, o valor total junto com a comissão de 5% ficou: R$" + valorComComissao + "!");
    }
}
