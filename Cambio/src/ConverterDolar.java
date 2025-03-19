import java.math.BigDecimal;

public class ConverterDolar {
    public static void converterDolar(BigDecimal valorDolar, BigDecimal cotacaoDolar){
        BigDecimal valorEmReal;

        valorEmReal = valorDolar.multiply(cotacaoDolar);

        System.out.println("O Valor $" + valorDolar + " Dolares com a cotação atual de: " + cotacaoDolar + " ficou R$" + valorEmReal + " Reais!");
    }
}
